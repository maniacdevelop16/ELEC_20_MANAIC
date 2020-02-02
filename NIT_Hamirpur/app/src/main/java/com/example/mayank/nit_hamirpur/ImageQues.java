package com.example.mayank.nit_hamirpur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ImageQues extends AppCompatActivity {
    private ChoiceQuiz mImageLibrary = new ChoiceQuiz();
    private ChoiceQuiz mQuestionLibrary = new ChoiceQuiz();
    private TextView mScoreView;
    private TextView mQuestionView;
    private ImageView Image;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private String mAnswer;
    private int mQuestionNumber = 0;
    private int mImageNumber = 0;

    mcq t = new mcq();
    int mScore = t.mScore;


    int i =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_ques);
        Image = (ImageView) findViewById(R.id.image);
        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.quit);







        updateQuestion();







        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 2;
                    updateScore(mScore);
                    updateQuestion();
                    updateImage();
                    //This line of code is optiona
                    Toast.makeText(ImageQues.this, "good work", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(ImageQues.this, "try to concentrate", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    updateImage();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 2;
                    updateScore(mScore);
                    updateQuestion();
                    updateImage();
                    //This line of code is optiona
                    Toast.makeText(ImageQues.this, "good work", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(ImageQues.this, "try concentrating", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    updateImage();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 2;
                    updateScore(mScore);
                    updateQuestion();
                    updateImage();
                    //This line of code is optiona
                    Toast.makeText(ImageQues.this, "good work", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(ImageQues.this, "concentrate", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    updateImage();
                }
            }
        });
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My logic for Button goes in here

                mScore = mScore + 1;
                updateScore(mScore);
                updateQuestion();
                updateImage();
                //This line of code is optiona

            }

        });
        //End of Button Listener for Button3


    }

    private void updateImage() {

        if (i == 0){
            Image.setImageResource(R.drawable.pencil);
            i++;

        }
        else if (i == 1){
            Image.setImageResource(R.drawable.truck);
            i++;

        }
        else if (i ==2){
            Image.setImageResource(R.drawable.ic_launcher_background);
            i++;

        }


    }

    private void updateQuestion() {
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText("I Don't Know");
        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;


        if (mQuestionNumber == 4)

        {

            Intent i = new Intent(ImageQues.this, MainActivity.class);
            startActivity(i);




        }




    }








    private void updateScore(int point) {
        mScoreView.setText("" + mScore);

    }
}
