package com.georgewpurnell.studyapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.georgewpurnell.studyapp.R.id.multChoiceBtn;

public class NewQuestions extends AppCompatActivity {
    TextView newQuest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_questions);
        Button home = (Button) findViewById(R.id.homeNewQuestions);
        final Button fillInBlankButton = (Button) findViewById(R.id.fillBlankBtn);
        final Button multChoiceButton = (Button) findViewById(multChoiceBtn);
        final Button trueFalseButton = (Button) findViewById(R.id.trueFalseBtn);

        newQuest = (TextView) findViewById(R.id.newQuestionHeader) ;


        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/DANCING-JUNGLE.ttf");
        home.setTypeface(myCustomFont);
        fillInBlankButton.setTypeface(myCustomFont);
        multChoiceButton.setTypeface(myCustomFont);
        trueFalseButton.setTypeface(myCustomFont);
        newQuest.setTypeface(myCustomFont);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.createIntent(NewQuestions.this));
                finish();
            }
        });

        fillInBlankButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(FillInBlank.createIntent(NewQuestions.this));
                finish();

            }
        });

        multChoiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MultipleChoice.createIntent(NewQuestions.this));
                finish();

            }
        });

        trueFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(TrueFalse.createIntent(NewQuestions.this));
                finish();
            }
        });

//        if (getIntent().getExtras() != null) {
//            uid = getIntent().getStringExtra("uid");
//        }

    }

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, NewQuestions.class);

        //intent.putExtra("uid", uid);
        return intent;
    }




    }


