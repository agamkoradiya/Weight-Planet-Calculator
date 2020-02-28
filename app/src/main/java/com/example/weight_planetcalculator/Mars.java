package com.example.weight_planetcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Mars extends AppCompatActivity {

    TextView mars_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mars);

        Intent intent = getIntent();
        float weightOfUsers = intent.getFloatExtra("weightOfUser",0);

        mars_Result = (TextView)findViewById(R.id.Mars_result);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float marsAns = Float.valueOf(decimalFormat.format(weightOfUsers *  0.38));


        mars_Result.setText("Your Weight\n" +
                "on\n" +
                "Mars Would Be : " + marsAns);
    }
}
