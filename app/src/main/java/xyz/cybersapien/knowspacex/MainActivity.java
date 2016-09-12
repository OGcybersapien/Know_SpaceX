package xyz.cybersapien.knowspacex;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.ScoreGetter);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, String.valueOf(getScore()),Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * gets the current Score for the Snackbar
     * @return String with Current Score
     */
    private String getScore(){
        return getString(R.string.currentScore, score);
    }

    /**
     * Adds the points to the current score
     * @param additionalPoints adds this to the score
     */
    private void addToScore(int additionalPoints){
        score += additionalPoints;
    }
}
