package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by giorgioschirano on 02/03/18.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> song) {

        super ( context, 0, song );
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate ( R.layout.songs_layout, parent, false );
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Song currentAndroidFlavor = getItem ( position );

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById ( R.id.songNameT );
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText ( currentAndroidFlavor.getmName () );

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById ( R.id.authorT );
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText ( currentAndroidFlavor.getmAuthor () );

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
