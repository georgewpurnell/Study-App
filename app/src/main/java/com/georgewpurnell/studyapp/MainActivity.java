package com.georgewpurnell.studyapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button newQuestionButton = (Button) findViewById(R.id.newQuestionBtn);
        final Button flashCardsButton = (Button) findViewById(R.id.flashCardBtn);

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

    }



    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);

        //intent.putExtra("uid", uid);
        return intent;
    }}
