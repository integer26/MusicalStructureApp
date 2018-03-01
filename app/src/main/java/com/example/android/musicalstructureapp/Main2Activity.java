package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    }

    public void backMain(){

        final Intent backMain = new Intent ( this, MainActivity.class );
        startActivity ( backMain );
    }
}
