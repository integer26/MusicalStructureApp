package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main2 );
        Button button = findViewById ( R.id.back );

        button.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                backMain ();
            }
        } );

        // Create a list of words
        ArrayList<Song> song = new ArrayList<Song> ();
        song.add ( new Song ( "Time", "Pink Floyd" ) );
        song.add ( new Song ( "Atlas", "Coldplay" ) );
        song.add ( new Song ( "Tangled", "Maroon 5" ) );
        song.add ( new Song ( "Animals", "Muse" ) );
        song.add ( new Song ( "Carolina in my mind", "James Tailor" ) );
        song.add ( new Song ( "Forsaken", "Dream Theater" ) );
        song.add ( new Song ( "Fix you", "Coldplay" ) );
        song.add ( new Song ( "Crawling", "Linkin Park" ) );
        song.add ( new Song ( "Africa", "Toto" ) );
        song.add ( new Song ( "Uprising", "Muse" ) );
        song.add ( new Song ( "Sussudio", "Phil Collins" ) );
        song.add ( new Song ( "Orion", "Metallica" ) );
        song.add ( new Song ( "Give it Away", "Red Hot Chili Peppers" ) );
        song.add ( new Song ( "Lullaby", "Nickelback" ) );
        song.add ( new Song ( "Outcry", "Dream Theater" ) );


        SongAdapter itemsAdapter = new SongAdapter ( this, song );

        ListView listView = (ListView) findViewById ( R.id.list );

        listView.setAdapter ( itemsAdapter );

    }

    public void backMain() {

        final Intent backMain = new Intent ( this, MainActivity.class );
        startActivity ( backMain );
    }


}
