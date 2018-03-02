package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        Button button = findViewById ( R.id.songsButton );
        Button play = findViewById ( R.id.playPause );
        Button previous = findViewById ( R.id.previous );
        Button next = findViewById ( R.id.next );


        button.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                goSong ();
            }
        } );

        play.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                playToast ();
            }
        } );

        previous.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                previousToast ();
            }
        } );

        next.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                nextToast ();
            }
        } );

    }


    private void goSong() {
        final Intent change = new Intent ( getApplicationContext (), Main2Activity.class );
        startActivity ( change );
    }

    private void playToast() {

        Toast.makeText ( this, "Music Playing", Toast.LENGTH_SHORT ).show ();

    }

    private void previousToast() {

        Toast.makeText ( this, "You are Playing previous Song", Toast.LENGTH_SHORT ).show ();

    }

    private void nextToast() {

        Toast.makeText ( this, "You are Playing next Song", Toast.LENGTH_SHORT ).show ();

    }

}




