package myusuf.ecd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    // url inputs to turn pins into outputs,0's and 1's
    // TODO your_unique_id parts are to be filled later
    URL url1 = new URL("https://cloud.arest.io/your_unique_id/mode/1/o");
    URL url2 = new URL("https://cloud.arest.io/your_unique_id/mode/2/o");
    URL url3 = new URL("https://cloud.arest.io/your_unique_id/mode/3/o");
    URL url4 = new URL("https://cloud.arest.io/your_unique_id/mode/4/o");
    URL url5 = new URL("https://cloud.arest.io/your_unique_id/mode/1/0");
    URL url6 = new URL("https://cloud.arest.io/your_unique_id/mode/1/1");
    URL url7 = new URL("https://cloud.arest.io/your_unique_id/mode/2/0");
    URL url8 = new URL("https://cloud.arest.io/your_unique_id/mode/2/1");
    URL url9 = new URL("https://cloud.arest.io/your_unique_id/mode/3/0");
    URL url10 = new URL("https://cloud.arest.io/your_unique_id/mode/3/1");
    URL url11 = new URL("https://cloud.arest.io/your_unique_id/mode/4/0");
    URL url12 = new URL("https://cloud.arest.io/your_unique_id/mode/4/1");


    // TL;DR
    // Simply, we need to simulate a person typing these urls in a specific order into a web browser and hitting enter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Each pin is set to be an output pin
        HttpURLConnection httpCon1 = (HttpURLConnection) url1.openConnection();
        url1.setRequestMethod("POST");
        httpCon1.connect();
        HttpURLConnection httpCon2 = (HttpURLConnection) url2.openConnection();
        url2.setRequestMethod("POST");
        httpCon2.connect();
        HttpURLConnection httpCon3 = (HttpURLConnection) url3.openConnection();
        url3.setRequestMethod("POST");
        httpCon3.connect();
        HttpURLConnection httpCon4 = (HttpURLConnection) url4.openConnection();
        url4.setRequestMethod("POST");
        httpCon4.connect();

        // When each button is pressed, a specific combination of http requests are sent
        Button f4pos10 = (Button) findViewById(R.id.f4pos10);
        f4pos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon7 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon7.connect();
                HttpURLConnection httpCon8 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon8.connect();
            }
        });

        Button f4pos5 = (Button) findViewById(R.id.f4pos5);
        f4pos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon7 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon7.connect();
                HttpURLConnection httpCon12 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon12.connect();
            }
        });

        Button f40 = (Button) findViewById(R.id.f40);
        f40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon7 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon7.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();
            }
        });

        Button f4neg5 = (Button) findViewById(R.id.f4neg5);
        f4neg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon19.connect();
                HttpURLConnection httpCon20 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon20.connect();
            }
        });

        Button f3pos10 = (Button) findViewById(R.id.f3pos10);
        f3pos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon7 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon7.connect();
                HttpURLConnection httpCon8 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon8.connect();
            }
        });

        Button f3pos5 = (Button) findViewById(R.id.f3pos5);
        f3pos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon9 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon9.connect();
                HttpURLConnection httpCon10 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon10.connect();
                HttpURLConnection httpCon11 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon11.connect();
                HttpURLConnection httpCon12 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon12.connect();
            }
        });

        Button f30 = (Button) findViewById(R.id.f30);
        f30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon13 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon13.connect();
                HttpURLConnection httpCon14 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon14.connect();
                HttpURLConnection httpCon15 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon15.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();
            }
        });

        Button f3neg5 = (Button) findViewById(R.id.f3neg5);
        f3neg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon17 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon17.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon18.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon19.connect();
                HttpURLConnection httpCon20 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon20.connect();
            }
        });

        Button f2pos10 = (Button) findViewById(R.id.f2pos10);
        f2pos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon11 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon7.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon8.connect();
            }
        });

        Button f2pos5 = (Button) findViewById(R.id.f2pos5);
        f2pos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon9.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon10.connect();
                HttpURLConnection httpCon11 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon11.connect();
                HttpURLConnection httpCon20 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon12.connect();
            }
        });

        Button f20 = (Button) findViewById(R.id.f20);
        f20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon13.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon14.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon15.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();
            }
        });

        Button f2neg5 = (Button) findViewById(R.id.f2neg5);
        f2neg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon17.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon18.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon19.connect();
                HttpURLConnection httpCon20 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon20.connect();
            }
        });

        Button f1pos10 = (Button) findViewById(R.id.f1pos10);
        f1pos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon11 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon7.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon8.connect();
            }
        });

        Button f1pos5 = (Button) findViewById(R.id.f1pos5);
        f1pos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon9.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon10.connect();
                HttpURLConnection httpCon11 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon11.connect();
                HttpURLConnection httpCon20 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon12.connect();
            }
        });

        Button f10 = (Button) findViewById(R.id.f10);
        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon13.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon14.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon15.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();
            }
        });

        Button f1neg5 = (Button) findViewById(R.id.f1neg5);
        f1neg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon17.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon18.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon19.connect();
                HttpURLConnection httpCon20 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon20.connect();
            }
        });

        Button rock = (Button) findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands
                // f1 5
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon9.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon10.connect();
                HttpURLConnection httpCon11 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon11.connect();
                HttpURLConnection httpCon20 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon12.connect();

                //f2 0
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon13.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon14.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon15.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();

                //f3 0
                HttpURLConnection httpCon5 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon7 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon7.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon8.connect();

                //f4 5
                HttpURLConnection httpCon5 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon7 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon7.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon8.connect();
            }
        });

        Button jazz = (Button) findViewById(R.id.jazz);
        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands

                // f1 5
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon9.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon10.connect();
                HttpURLConnection httpCon11 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon11.connect();
                HttpURLConnection httpCon20 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon12.connect();

                //f2 0
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon13.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon14.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon15.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();

                // f3 -5
                HttpURLConnection httpCon17 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon17.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon18.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon19.connect();
                HttpURLConnection httpCon20 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon20.connect();

                // f4 0
                HttpURLConnection httpCon5 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon7 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon7.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();

            }
        });

        Button metal = (Button) findViewById(R.id.metal);
        metal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands

                // f1 0
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon13.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon14.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon15.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();

                // f2 10
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon13.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon14.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon15.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();

                // f3 10
                HttpURLConnection httpCon5 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon7 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon7.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();

                // f4 0
                HttpURLConnection httpCon5 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon7 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon7.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();

            }
        });

        Button pop = (Button) findViewById(R.id.pop);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HTTP commands

                // f1 0
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon13.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon14.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon15.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();

                // f2 5
                HttpURLConnection httpCon5 = (HttpURLConnection) url5.openConnection();
                url5.setRequestMethod("POST");
                httpCon13.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon14.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon15.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon16.connect();

                // f3 5
                HttpURLConnection httpCon5 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon13.connect();
                HttpURLConnection httpCon18 = (HttpURLConnection) url7.openConnection();
                url7.setRequestMethod("POST");
                httpCon14.connect();
                HttpURLConnection httpCon19 = (HttpURLConnection) url10.openConnection();
                url10.setRequestMethod("POST");
                httpCon15.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url11.openConnection();
                url11.setRequestMethod("POST");
                httpCon16.connect();

                // f4 0
                HttpURLConnection httpCon5 = (HttpURLConnection) url6.openConnection();
                url6.setRequestMethod("POST");
                httpCon5.connect();
                HttpURLConnection httpCon6 = (HttpURLConnection) url8.openConnection();
                url8.setRequestMethod("POST");
                httpCon6.connect();
                HttpURLConnection httpCon7 = (HttpURLConnection) url9.openConnection();
                url9.setRequestMethod("POST");
                httpCon7.connect();
                HttpURLConnection httpCon16 = (HttpURLConnection) url12.openConnection();
                url12.setRequestMethod("POST");
                httpCon16.connect();
            }
        });

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
