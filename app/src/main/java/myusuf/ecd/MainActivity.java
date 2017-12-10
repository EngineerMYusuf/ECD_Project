package myusuf.ecd;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    private static boolean read;
    private static int bite4I = 0;
    private static int bite3 = 0;
    private static int bite2 = 0;
    private static double bite4D;

    public static boolean getRead()
    {
        return read;
    }



    public void sendByte(int integer){
        sendLine sendTask = new sendLine();
        String binaryString = Integer.toBinaryString(0x100 | integer).substring(1);
        String firstQuarter = "10,7" + binaryString.charAt(0) + ",8" + binaryString.charAt(1) + ",11";
        String secondQuarter = "10,7" + binaryString.charAt(2) + ",8" + binaryString.charAt(3) + ",11";
        String thirdQuarter = "10,7" + binaryString.charAt(4) + ",8" + binaryString.charAt(5) + ",11";
        String fourthQuarter = "10,7" + binaryString.charAt(6) + ",8" + binaryString.charAt(7) + ",11";
        sendTask.execute("w", firstQuarter);
        waitForAck();
        sendTask.execute("w", secondQuarter);
        waitForAck();
        sendTask.execute("w", thirdQuarter);
        waitForAck();
        sendTask.execute("w", fourthQuarter);
        waitForAck();
    }

    public String readByte(){
        int done = 0;
        sendLine readTask = new sendLine();
        AsyncTask<String, String, Integer> pinState;
        String firstBit;
        String secondBit;
        String message = "";
        Context context = getApplicationContext();
        CharSequence text;
        Toast toast;
        int duration = Toast.LENGTH_SHORT;
        while (done < 4) {
            pinState = readTask.execute("r","2");
            while (pinState.equals(2)) {
                pinState = readTask.execute("r", "2");
                text = "waiting";
                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            firstBit = readTask.execute("r","7").toString();
            text = firstBit;
            toast = Toast.makeText(context, text, duration);
            toast.show();
            secondBit = readTask.execute("r","8").toString();
            text = secondBit;
            toast = Toast.makeText(context, text, duration);
            toast.show();
            message += message + firstBit + secondBit;
            text = message;
            toast = Toast.makeText(context, text, duration);
            toast.show();
            readTask.execute("w","11");
            while (pinState.equals(1)) {
                pinState = readTask.execute("r", "2");
            }
            readTask.execute("w","10");
            done++;
        }
        return message;
    }
    class ReadThread extends Thread
    {
        public void run()
        {
            while(MainActivity.getRead())
            {
                //Byte 1 (hello)
                int bite1 = Integer.parseInt(readByte(),2);
                if(bite1 == 0){

                    //Byte 2 (Source)
                    bite2 = Integer.parseInt(readByte(),2);

                    //Byte 3 (Type)
                    bite3 = Integer.parseInt(readByte(),2);

                    //Byte 4 (Data)
                    bite4D = 0;
                    bite4I = 0;
                    if(bite3 == 1) {
                        bite4D = (double) Integer.parseInt(readByte(), 2);
                        bite4D = bite4D/10;
                    }
                    else{
                        bite4I = Integer.parseInt(readByte(), 2);
                        bite4I = bite4I/10;

                    }
                }
            }
        }
    }

    public void waitForAck(){
        sendLine ackTask = new sendLine();
        // TODO Async<String,String,Integer> to Integer comparison may cause problems
        AsyncTask<String, String, Integer> pinState = ackTask.execute("r","2");
        while (pinState.equals(0)) {
            pinState = ackTask.execute("r", "2");
        }
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView temp1 = (TextView) findViewById(R.id.setTemp1);
        TextView temp2 = (TextView) findViewById(R.id.setTemp2);
        TextView hum1 = (TextView) findViewById(R.id.setHum1);
        TextView hum2 = (TextView) findViewById(R.id.setHum2);
        temp1.setText("--°C");
        temp2.setText("--°C");
        hum1.setText("--%");
        hum2.setText("--%");

        if(bite2 == 1){
            String txt = Double.toString(bite4D) +"°C";
            temp1.setText(txt);
        }
        else if(bite2 == 2){
            String txt = Double.toString(bite4D) +"°C";
            temp2.setText(txt);
        }
        else if(bite2 == 3){
            String txt = Integer.toString(bite4I) +"%";
            hum1.setText(txt);
        }
        else if(bite2 == 4){
            String txt = Integer.toString(bite4I) +"%";
            hum2.setText(txt);
        }
        Button setHum1 = (Button) findViewById(R.id.getHum1);
        setHum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread t = new ReadThread();
                read = false;

                // Send Start Byte
                sendByte(255);
                // Send Destination
                // 3rd Node
                sendByte(3);
                // Send Data Type
                // Command
                sendByte(2);
                // Send Data
                // Water
                sendByte(15);
                read = true;
                t.start();
            }
        });
        Thread t = new ReadThread();
        read = true;
        t.start();
        Button setHum2 = (Button) findViewById(R.id.getHum2);
        setHum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread t = new ReadThread();
                read = false;

                // Send Start Byte
                sendByte(255);
                // Send Destination
                // 4th Node
                sendByte(4);
                // Send Data Type
                // Command
                sendByte(2);
                // Send Data
                // Water
                sendByte(15);
                read = true;
                t.start();
            }
        });


    }



    public static class sendLine extends AsyncTask<String,String,Integer> {

        @Override
        protected Integer doInBackground(String... params) {
            return SendCommandtoARest(params[0]);
        }
        int SendCommandtoARest(String CmdString) {
            URL urlSend;
            InputStream inputStream;
            String result = "";
            try {

                // create HttpClient
                HttpClient httpclient = new DefaultHttpClient();

                // make POST request to the given URL
                HttpPost httpPost;

                HttpResponse httpResponse;

                List<String> cmdList = Arrays.asList(CmdString.trim().split(","));
                String rw = cmdList.get(0);
                cmdList.remove(0);
                label:
                for (String eachCmd : cmdList) {
                    switch (rw) {
                        case "w":
                            urlSend = new URL("192.168.137.5/" + "/digital/" + eachCmd.substring(0, eachCmd.length() - 1) + "/" + eachCmd.substring(eachCmd.length() - 1));
                            break;
                        case "r":
                            urlSend = new URL("192.168.137.5/" + "/digital/" + eachCmd);
                            break;
                        default:
                            break label;
                    }
                    httpPost = new HttpPost(String.valueOf(urlSend));
                    // Set some headers to inform server about the type of the content
                    httpPost.setHeader("Accept", "application/json");
                    httpPost.setHeader("Content-type", "application/json");

                    // Execute POST request to the given URL
                    httpResponse = httpclient.execute(httpPost);
                    // receive response as inputStream
                    inputStream = httpResponse.getEntity().getContent();
                    // convert inputstream to string
                    if (inputStream != null) {
                        result += convertInputStreamToString(inputStream) + "\n";
                    } else {
                        result += "Did not work at : " + eachCmd + "\n";
                    }
                    if(rw.equals("r")) {
                        JSONObject jObject = new JSONObject(result);
                        int message = jObject.getInt("return_value");
                        return message;
                    }
                }


            } catch (MalformedURLException ex) {
                Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);

            } catch (IOException ex) {
                Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);

            } catch (JSONException e) {
                e.printStackTrace();
            }
            return 2;
        }


        public String convertInputStreamToString(InputStream inputStream) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            String result = "";
            while ((line = bufferedReader.readLine()) != null) {
                result += line;
            }

            inputStream.close();
            return result;

        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

