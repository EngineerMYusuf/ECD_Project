package myusuf.ecd;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

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

    // TL;DR
    // Simply, we need to simulate a person typing these urls in a specific order into a web browser and hitting enter
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final MyTask f4pos10Task = new MyTask();
        final MyTask f4pos5Task = new MyTask();
        final MyTask f40Task = new MyTask();
        final MyTask f4neg5Task= new MyTask();
        final MyTask f3pos10Task= new MyTask();
        final MyTask f3pos5Task= new MyTask();
        final MyTask f30Task= new MyTask();
        final MyTask f3neg5Task= new MyTask();
        final MyTask f2pos10Task= new MyTask();
        final MyTask f2pos5Task= new MyTask();
        final MyTask f20Task= new MyTask();
        final MyTask f2neg5Task= new MyTask();
        final MyTask f1pos10Task= new MyTask();
        final MyTask f1pos5Task= new MyTask();
        final MyTask f10Task= new MyTask();
        final MyTask f1neg5Task= new MyTask();
        final MyTask makeoutputs= new MyTask();

        // Each pin is set to be an output pin
        makeoutputs.execute("1o,2o,3o,4o");

        // When each button is pressed, a specific combination of http requests are sent
        Button f4pos10 = (Button) findViewById(R.id.f4pos10);
        f4pos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f4pos10Task = new MyTask();
                System.out.println(f4pos10Task.execute("11,21,31,41"));

            }
        });

        Button f4pos5 = (Button) findViewById(R.id.f4pos5);
        f4pos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f4pos5Task = new MyTask();
                System.out.println(f4pos5Task.execute("11,21,31,40"));

            }
        });

        Button f40 = (Button) findViewById(R.id.f40);
        f40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f40Task = new MyTask();
                System.out.println(f40Task.execute("11,21,30,41"));

            }
        });

        Button f4neg5 = (Button) findViewById(R.id.f4neg5);
        f4neg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f4neg5Task = new MyTask();
                System.out.println(f4neg5Task.execute("11,21,30,40"));

            }
        });

        Button f3pos10 = (Button) findViewById(R.id.f3pos10);
        f3pos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f3pos10Task= new MyTask();
                System.out.println(f3pos10Task.execute("11,20,31,41"));

            }
        });

        Button f3pos5 = (Button) findViewById(R.id.f3pos5);
        f3pos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f3pos5Task = new MyTask();
                System.out.println(f3pos5Task.execute("11,20,31,40"));

            }
        });

        Button f30 = (Button) findViewById(R.id.f30);
        f30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f30Task = new MyTask();
                System.out.println(f30Task.execute("11,20,30,41"));

            }
        });

        Button f3neg5 = (Button) findViewById(R.id.f3neg5);
        f3neg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f3neg5Task = new MyTask();
                System.out.println(f3neg5Task.execute("11,20,30,40"));

            }
        });

        Button f2pos10 = (Button) findViewById(R.id.f2pos10);
        f2pos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f2pos10Task = new MyTask();
                System.out.println(f2pos10Task.execute("10,21,31,41"));

            }
        });

        Button f2pos5 = (Button) findViewById(R.id.f2pos5);
        f2pos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f2pos5Task = new MyTask();
                System.out.println(f2pos5Task.execute("10,21,31,40"));

            }
        });

        Button f20 = (Button) findViewById(R.id.f20);
        f20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f20Task = new MyTask();
                System.out.println(f20Task.execute("10,21,30,41"));

            }
        });

        Button f2neg5 = (Button) findViewById(R.id.f2neg5);
        f2neg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f2neg5Task = new MyTask();
                System.out.println(f2neg5Task.execute("10,21,30,40"));

            }
        });

        Button f1pos10 = (Button) findViewById(R.id.f1pos10);
        f1pos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f1pos10Task = new MyTask();
                System.out.println(f1pos10Task.execute("10,20,31,41"));

            }
        });

        Button f1pos5 = (Button) findViewById(R.id.f1pos5);
        f1pos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f1pos5Task = new MyTask();
                System.out.println(f1pos5Task.execute("10,20,31,40"));

            }
        });

        Button f10 = (Button) findViewById(R.id.f10);
        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f10Task = new MyTask();
                System.out.println(f10Task.execute("10,20,30,41"));

            }
        });

        Button f1neg5 = (Button) findViewById(R.id.f1neg5);
        f1neg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f1neg5Task = new MyTask();
                System.out.println(f1neg5Task.execute("10,20,30,40"));

            }
        });

        Button rock = (Button) findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f1pos5Task = new MyTask();
                MyTask f20Task = new MyTask();
                MyTask f30Task = new MyTask();
                MyTask f4pos5Task = new MyTask();
                System.out.println(f1pos5Task.execute("10,20,31,40"));
                System.out.println(f20Task.execute("10,21,30,41"));
                System.out.println(f30Task.execute("11,20,30,41"));
                System.out.println(f4pos5Task.execute("11,21,31,40"));
            }
        });


        Button jazz = (Button) findViewById(R.id.jazz);
        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f1pos5Task = new MyTask();
                MyTask f20Task = new MyTask();
                MyTask f3neg5Task = new MyTask();
                MyTask f40Task= new MyTask();

                System.out.println(f1pos5Task.execute("10,20,31,40"));
                System.out.println(f20Task.execute("10,21,30,41"));
                System.out.println(f3neg5Task.execute("11,20,30,40"));
                System.out.println(f40Task.execute("11,21,30,41"));
            }
        });

        Button metal = (Button) findViewById(R.id.metal);
        metal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f10Task = new MyTask();
                MyTask f2pos10Task = new MyTask();
                MyTask f3pos10Task = new MyTask();
                MyTask f40Task = new MyTask();

                System.out.println(f10Task.execute("10,20,30,41"));
                System.out.println(f2pos10Task.execute("10,21,31,41"));
                System.out.println(f3pos10Task.execute("11,20,31,41"));
                System.out.println(f40Task.execute("11,21,30,41"));
            }
        });
        Button pop = (Button) findViewById(R.id.pop);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTask f10Task = new MyTask();
                MyTask f2pos5Task = new MyTask();
                MyTask f3pos5Task = new MyTask();
                MyTask f40Task = new MyTask();

                f10Task.execute("10,20,30,41");
                f2pos5Task.execute("10,21,31,40");
                f3pos5Task.execute("11,20,31,40");
                f40Task.execute("11,21,30,41");
            }
        });

    }
    public class MyTask extends AsyncTask<String,String,String> {

        @Override
        protected String doInBackground(String... params) {
            return SendCommandtoARest(params[0]);
        }
        String SendCommandtoARest(String CmdString) {
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
                for (String eachCmd : cmdList) {
                    if (eachCmd.substring(eachCmd.length() - 1).equals("o")) {
                        urlSend = new URL("https://cloud.arest.io/" + "21402399" + "/mode/" + eachCmd.substring(0, eachCmd.length() - 1) + "/o");
                        System.out.println(urlSend);
                    }

                    else{
                        urlSend = new URL("https://cloud.arest.io/" + "21402399" + "/digital/" + eachCmd.substring(0, eachCmd.length() - 1) + "/" + eachCmd.substring(eachCmd.length() - 1));
                        System.out.println(urlSend);
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
                }

            } catch (MalformedURLException ex) {
                Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                return "Error : " + ex.getLocalizedMessage();
            } catch (IOException ex) {
                Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, null, ex);
                return "Error : " + ex.getLocalizedMessage();
            }
            return result;
        }


        public String convertInputStreamToString(InputStream inputStream) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
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
