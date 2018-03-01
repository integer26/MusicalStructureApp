package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        Button button = findViewById(R.id.songsButton);

        button.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                goSong();
            }
        } );

    }


    private void goSong() {
        final Intent change = new Intent ( getApplicationContext (), Main2Activity.class );
        startActivity(change);
    }


}




