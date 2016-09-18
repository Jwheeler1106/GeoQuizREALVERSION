package com.example.johnwheeler.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton = (Button) findViewById(R.id.truebutton);
        mTrueButton.setOnClickListener(new View.OnClickListener()
        {

        @Override
                public void onClick (View v)
        {
            Toast.makeText(QuizActivity.this, R.string.correct, Toast.LENGTH_SHORT).show();
        }
    });


        mFalseButton = (Button) findViewById(R.id.falsebutton);
        mFalseButton.setOnClickListener (new View.OnClickListener()

        {

            @Override
            public void onClick (View v)
            {
                Toast.makeText(QuizActivity.this, R.string.incorrect, Toast.LENGTH_SHORT).show();

            }
        }


        );
    }
}
