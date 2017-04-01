package com.georgewpurnell.studyapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TrueFalse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false);
//        if (getIntent().getExtras() != null) {
//            uid = getIntent().getStringExtra("uid");
//        }
        EditText question = (EditText) findViewById(R.id.trueFalseQuestion);
        EditText answer = (EditText) findViewById(R.id.trueFalseAnswer);
        Button home = (Button) findViewById(R.id.homeTrueFalse);
        Button enter = (Button) findViewById(R.id.enterTrueFalse);
        Button newQuestionType = (Button) findViewById(R.id.newQuestionTypeTrueFalse);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.createIntent(TrueFalse.this));
                finish();
            }
        });

        newQuestionType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(NewQuestions.createIntent(TrueFalse.this));
                finish();
            }
        });

    }

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, TrueFalse.class);

        //intent.putExtra("uid", uid);
        return intent;
    }
    }

