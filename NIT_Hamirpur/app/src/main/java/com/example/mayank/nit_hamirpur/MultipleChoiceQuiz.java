package com.example.mayank.nit_hamirpur;

/**
 * Created by Mayank on 01-02-2020.
 */
public class MultipleChoiceQuiz {

    private String mQuestions [] = {
            "What is the season now?",
            "Which day of the week is it today?",
            "In which city are you in?",
            "Where were you born?"


    };


    private String mChoices [][] = {
            {"Winter", "Summer", "Spring", "I Don't Know"},
            {"Friday", "Saturday", "Monday", "I Don't Know"},
            {"Hamirpur", "Delhi", "Una", "I Don't Know"},
            {"Rajamundry", "Leh", "Delhi", "I Don't Know"}
    };



    private String mCorrectAnswers[] = {"Winter", "Saturday", "Hamirpur", "Rajahmundry"};




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