package com.chmaurer.android.appportfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

//coloring taken from http://www.google.com/design/spec/style/color.html#color-color-palette
public class MainActivity extends AppCompatActivity {

    private static final String SPOTIFY_STREAMER = "Spotify Streamer";
    private static final String SCORES_APP = "Scores App";
    private static final String LIBRARY_APP = "Library App";
    private static final String BUILD_IT_BIGGER = "Build It Bigger";
    private static final String XYZ_READER = "XYZ Reader";
    private static final String CAPSTONE = "Capstone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }


    }

    //doing the onClick's as explained at http://developer.android.com/guide/topics/ui/controls/button.html#HandlingEvents
    public void onClickSpotifyStreamer(View v) {
        Toast.makeText(getBaseContext(), SPOTIFY_STREAMER, Toast.LENGTH_SHORT).show();
    }

    public void onClickScoresApp(View v) {
        Toast.makeText(getBaseContext(), SCORES_APP, Toast.LENGTH_SHORT).show();
    }

    public void onClickLibraryApp(View v) {
        Toast.makeText(getBaseContext(), LIBRARY_APP, Toast.LENGTH_SHORT).show();
    }

    public void onClickBuildItBigger(View v) {
        Toast.makeText(getBaseContext(), BUILD_IT_BIGGER, Toast.LENGTH_SHORT).show();
    }

    public void onClickXYZReader(View v) {
        Toast.makeText(getBaseContext(), XYZ_READER, Toast.LENGTH_SHORT).show();
    }

    public void onClickCapstone(View v) {
        Toast.makeText(getBaseContext(), CAPSTONE, Toast.LENGTH_SHORT).show();
    }

}
