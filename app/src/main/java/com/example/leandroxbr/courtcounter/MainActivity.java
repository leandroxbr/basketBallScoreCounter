package com.example.leandroxbr.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAPoints = 0;
    int teamBPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Button button = (Button) findViewById(R.id.);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//            }
//        });

    }

    public void treePointsScoreA(View view) {
        int points = 3;
        String team = "A";
        increaseSore(team, points);
        displayNewScore(team);
    }

    public void treePointsScoreB(View view) {
        int points = 3;
        String team = "B";
        increaseSore(team, points);
        displayNewScore(team);
    }

    public void twoPointsScoreA(View view) {
        int points = 2;
        String team = "A";
        increaseSore(team, points);
        displayNewScore(team);
    }

    public void twoPointsScoreB(View view) {
        int points = 2;
        String team = "B";
        increaseSore(team, points);
        displayNewScore(team);
    }

    public void onePointsScoreA(View view) {
        int points = 1;
        String team = "A";
        increaseSore(team, points);
        displayNewScore(team);
    }

    public void onePointsScoreB(View view) {
        int points = 1;
        String team = "B";
        increaseSore(team, points);
        displayNewScore(team);
    }

    public void increaseSore(String team, int score) {
        if (team.equals("A")) {
            teamAPoints += score;
        } else {
            teamBPoints += score;
        }
    }

    public void displayNewScore(String team) {
        if (team.equals("A")) {
            TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
            teamAScore.setText(String.valueOf(teamAPoints));
        } else {
            TextView teamBScore = (TextView) findViewById(R.id.teamBScore);
            teamBScore.setText(String.valueOf(teamBPoints));
        }
    }

    public void resetScore(View v){
        teamAPoints = 0;
        teamBPoints = 0;
        displayNewScore("A");
        displayNewScore("B");
    }
}
