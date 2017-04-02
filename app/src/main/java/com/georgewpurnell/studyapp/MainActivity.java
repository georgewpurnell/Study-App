package com.georgewpurnell.studyapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView studyTimeT;
    Button newFlash;
    Button newQuiz;
    Button newLearn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button newQuestionButton = (Button) findViewById(R.id.newQuestionBtn);
        final Button flashCardsButton = (Button) findViewById(R.id.flashCardBtn);
        final Button quizButton = (Button) findViewById(R.id.quizBtn);

        newQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(NewQuestions.createIntent(MainActivity.this));
                finish();
            }
        });

        flashCardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(FlashCard.createIntent(MainActivity.this));
                finish();
            }
        });

        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Quiz.createIntent(MainActivity.this));
                finish();
            }
        });

        studyTimeT = (TextView) findViewById(R.id.studyTime);
        newFlash = (Button) findViewById(R.id.flashCardBtn);
        newQuiz = (Button) findViewById(R.id.quizBtn);
        newLearn = (Button) findViewById(R.id.learnMoreBtn);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/DANCING-JUNGLE.ttf");
        studyTimeT.setTypeface(myCustomFont);
        newQuestionButton.setTypeface(myCustomFont);
        newFlash.setTypeface(myCustomFont);
        newQuiz.setTypeface(myCustomFont);
        newLearn.setTypeface(myCustomFont);

    }



    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);

        //intent.putExtra("uid", uid);
        return intent;
    }}
