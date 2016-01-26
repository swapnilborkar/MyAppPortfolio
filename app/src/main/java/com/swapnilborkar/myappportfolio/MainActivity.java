package com.swapnilborkar.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnSpotifyStreamer = (Button) findViewById(R.id.btnSpotifyStreamer);
        Button btnScoresApp = (Button) findViewById(R.id.btnScoresApp);
        Button btnLibraryApp = (Button) findViewById(R.id.btnLibraryApp);
        Button btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        Button btnXyzReader = (Button) findViewById(R.id.btnXyzReader);
        Button btnCapstone = (Button) findViewById(R.id.btnCapstone);

        btnSpotifyStreamer.setOnClickListener(this);
        btnScoresApp.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnXyzReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
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

    @Override
    public void onClick(View v) {

        String message = "This button will launch my ";
        switch (v.getId())
        {
            case R.id.btnSpotifyStreamer:
                Toast.makeText(this, message+"Spotify Streamer App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnScoresApp:
                Toast.makeText(this, message+"Scores App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnLibraryApp:
                Toast.makeText(this, message+"Library App!", Toast.LENGTH_SHORT).show();
                break;

            case  R.id.btnBuildItBigger:
                Toast.makeText(this, message+"Build It Bigger App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnXyzReader:
                Toast.makeText(this, message+"XYZ Reader App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnCapstone:
                Toast.makeText(this, message+"Capstone App!", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}

