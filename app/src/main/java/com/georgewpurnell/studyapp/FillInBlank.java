package com.georgewpurnell.studyapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FillInBlank extends AppCompatActivity {

    String question, answer;

    //String uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_in_blank);

        final EditText questionText = (EditText) findViewById(R.id.fillInBlankQuestion1);
        final EditText answerText = (EditText) findViewById(R.id.fillInBlankAnswer1);

        Button home = (Button) findViewById(R.id.homeFillInTheBlank);
        Button enter = (Button) findViewById(R.id.enterFillInTheBlank);
        Button newQuestionType = (Button) findViewById(R.id.newQuestionTypeFillInTheBlank);

//        if (getIntent().getExtras() != null) {
//            uid = getIntent().getStringExtra("uid");
//        }
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.createIntent(FillInBlank.this));
                finish();
            }
        });

        newQuestionType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(NewQuestions.createIntent(FillInBlank.this));
                finish();
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question = questionText.getText().toString();
                answer = answerText.getText().toString();
                questionText.setText(null);
                answerText.setText(null);
            }
        });
    }

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, FillInBlank.class);

        //intent.putExtra("uid", uid);
        return intent;
    }
}
