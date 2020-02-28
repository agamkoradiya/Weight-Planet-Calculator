package com.example.weight_planetcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Neptune extends AppCompatActivity {

    TextView neptune_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neptune);

        Intent intent = getIntent();
        float weightOfUsers = intent.getFloatExtra("weightOfUser",0);

        neptune_Result = (TextView)findViewById(R.id.Neptune_result);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float neptuneAns = Float.valueOf(decimalFormat.format(weightOfUsers *  1.19));

        neptune_Result.setText("Your Weight\n" +
                "on\n" +
                "Neptune Would Be : " + neptuneAns);
    }
}
