package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Calls the display methods to update both scores.
     */
    public void updateScores() {
        displayForTeamA();
        displayForTeamB();
    }

    /**
     * Resets the scores to zero.
     * @param view is the current view.
     */
    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        updateScores();
    }

    /**
     * Adds the appropriate score to Team A's total.
     * @param score is the amount to increment.
     */
    public void incrementTeamA(int score) {
        scoreTeamA += score;
    }
    /**
     * Adds the appropriate score to Team B's total.
     * @param score is the amount to increment.
     */
    public void incrementTeamB(int score) {
        scoreTeamB += score;
    }

    /**
     * Determines which button was pushed and calls appropriate increment method.
     * Also updates the scores.
     * @param view is the current view.
     */
    public void incrementScore(View view) {
        switch (view.getId()) {
            case R.id.addTouchdownForTeamA:
                incrementTeamA(6);
                break;
            case R.id.addFieldGoalForTeamA:
                incrementTeamA(3);
                break;
            case R.id.addSafetyForTeamA:
                incrementTeamA(2);
                break;
            case R.id.addExtraPointForTeamA:
                incrementTeamA(1);
                break;
            case R.id.addTouchdownForTeamB:
                incrementTeamB(6);
                break;
            case R.id.addFieldGoalForTeamB:
                incrementTeamB(3);
                break;
            case R.id.addSafetyForTeamB:
                incrementTeamB(2);
                break;
            case R.id.addExtraPointForTeamB:
                incrementTeamB(1);
                break;
        }
        updateScores();
    }
}
