
/*
*** Links, Websites and stuff I came across and used partially: ***
Git:
        http://stackoverflow.com/questions/16644946/how-do-you-sync-projects-to-github-with-android-studio
        https://help.github.com/articles/adding-a-remote/
        
Coloring: taken from http://www.google.com/design/spec/style/color.html#color-color-palette
        https://developer.android.com/samples/BasicMediaRouter/res/values/colors.html   (for using colors.xml as in feedback for first submission)
        http://stackoverflow.com/questions/3769762/android-color-xml-resource-file      (for using colors.xml as in feedback for first submission)

For using String externalization:
        http://developer.android.com/guide/topics/resources/string-resource.html

Layouts:
        http://developer.android.com/guide/topics/ui/declaring-layout.html#FillingTheLayout?utm_source=udacity&utm_medium=mooc&utm_term=android&utm_content=l1_filling_layout&utm_campaign=training
        http://developer.android.com/guide/topics/ui/layout/listview.html

Displaying a toast:
        http://stackoverflow.com/questions/3500197/how-to-display-toast-in-android

Regarding the different things I tried for the OnClickListener:
        http://developer.android.com/reference/android/widget/Button.html
        http://developer.android.com/reference/android/view/View.html#findViewById(int)?utm_source=udacity&utm_medium=mooc&utm_term=android&utm_content=l1_findviewbyid&utm_campaign=training
        http://stackoverflow.com/questions/5345470/onclicklistener-cannot-be-resolved-to-a-type-eclipse
        http://stackoverflow.com/questions/22102759/text-is-not-displayed-on-button-widget
        http://stackoverflow.com/questions/20279376/android-text-not-showing-in-button
        http://stackoverflow.com/questions/4574143/android-button-does-not-show-in-layout
        http://stackoverflow.com/questions/23122142/could-not-find-a-method-in-the-activity-class-for-onclick-handler
        http://www.howtosolvenow.com/2013/11/android-button-setonclicklistener-example/
        http://stackoverflow.com/questions/6139891/android-setonclicklistener
        http://stackoverflow.com/questions/12124011/how-do-i-handle-callbacks-for-multiple-buttons
        http://stackoverflow.com/questions/8977212/button-click-listeners-in-android
        http://stackoverflow.com/questions/5588804/android-button-setonclicklistener-design-help
        http://stackoverflow.com/questions/9699844/android-setonclicklistener-parameter
        http://stackoverflow.com/questions/3320115/android-onclicklistener-identify-a-button
        http://stackoverflow.com/questions/15512965/android-onclick-method-is-not-invoked
        http://stackoverflow.com/questions/9786058/could-not-find-a-method-onclickview-in-the-activity
        http://developer.android.com/guide/topics/ui/controls/button.html#HandlingEvents
        http://stackoverflow.com/questions/18828684/button-not-responding-to-onclick
        http://stackoverflow.com/questions/20304282/android-button-not-responding-to-click-event
        http://stackoverflow.com/questions/13443811/cannot-call-getsupportfragmentmanager-from-activity
        http://stackoverflow.com/questions/28849554/cannot-resolve-method-addint-new-tfragment-commit-in-android-studion-1-0


Displaying Text on Button:
        http://stackoverflow.com/questions/22102759/text-is-not-displayed-on-button-widget

Other issues:
        http://stackoverflow.com/questions/15825081/error-default-activity-not-found
        http://stackoverflow.com/questions/16883427/why-is-android-studio-reporting-uri-is-not-registered
        https://developer.android.com/training/basics/actionbar/adding-buttons.html
        http://stackoverflow.com/questions/29199891/cannot-resolve-symbol-appcompatactivity (for finding right imports, together with using sunshine app)
        http://stackoverflow.com/questions/22005714/set-and-get-android-button-text-programatically (setting Text on Button)
        http://stackoverflow.com/questions/28849554/cannot-resolve-method-addint-new-tfragment-commit-in-android-studion-1-0

Udacity:
        Using feedback from first app submission (string and color externalization)
        Using the sunshine project and the learnings
*/


package com.chmaurer.android.appportfolio;

import android.app.Activity;
import android.app.Fragment;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    List<Button> buttons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSpotify = new Button(getApplicationContext());
        buttonSpotify.setText(getString(R.string.SpotifyStreamer));
        buttonSpotify.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View b) {
                Toast.makeText(getApplicationContext(), getText(R.string.SpotifyStreamer),
                        Toast.LENGTH_LONG).show();
            }
        });
        buttons.add(buttonSpotify);

        Button buttonScoresApp = new Button(getApplicationContext());
        buttonSpotify.setText(getString(R.string.ScoresApp));
        buttonSpotify.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View b) {
                Toast.makeText(getApplicationContext(), getText(R.string.ScoresApp),
                        Toast.LENGTH_LONG).show();
            }
        });
        buttons.add(buttonScoresApp);

        Button buttonLibraryApp = new Button(getApplicationContext());
        buttonSpotify.setText(getString(R.string.LibraryApp));
        buttonSpotify.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View b) {
                Toast.makeText(getApplicationContext(), getText(R.string.LibraryApp),
                        Toast.LENGTH_LONG).show();
            }
        });
        buttons.add(buttonLibraryApp);

        Button buttonBuildItBigger = new Button(getApplicationContext());
        buttonSpotify.setText(getString(R.string.BuildItBigger));
        buttonSpotify.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View b) {
                Toast.makeText(getApplicationContext(), getText(R.string.BuildItBigger),
                        Toast.LENGTH_LONG).show();
            }
        });
        buttons.add(buttonBuildItBigger);

        Button buttonXyzReader = new Button(getApplicationContext());
        buttonSpotify.setText(getString(R.string.XYZReader));
        buttonSpotify.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View b) {
                Toast.makeText(getApplicationContext(), getText(R.string.XYZReader),
                        Toast.LENGTH_LONG).show();
            }
        });
        buttons.add(buttonXyzReader);

        Button buttonCapstoneApp = new Button(getApplicationContext());
        buttonSpotify.setText(getString(R.string.Capstone));
        buttonSpotify.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View b) {
                Toast.makeText(getApplicationContext(), getText(R.string.Capstone),
                        Toast.LENGTH_LONG).show();
            }
        });
        buttons.add(buttonCapstoneApp);


        PlaceholderFragment phf = new PlaceholderFragment();
        phf.setButtons(buttons);
        if (savedInstanceState == null) {
            this.getFragmentManager().beginTransaction()
                    .add(R.id.container, phf)
                    .commit();
        }
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

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
        List<Button> buttons;

        public PlaceholderFragment() {

        }

        public void setButtons(List<Button> _buttons) {
            buttons = _buttons;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            ArrayAdapter<Button> arrayAdapter = new ArrayAdapter<>(getActivity(), R.layout.listitem_project, R.id.list_item_projectbutton, buttons);
            ListView projectsListView = (ListView) rootView.findViewById(R.id.listview_projects);
            projectsListView.setAdapter(arrayAdapter);
            return rootView;
        }


    }


}
