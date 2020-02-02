package com.example.mayank.nit_hamirpur;

/**
 * Created by Mayank on 02-02-2020.
 */

public class ChoiceQuiz {

    private String mQuestions [] = {
            "What is the picture below?",
            "What is the picture below?",
            "What is the picture below?",
            "What was the first picture"


    };


    private String mImage [] = {
            "@drawable/cat",
            "@drawable/pencil",
            "@drawable/truck",
            "@drawable/ic_launcher_background"


    };


    private String mChoices [][] = {
            {"dog", "cat", "bird", "I Don't Know"},
            {"pencil", "pen", "marker", "I Don't Know"},
            {"car", "bike", "truck", "I Don't Know"},
            {"bike", "cat", "pencil", "I Don't Know remember"}
    };



    private String mCorrectAnswers[] = {"cat", "pencil", "truck", "cat"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}





















