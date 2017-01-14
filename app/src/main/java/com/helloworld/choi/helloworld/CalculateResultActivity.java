package com.helloworld.choi.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CalculateResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_result);

        /**
         * 1. get lucky number sent from the previous activity.
         * 2. calculate the square of the number.
         * 3. display on the text view box.
         */
        Intent intent = getIntent();
        int luckyNum = 0;
        luckyNum = intent.getIntExtra(GenLuckyNum.PAGE_NUM,luckyNum);
        luckyNum *= luckyNum;

        TextView text = (TextView) findViewById(R.id.text_square_num_value);
        text.setText(String.valueOf(luckyNum));
    }

    /** Called when the user clicks the Back button */
    public void closePage(View view) {
        // end the activity
        finish();
    }
}
