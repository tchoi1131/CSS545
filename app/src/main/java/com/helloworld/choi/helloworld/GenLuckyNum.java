package com.helloworld.choi.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class GenLuckyNum extends AppCompatActivity {
    public final static String PAGE_NUM = "com.helloworld.choi.helloworld.luckynum";
    private int luckyNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen_lucky_num);
    }

    /** Called when the user clicks the Next Page button */
    public void genLuckNum(View view) {
        // Do something in response to button
        luckyNum = (int)(Math.random()* 100);
        TextView text = (TextView) findViewById(R.id.text_lucky_num_value);
        text.setText(String.valueOf(luckyNum));
    }

    /** Called when the user clicks the Table View button */
    public void enlargeNum(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, CalculateResultActivity.class);
        intent.putExtra(PAGE_NUM, luckyNum);
        startActivity(intent);
    }
}
