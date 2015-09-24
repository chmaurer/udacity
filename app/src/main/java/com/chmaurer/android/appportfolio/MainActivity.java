
/*
*** Links, Websites and stuff I came across and used partially: ***
Git:
        http://stackoverflow.com/questions/16644946/how-do-you-sync-projects-to-github-with-android-studio
        https://help.github.com/articles/adding-a-remote/

Coloring: taken from http://www.google.com/design/spec/style/color.html#color-color-palette
        https://developer.android.com/samples/BasicMediaRouter/res/values/colors.html   (for using colors.xml as in feedback for first submission)
        http://stackoverflow.com/questions/3769762/android-color-xml-resource-file      (for using colors.xml as in feedback for first submission)

For highlighting buttons on click:
        https://discussions.udacity.com/t/what-is-the-best-way-to-change-button-colors-with-touch-state/20620/4
        http://developer.android.com/guide/topics/resources/drawable-resource.html#StateList
        https://github.com/cyrilmottier/DrawablePresentation/blob/master/DrawableListing/res/drawable/button_focused.xml
        http://stackoverflow.com/questions/3882064/how-to-change-color-of-button-in-android-when-clicked

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
        http://stackoverflow.com/questions/17545060/custom-view-with-button-in-arrayadapter
        http://stackoverflow.com/questions/15610829/how-to-add-button-to-a-list-view
        http://stackoverflow.com/questions/8166497/custom-adapter-for-list-view


Displaying Text on Button:
        http://stackoverflow.com/questions/22102759/text-is-not-displayed-on-button-widget

Other issues:
        http://stackoverflow.com/questions/15825081/error-default-activity-not-found
        http://stackoverflow.com/questions/16883427/why-is-android-studio-reporting-uri-is-not-registered
        https://developer.android.com/training/basics/actionbar/adding-buttons.html
        http://stackoverflow.com/questions/29199891/cannot-resolve-symbol-appcompatactivity (for finding right imports, together with using sunshine app)
        http://stackoverflow.com/questions/22005714/set-and-get-android-button-text-programatically (setting Text on Button)
        http://stackoverflow.com/questions/28849554/cannot-resolve-method-addint-new-tfragment-commit-in-android-studion-1-0
        http://stackoverflow.com/questions/16615038/what-is-the-shortcut-to-auto-import-all-in-android-studio

Udacity:
        Using feedback from first app submission (string and color externalization, uncommenting Menu)
        Using the sunshine project (https://github.com/udacity/Sunshine-Version-2.git)
        Using the learnings and instructions from the udacity less
        After finding https://discussions.udacity.com/t/best-practice-for-click-events/21821/12 and http://www.androidconstructionset.com/a-brief-history-of-onclick/,
        I was reverting back to my version with a listener per button and each button defined in xml file. However, after doing more googling I finally found a solution for MY WAY ;)

*/


package com.chmaurer.android.appportfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
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


public class MainActivity extends AppCompatActivity {

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
        public PlaceholderFragment() {

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            List<String> buttons = new ArrayList<>();
            buttons.add(getString(R.string.SpotifyStreamer));
            buttons.add(getString(R.string.ScoresApp));
            buttons.add(getString(R.string.LibraryApp));
            buttons.add(getString(R.string.BuildItBigger));
            buttons.add(getString(R.string.XYZReader));
            buttons.add(getString(R.string.Capstone));

            ListView projectsListView = (ListView) rootView.findViewById(R.id.listview_projects);
            projectsListView.setAdapter(new CustomAdapter(getContext(), R.id.list_item_projectbutton, buttons));

            return rootView;
        }


    }
/*
    public void onClickSpotifyStreamer(View view) {
        Toast.makeText(getBaseContext(), getString(R.string.SpotifyStreamer),
                Toast.LENGTH_SHORT).show();
    }


    public void onClickFootballScoresApp(View view) {
        Toast.makeText(getBaseContext(), getString(R.string.ScoresApp),
                Toast.LENGTH_SHORT).show();
    }

    public void onClickLibraryApp(View view) {
        Toast.makeText(getBaseContext(), getString(R.string.LibraryApp),
                Toast.LENGTH_SHORT).show();
    }

    public void onClickBuildItBigger(View view) {
        Toast.makeText(getBaseContext(), getString(R.string.BuildItBigger),
                Toast.LENGTH_SHORT).show();
    }

    public void onClickXYZReader(View view) {
        Toast.makeText(getBaseContext(), getString(R.string.XYZReader),
                Toast.LENGTH_SHORT).show();
    }

    public void onClickCapstoneProject(View view) {
        Toast.makeText(getBaseContext(), getString(R.string.Capstone),
                Toast.LENGTH_SHORT).show();
    }*/


}
