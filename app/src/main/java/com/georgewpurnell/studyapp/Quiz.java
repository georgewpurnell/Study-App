package com.georgewpurnell.studyapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button home = (Button) findViewById(R.id.homeQuiz);
        Button submit = (Button) findViewById(R.id.submitQuiz);
        TextView questionText = (TextView)findViewById(R.id.questionQuiz);
        RadioButton answer1 = (RadioButton) findViewById(R.id.answerQuiz1);
        RadioButton answer2 = (RadioButton) findViewById(R.id.answerQuiz2);
        RadioButton answer3 = (RadioButton) findViewById(R.id.answerQuiz3);
        RadioButton answer4 = (RadioButton) findViewById(R.id.answerQuiz4);
        RadioButton answer5 = (RadioButton) findViewById(R.id.answerQuiz5);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.createIntent(Quiz.this));
                finish();
            }
        });


    }

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, Quiz.class);

        //intent.putExtra("uid", uid);
        return intent;
    }
}
