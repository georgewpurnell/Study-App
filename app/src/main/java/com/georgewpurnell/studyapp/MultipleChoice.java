package com.georgewpurnell.studyapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MultipleChoice extends AppCompatActivity {
    String question, answer;
    ArrayList<String> wrongAnswerList = new ArrayList<String>();
    TextView Head;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);

        final EditText questionText = (EditText) findViewById(R.id.multChoiceQuestion);
        final EditText correctAnswerText = (EditText) findViewById(R.id.multChoiceCorrectAns);
        final EditText wrongAnswerText1 = (EditText) findViewById(R.id.multChoiceWrongAns1);
        final EditText wrongAnswerText2 = (EditText) findViewById(R.id.multChoiceWrongAns2);
        final EditText wrongAnswerText3 = (EditText) findViewById(R.id.multChoiceWrongAns3);
        final EditText wrongAnswerText4 = (EditText) findViewById(R.id.multChoiceWrongAns4);

        Button enter = (Button) findViewById(R.id.enterMultipleChoice);
        Button home = (Button) findViewById(R.id.homeMultipleChoice);
        //Button enter = (Button) findViewById(R.id.enterTrueFalse);
        Button newQuestionType = (Button) findViewById(R.id.newQuestionTypeMultipleChoice);
//        if (getIntent().getExtras() != null) {
//            uid = getIntent().getStringExtra("uid");
//        }
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.createIntent(MultipleChoice.this));
                finish();
            }
        });

        newQuestionType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(NewQuestions.createIntent(MultipleChoice.this));
                finish();
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question = questionText.getText().toString();
                answer = correctAnswerText.getText().toString();
                if (wrongAnswerText1.getText() != null) {
                    wrongAnswerList.add(wrongAnswerText1.getText().toString());
                }
                if (wrongAnswerText2.getText() != null) {
                    wrongAnswerList.add(wrongAnswerText2.getText().toString());
                }
                if (wrongAnswerText3.getText() != null) {
                    wrongAnswerList.add(wrongAnswerText3.getText().toString());
                }
                if (wrongAnswerText4.getText() != null) {
                    wrongAnswerList.add(wrongAnswerText4.getText().toString());
                }
                System.out.println(wrongAnswerList.toString());
                questionText.setText(null);
                correctAnswerText.setText(null);
                wrongAnswerText1.setText(null);
                wrongAnswerText2.setText(null);
                wrongAnswerText3.setText(null);
                wrongAnswerText4.setText(null);
                wrongAnswerList.clear();
                System.out.println(wrongAnswerList.toString());

            }
        });
        Head = (TextView) findViewById(R.id.multChoiceView);

        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/DANCING-JUNGLE.ttf");
        questionText.setTypeface(myCustomFont);
        correctAnswerText.setTypeface(myCustomFont);
        wrongAnswerText1.setTypeface(myCustomFont);
        wrongAnswerText2.setTypeface(myCustomFont);
        wrongAnswerText2.setTypeface(myCustomFont);
        wrongAnswerText3.setTypeface(myCustomFont);
        wrongAnswerText4.setTypeface(myCustomFont);
        enter.setTypeface(myCustomFont);
        home.setTypeface(myCustomFont);
        newQuestionType.setTypeface(myCustomFont);
        Head.setTypeface(myCustomFont);

    }

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, MultipleChoice.class);

        //intent.putExtra("uid", uid);
        return intent;
    }    }

