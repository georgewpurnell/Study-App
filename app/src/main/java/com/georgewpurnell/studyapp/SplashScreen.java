package com.georgewpurnell.studyapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by georgewpurnell on 4/2/17.
 */

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        final ImageView moveText = (ImageView) findViewById(R.id.disk);
        Animation moveAnimation = AnimationUtils.loadAnimation(this, R.anim.move_text);
        moveText.startAnimation(moveAnimation);
        moveAnimation.setAnimationListener(new Animation.AnimationListener(){
            @Override
            public void onAnimationStart(Animation arg0) {
            }
            @Override
            public void onAnimationRepeat(Animation arg0) {
                startActivity(MainActivity.createIntent(SplashScreen.this));
                finish();
            }
            @Override
            public void onAnimationEnd(Animation arg0) {
                startActivity(MainActivity.createIntent(SplashScreen.this));
                finish();
            }
        });
    }
    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, SplashScreen.class);

        //intent.putExtra("uid", uid);
        return intent;
    }

}
