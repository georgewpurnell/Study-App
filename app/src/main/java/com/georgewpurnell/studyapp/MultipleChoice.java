package com.georgewpurnell.studyapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MultipleChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);
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


    }

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, MultipleChoice.class);

        //intent.putExtra("uid", uid);
        return intent;
    }    }

