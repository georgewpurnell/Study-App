package com.georgewpurnell.studyapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FillInBlank extends AppCompatActivity {



    //String uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_in_blank);
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
    }

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, FillInBlank.class);

        //intent.putExtra("uid", uid);
        return intent;
    }
}
