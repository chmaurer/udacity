package com.chmaurer.android.appportfolio;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Christian on 24.09.2015.
 */

//Taken from
// http://stackoverflow.com/questions/17545060/custom-view-with-button-in-arrayadapter and
// http://stackoverflow.com/questions/15610829/how-to-add-button-to-a-list-view and
//http://stackoverflow.com/questions/8166497/custom-adapter-for-list-view
public class CustomAdapter extends ArrayAdapter<String> {
    Context ctx;

    public CustomAdapter(Context context, int resource, List<String> buttons) {
        super(context, resource, buttons);
        ctx = context;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = ((Activity) ctx).getLayoutInflater();
        View row;

        row = inflater.inflate(R.layout.listitem_project, parent, false);
        Button btnInRow = (Button) row.findViewById(R.id.list_item_projectbutton);

        btnInRow.setText(getItem(position));
        btnInRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

        return (row);

    }

}
