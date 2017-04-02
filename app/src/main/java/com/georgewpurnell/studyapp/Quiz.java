package com.georgewpurnell.studyapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.georgewpurnell.studyapp.R.id.nextCard;
import static com.georgewpurnell.studyapp.R.id.showAnswer;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        if (QuestionRepository.getKeyList().size() == 0 && QuestionRepository.getMultipleChoiceKeyList().size() == 0){
            questionText.setText("Please Add Questions To Use This Function");
            submit.setVisibility(View.GONE);
            nextCard.setVisibility(View.GONE);
        }
        else {
            questionList = QuestionRepository.getKeyList();
            currentIndex = 0;
            question = questionList.get(0);
            answer = QuestionRepository.getAnswer(question);
            questionAnswer.setText(question);
            submit.setVisibility(View.VISIBLE);
            showAnswer.setText("Show Answer");
            showAnswer.setVisibility(View.VISIBLE);
        }

        Button home = (Button) findViewById(R.id.homeQuiz);
        Button submit = (Button) findViewById(R.id.submitQuiz);
        Button nextQuestion = (Button) findViewById(R.id.nextQuestionQuiz);
        TextView questionText = (TextView)findViewById(R.id.questionQuiz);
        RadioButton answer1 = (RadioButton) findViewById(R.id.answerQuiz1);
        RadioButton answer2 = (RadioButton) findViewById(R.id.answerQuiz2);
        RadioButton answer3 = (RadioButton) findViewById(R.id.answerQuiz3);
        RadioButton answer4 = (RadioButton) findViewById(R.id.answerQuiz4);
        RadioButton answer5 = (RadioButton) findViewById(R.id.answerQuiz5);
        RadioGroup answerGroup = (RadioGroup) findViewById(R.id.answerGroupQuiz) ;



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.createIntent(Quiz.this));
                finish();
            }
        });

        nextQuestion.setOnClickListener(new View.OnClickListener() {
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





    }

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, Quiz.class);

        //intent.putExtra("uid", uid);
        return intent;
    }
}
