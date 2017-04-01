package com.georgewpurnell.studyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class NewQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_questions);

        Button fillInBlankButton = (Button) findViewById(R.id.fillBlankBtn);
        Button multChoiceBtn = (Button) findViewById(R.id.multChoiceBtn);
        Button trueFalseBtn = (Button) findViewById(R.id.trueFalseBtn);

        fillInBlankButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivity(FillInBlank);

            }
        });


        multChoiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this, MultipleChoice.class);
                startActivity(intent);

            }
        });

        trueFalseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this, TrueFalse.class);
                startActivity(intent);

            }
        });

        private void launchActivity(Activity activity) {

            Intent intent = new Intent(this, activity.class);
            startActivity(intent);
        }
    }
}
