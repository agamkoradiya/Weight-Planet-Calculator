package com.example.weight_planetcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Jupiter extends AppCompatActivity {

    TextView jupiter_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jupiter);

        Intent intent = getIntent();
        float weightOfUsers = intent.getFloatExtra("weightOfUser",0);

        jupiter_Result = (TextView)findViewById(R.id.Jupiter_result);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float jupiterAns = Float.valueOf(decimalFormat.format(weightOfUsers *  2.34));

        jupiter_Result.setText("Your Weight\n" +
                "on\n" +
                "Jupiter Would Be : " + jupiterAns);
    }
}
