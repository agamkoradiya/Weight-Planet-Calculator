package com.example.weight_planetcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Uranus extends AppCompatActivity {

    TextView uranus_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uranus);

        Intent intent = getIntent();
        float weightOfUsers = intent.getFloatExtra("weightOfUser",0);

        uranus_Result = (TextView)findViewById(R.id.Uranus_result);


        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float uranusAns = Float.valueOf(decimalFormat.format(weightOfUsers *  0.92));


        uranus_Result.setText("Your Weight\n" +
                "on\n" +
                "Uranus Would Be : " + uranusAns);

    }
}
