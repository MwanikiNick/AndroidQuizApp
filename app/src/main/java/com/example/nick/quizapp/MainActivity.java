package com.example.nick.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int finalScore = 0;
    int totalMarks = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        RadioButton radiobutton1 = (RadioButton) findViewById(R.id.choice_two);
        if (radiobutton1.isChecked()) {

            finalScore++;
        }
        RadioButton radiobutton2 = (RadioButton) findViewById(R.id.question_two_choice_three);
        if (radiobutton2.isChecked()) {

            finalScore++;
        }
        CheckBox checkBox3=(CheckBox) findViewById(R.id.checkbox_three);
        if (checkBox3.isChecked()){

            finalScore++;
        }
        CheckBox checkBox4=(CheckBox) findViewById(R.id.checkbox_four);
        if (checkBox4.isChecked()) {

            finalScore++;
        }
        CheckBox checkBox6=(CheckBox) findViewById(R.id.checkbox_six);
        if (checkBox6.isChecked()) {

            finalScore++;
        }
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.question_four_radio_four);
        if (radioButton3.isChecked()) {
            finalScore++;
        }
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.question_five_radio_four);
        if (radioButton4.isChecked()) {

            finalScore++;

        }

    }
    private String quizResults(int finalScore, View RadioButton,View CheckBox,String myName) {
        String yourResults = "\n Name : " + myName;
        yourResults += "You scored : "+ finalScore;
        yourResults += "\nOut of :" + totalMarks;
        return yourResults;
    }

    public void submitQuiz(View view) {
        EditText inputName = (EditText) findViewById(R.id.user_input);
        String myName = inputName.getText().toString();
        

    }
    public void RedoQuiz(View v){
        finalScore = 0;

    }
}
