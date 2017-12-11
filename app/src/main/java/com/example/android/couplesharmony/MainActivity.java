package com.example.android.couplesharmony;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreJamie = 0;
    int scoreJulie = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/**
 * Restore the saved scores
 */
        if (savedInstanceState != null) {
            scoreJamie = savedInstanceState.getInt("jamie");
            scoreJulie = savedInstanceState.getInt("julie");
            displayForJamie(scoreJamie);
            displayForJulie(scoreJulie);
        }
/**
 * Remove title bar for landscape mode, optimise space for this view
 */
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            getSupportActionBar().hide();
        }
    }

    /**
     * Check current state of scores
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("jamie" , scoreJamie);
        outState.putInt("julie" , scoreJulie);
    }

    /** Jamie
     * Increase the score for Jamie for taking Julie out to dinner!
     */
    public void take_julie_dinner(View v) {
        scoreJamie = scoreJamie + 4;
        displayForJamie(scoreJamie);
    }

    /**
     * Increase the score for Jamie for running Julie a bath!
     */
    public void run_julie_bath(View v) {
        scoreJamie = scoreJamie + 2;
        displayForJamie(scoreJamie);
    }

    /**
     * Increase the score for Jamie for putting washing in basket!
     */
    public void jamie_washing(View v) {
        scoreJamie = scoreJamie + 8;
        displayForJamie(scoreJamie);
    }

    /**
     * Increase the score for Jamie to clean the kitchen!
     */
    public void jamie_kitchen(View v) {
        scoreJamie = scoreJamie + 6;
        displayForJamie(scoreJamie);
    }

    /**
     * Increase the score for Jamie for cleaning the bathroom!
     */
    public void jamie_bathroom(View v) {
        scoreJamie = scoreJamie + 10;
        displayForJamie(scoreJamie);
    }



    /**  Julie
     * Increase the score for Julie for taking Jamie out to dinner!
     */
    public void take_jamie_dinner(View v) {
        scoreJulie = scoreJulie + 4;
        displayForJulie(scoreJulie);
    }

    /**
     * Increase the score for Julie for running Jamie a bath!
     */
    public void run_jamie_bath(View v) {
        scoreJulie = scoreJulie + 2;
        displayForJulie(scoreJulie);
    }

    /**
     * Increase the score for Julie for putting washing in basket!
     */
    public void julie_washing(View v) {
        scoreJulie = scoreJulie + 8;
        displayForJulie(scoreJulie);
    }

    /**
     * Increase the score for Julie to clean the kitchen!
     */
    public void julie_kitchen(View v) {
        scoreJulie = scoreJulie + 6;
        displayForJulie(scoreJulie);
    }

    /**
     * Increase the score for Julie for cleaning the bathroom!
     */
    public void julie_bathroom(View v) {
        scoreJulie = scoreJulie + 10;
        displayForJulie(scoreJulie);
    }


    /**
     * Action for the Start Over button.
     */
    public void reset(View v) {
        scoreJamie =  0;
        scoreJulie =  0;
        displayForJamie(scoreJamie);
        displayForJulie(scoreJulie);
        TextView cleartext = (TextView) findViewById(R.id.love_message);
        cleartext.setText(null);
    }

    /**
     * Action for the ending the game button.
     */
    public void end(View v) {
        scoreJamie =  0;
        scoreJulie =  0;
        String love = "There is no real winner, you both love each other!";
        displayMessage(love);
    }



    /**
     * Displays the given score for Jamie.
     */
    public void displayForJamie(int score) {
        TextView scoreView = (TextView) findViewById(R.id.jamie_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Julie.
     */
    public void displayForJulie(int score) {
        TextView scoreView = (TextView) findViewById(R.id.julie_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the love message!
     */
    private void displayMessage(String message) {
        TextView lovemessage = (TextView) findViewById(R.id.love_message);
        lovemessage.setText(message);
    }

}
