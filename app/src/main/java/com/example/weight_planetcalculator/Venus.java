package com.example.weight_planetcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Venus extends AppCompatActivity {

    TextView venus_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venus);

        Intent intent = getIntent();
        float weightOfUsers = intent.getFloatExtra("weightOfUser",0);

        venus_Result = (TextView)findViewById(R.id.Venus_result);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float venusAns = Float.valueOf(decimalFormat.format(weightOfUsers *  0.91));


        venus_Result.setText("Your Weight\n" +
                "on\n" +
                "Venus Would Be : " + venusAns);
    }
}
