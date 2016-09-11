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

    private String getScore(){
        return getString(R.string.currentScore, score);
    }

    private void addToScore(int additionalPoints){
        score += additionalPoints;
    }
}
