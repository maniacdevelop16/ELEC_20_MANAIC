package com.example.mayank.nit_hamirpur;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class mcq extends AppCompatActivity {

    private MultipleChoiceQuiz mQuestionLibrary = new MultipleChoiceQuiz();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private String mAnswer;
    public int mScore = 0;
    private int mQuestionNumber = 0;

    //
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcq);


        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.quit);
        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 2;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(mcq.this, "good work", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(mcq.this, "try to concentrate", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 2;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(mcq.this, "good work", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(mcq.this, "try concentrating", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 2;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(mcq.this, "good work", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(mcq.this, "concentrate", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                mScore = mScore + 1;
                updateScore(mScore);
                updateQuestion();
                //This line of code is optiona

            }

        });
        //End of Button Listener for Button3











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

            Intent i = new Intent(mcq.this, ImageQues.class);
            startActivity(i);




        }



    }




    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}