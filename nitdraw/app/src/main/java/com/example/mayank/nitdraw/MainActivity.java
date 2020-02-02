package com.example.mayank.nitdraw;

import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;



import static com.example.mayank.nitdraw.PaintView.DEFAULT_BG_COLOR;

public class MainActivity extends AppCompatActivity {
    private Button mButtonChoice1;
    private PaintView paintView;
    private int backgroundColor = DEFAULT_BG_COLOR;
    private Path mPath;
    private ArrayList<FingerPath> paths = new ArrayList<>();
    TextView value;
    ImageView image;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paintView = (PaintView) findViewById(R.id.paintView);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);
        image =(ImageView)findViewById(R.id.imageView);
        mButtonChoice1 = (Button) findViewById(R.id.next);
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (i == 0){
                    image.setImageResource(R.drawable.straight);
                    i++;
                    paintView.clear();
                }
                else if (i == 1){
                    image.setImageResource(R.drawable.circle);
                    i++;
                    paintView.clear();
                }
                else if (i == 2){
                    image.setImageResource(R.drawable.rhombus);
                    i++;
                    paintView.clear();
                }
                else {
                    image.setImageResource(R.drawable.pentagon);
                    i++;
                    paintView.clear();
                }

            }





        });
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.normal:
                return true;
            case R.id.clear:
                paintView.clear();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

}






