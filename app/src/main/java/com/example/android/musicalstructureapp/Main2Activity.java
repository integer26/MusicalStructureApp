package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main2 );
        Button button = findViewById(R.id.back);

        button.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                backMain ();
            }
        } );

        // Create a list of words
        ArrayList<String> song = new ArrayList<String>();
        song.add("Time");
        song.add("Atlas");
        song.add("Tangled");
        song.add("Animals");
        song.add("Carolina in my mind");
        song.add("Forsaken");
        song.add("Fix you");
        song.add("Crawling");
        song.add("Africa");
        song.add("Uprising");

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, song);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }

    public void backMain(){

        final Intent backMain = new Intent ( this, MainActivity.class );
        startActivity ( backMain );
    }
}
