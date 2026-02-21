package com.example.counterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Step 1: Declare variables for Views
    TextView tvCounter;
    Button btnAdd;
    // TODO: Declare variables for btnSubtract and btnReset

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 2: Connect XML to Java using findViewById
        tvCounter = (TextView) findViewById(R.id.tvCounter);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        // TODO: Connect btnSubtract and btnReset using findViewById

        // Step 3: Set OnClickListener for the Add button (already done for you)
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                tvCounter.setText(String.valueOf(counter));
            }
        });

        // TODO: Set OnClickListener for btnSubtract
        // - Decrease counter by 1
        // - Update tvCounter text

        // TODO: Set OnClickListener for btnReset
        // - Reset counter to 0
        // - Update tvCounter text

        // BONUS: Change text color based on counter value
        // - Positive: Color.GREEN
        // - Negative: Color.RED
        // - Zero: Color.BLACK
    }
}
