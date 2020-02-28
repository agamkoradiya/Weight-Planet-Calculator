package com.example.weight_planetcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Saturn extends AppCompatActivity {

    TextView saturn_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturn);

        Intent intent = getIntent();
        float weightOfUsers = intent.getFloatExtra("weightOfUser",0);

        saturn_Result = (TextView)findViewById(R.id.Saturn_result);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float saturnAns = Float.valueOf(decimalFormat.format(weightOfUsers *  1.06));

        saturn_Result.setText("Your Weight\n" +
                "on\n" +
                "Saturn Would Be : " + saturnAns);
    }
}
