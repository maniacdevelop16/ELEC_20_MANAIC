package com.example.mayank.nit_hamirpur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button msme;
    Button games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        msme=(Button)findViewById(R.id.msme);
        games=(Button)findViewById(R.id.game);



    // btns



        msme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent i = new Intent(MainActivity.this, mcq.class);
                startActivity(i);

            }
        });



        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent i = new Intent(MainActivity.this, Snake.class);
                startActivity(i);

            }
        });


    }
}
