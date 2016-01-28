package com.swapnilborkar.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btnSpotifyStreamer) Button button1;
    @Bind(R.id.btnScoresApp) Button button2;
    @Bind(R.id.btnLibraryApp) Button button3;
    @Bind(R.id.btnBuildItBigger) Button button4;
    @Bind(R.id.btnXyzReader) Button button5;
    @Bind(R.id.btnCapstone) Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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


    @OnClick({ R.id.btnSpotifyStreamer,
            R.id.btnScoresApp,
            R.id.btnLibraryApp,
            R.id.btnBuildItBigger,
            R.id.btnXyzReader,
            R.id.btnCapstone})
    public void showToast(Button button) {
        Toast.makeText(this, getString(R.string.button_message) + button.getText(), Toast.LENGTH_SHORT).show();
    }
}

