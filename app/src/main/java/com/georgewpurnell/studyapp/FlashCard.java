package com.georgewpurnell.studyapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class FlashCard extends AppCompatActivity {
    int currentIndex;
    String question, answer;
    ArrayList<String> questionList;

    TextView questionAnswery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_card);

        Button home = (Button) findViewById(R.id.homeFlashCard);
        Button nextCard = (Button) findViewById(R.id.nextCard);
        final Button showAnswer = (Button) findViewById(R.id.showAnswer);
        final TextView questionAnswer = (TextView) findViewById(R.id.questionAnswerFlashCard);

        if (QuestionRepository.getKeyList().size() == 0){
          questionAnswer.setText("Please Add Questions To Use This Function");
          showAnswer.setVisibility(View.GONE);
          nextCard.setVisibility(View.GONE);
        }
        else {
            questionList = QuestionRepository.getKeyList();
            currentIndex = 0;
            question = questionList.get(0);
            answer = QuestionRepository.getAnswer(question);
            questionAnswer.setText(question);
            showAnswer.setText("Show Answer");
            showAnswer.setVisibility(View.VISIBLE);
        }




        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.createIntent(FlashCard.this));
                finish();
            }
        });

        nextCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //final int index = getCurrentIndex();
                currentIndex = (currentIndex + 1) % questionList.size();
                question = questionList.get(currentIndex);
                answer = QuestionRepository.getAnswer(question);
                questionAnswer.setText(question);
                showAnswer.setText("Show Answer");

            }
        });

        showAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showAnswer.getText() == "Show Answer") {
                    showAnswer.setText("Show Question");
                    questionAnswer.setText(answer);
                    System.out.println(answer + "111");
                }
                else {
                    showAnswer.setText("Show Answer");
                    questionAnswer.setText(question);
                };
            }
        });

        questionAnswery = (TextView)findViewById(R.id.questionAnswerFlashCard) ;
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/DANCING-JUNGLE.ttf");
        home.setTypeface(myCustomFont);
        nextCard.setTypeface(myCustomFont);
        showAnswer.setTypeface(myCustomFont);
        questionAnswer.setTypeface(myCustomFont);
        questionAnswery.setTypeface(myCustomFont);



    }

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, FlashCard.class);

        //intent.putExtra("uid", uid);
        return intent;
    }


}
