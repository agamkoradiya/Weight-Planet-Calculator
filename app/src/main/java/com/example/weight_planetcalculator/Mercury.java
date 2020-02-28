package com.example.weight_planetcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Mercury extends AppCompatActivity {

    TextView mercury_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercury);

        Intent intent = getIntent();
        float weightOfUsers = intent.getFloatExtra("weightOfUser",0);

        mercury_Result = (TextView)findViewById(R.id.Mercury_result);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float mercuryAns = Float.valueOf(decimalFormat.format(weightOfUsers *  0.38));

        mercury_Result.setText("Your Weight\n" +
                "on\n" +
                "Mercury Would Be : " + mercuryAns);
    }
}
