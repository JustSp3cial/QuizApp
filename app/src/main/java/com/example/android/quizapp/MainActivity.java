package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * This app text user basic understanding on general computer knowledge and grade them base on their performance.
 */
public class MainActivity extends AppCompatActivity {
    RadioButton question1_choice2;
    RadioButton question2_choice1;
    CheckBox question3_choice1;
    CheckBox question2_choice2;
    CheckBox question3_choice3;
    EditText question4_answer;
    RadioButton question5_choice3;
    EditText question6_answer;
    CheckBox question7_choice1;
    CheckBox question7_choice2;
    CheckBox question7_choice3;
    EditText question8_answer;
    RadioButton question9_choice2;
    RadioButton question10_choice1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * @param Hide the keyboard on lunching the application
         */
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    public void submitAnswers(View view) {
        //Declearing the score variables for each question
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int total_score;

        // Question 1
        Boolean answer1;
        question1_choice2 = (RadioButton) this.findViewById(R.id.question1_choice2);
        //Check if the user check option 2
        answer1 = question1_choice2.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        // Question 2
        Boolean answer2;
        question2_choice1 = (RadioButton) this.findViewById(R.id.question2_choice1);
        answer2 = question2_choice1.isChecked();
        //Check if the user check option 1
        if (answer2) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        // Question 3
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        question3_choice1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        question2_choice2 = (CheckBox) this.findViewById(R.id.question3_choice2);
        question3_choice3 = (CheckBox) this.findViewById(R.id.question3_choice3);
        answer3_choice1 = question3_choice1.isChecked();
        answer3_choice2 = question2_choice2.isChecked();
        answer3_choice3 = question3_choice3.isChecked();
        //Check if the user check option 1 and 3 only
        if (answer3_choice1 && !answer3_choice2 && answer3_choice3) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        // Question 4
        //Declear a string variable for the right answer
        String answer4;
        question4_answer = (EditText) this.findViewById(R.id.question4_answer);
        //Get the user input and covert it to lower case then assign it to the variable answer4
        answer4 = question4_answer.getText().toString().toLowerCase();
        //Compare user input to the string "second"
        if (answer4.equals("second")) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        // Question 5
        // Declear boolean variable for the right option
        Boolean answer5;
        question5_choice3 = (RadioButton) this.findViewById(R.id.question5_choice3);
        //Check if the user check option 3
        answer5 = question5_choice3.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

         // Question 6
        //Declear a string variable for the right answer
        String answer6;
        question6_answer = (EditText) this.findViewById(R.id.question6_answer);
        //Get the user input and covert it to lower case then assign it to the variable answer6
        answer6 = question6_answer.getText().toString().toLowerCase();
        //Compare user input to the string "primary"
        if (answer6.equals("primary")) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

         // Question 7
        //Declear boolean variables for the right options
        Boolean answer7_choice1;
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        question7_choice1 = (CheckBox) this.findViewById(R.id.question7_choice1);
        question7_choice2 = (CheckBox) this.findViewById(R.id.question7_choice2);
        question7_choice3 = (CheckBox) this.findViewById(R.id.question7_choice3);
        answer7_choice1 = question7_choice1.isChecked();
        answer7_choice2 = question7_choice2.isChecked();
        answer7_choice3 = question7_choice3.isChecked();
        //Check if the user check option 1 and 2 only
        if (answer7_choice1 && answer7_choice2 && !answer7_choice3) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

         // Question 8
        //Declear a string variable for the right answer
        String answer8;
        question8_answer = (EditText) this.findViewById(R.id.question8_answer);
        //Get the user input and covert it to lower case then assign it to the variable answer8
        answer8 = question8_answer.getText().toString().toLowerCase();
        // Compare user input to the string "seven" or "7"
        if (answer8.equals("seven") || answer8.equals("7")) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

         // Question 9
        //Declear a boolean variable for the right answer
        Boolean answer9;
        question9_choice2 = (RadioButton) this.findViewById(R.id.question9_choice2);
        //Check if the user check option 2
        answer9 = question9_choice2.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }

         // Question 10
        //Declear a boolean variable for the right answer
        Boolean answer10;
        question10_choice1 = (RadioButton) this.findViewById(R.id.question10_choice1);
        answer10 = question10_choice1.isChecked();
        //Check if the user check option 2
        if (answer10) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }

        // Summation Of The Final Score
        total_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;
        //Logic to check user performance and score
        if (total_score <= 4) {
            Toast.makeText(this, "Poor performance\nYou scored " + total_score, Toast.LENGTH_LONG).show();

        }
        if (total_score >= 5 && total_score <= 7) {
            Toast.makeText(this, "Good performance\nYou scored " + total_score, Toast.LENGTH_LONG).show();
        }
        if (total_score > 7 && total_score <= 10) {
            Toast.makeText(this, "Excelent performance\nYou scored " + total_score, Toast.LENGTH_LONG).show();
        }
    }

}
