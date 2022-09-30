package com.raphael.udacity_score_keeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;
    int shotsA;
    int shotsB;
    int attacksA;
    int attacksB;
    int possnA;
    int pssnB;
    int cardsA;
    int cardsB;
    int cornersA;
    int cornersB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the A button is clicked.
     */
    public void increment_scoreA(View view) {
        scoreTeamA += 1;
        scoreForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void scoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the B button is clicked.
     */
    public void increment_scoreB(View view) {
        scoreTeamB += 1;
        scoreForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void scoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the A button is clicked.
     */
    public void shotsA(View view) {
        shotsA += 1;
        shotsForTeamA(shotsA);
    }

    public void shotsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shots_a);
        scoreView.setText(String.valueOf(score));
    }

    public void shotsB(View view) {
        shotsB += 1;
        shotsForTeamB(shotsB);
    }

    public void shotsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shots_b);
        scoreView.setText(String.valueOf(score));
    }

    public void attacksA(View view) {
        attacksA += 1;
        attacksForTeamA(attacksA);
    }

    public void attacksForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.attacks_a);
        scoreView.setText(String.valueOf(score));
    }

    public void attacksB(View view) {
        attacksB += 1;
        attacksForTeamB(attacksB);
    }

    public void attacksForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.attacks_b);
        scoreView.setText(String.valueOf(score));
    }


    public void pssnsA(View view) {
        possnA += 1;
        pssnsForTeamA(possnA);
    }

    public void pssnsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pssn_a);
        scoreView.setText(String.valueOf(score));
    }

    public void pssnsB(View view) {
        pssnB += 1;
        pssnsForTeamB(pssnB);
    }

    public void pssnsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pssn_b);
        scoreView.setText(String.valueOf(score));
    }

    public void cardsA(View view) {
        cardsA += 1;
        cardsForTeamA(cardsA);
    }

    public void cardsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cards_a);
        scoreView.setText(String.valueOf(score));
    }

    public void cardsB(View view) {
        cardsB += 1;
        cardsForTeamB(cardsB);
    }

    public void cardsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cards_b);
        scoreView.setText(String.valueOf(score));
    }

    public void cornersA(View view) {
        cornersA += 1;
        cornersForTeamA(cornersA);
    }

    public void cornersForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corners_a);
        scoreView.setText(String.valueOf(score));
    }

    public void cornersB(View view) {
        cornersB += 1;
        cornersForTeamB(cornersB);
    }

    public void cornersForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.corners_b);
        scoreView.setText(String.valueOf(score));
    }

    public void resetValues(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreForTeamA(scoreTeamA);
        scoreForTeamB(scoreTeamB);
        shotsA = 0;
        shotsB = 0;
        attacksA = 0;
        attacksB = 0;
        possnA = 0;
        pssnB = 0;
        cardsA = 0;
        cardsB = 0;
        cornersA = 0;
        cornersB = 0;
        shotsForTeamA(shotsA);
        shotsForTeamB(shotsB);
        attacksForTeamA(attacksA);
        attacksForTeamB(attacksB);
        pssnsForTeamA(possnA);
        pssnsForTeamB(pssnB);
        cardsForTeamA(cardsA);
        cardsForTeamB(cardsB);
        cornersForTeamA(cornersA);
        cornersForTeamB(cornersB);
    }
}