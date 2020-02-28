package com.example.weight_planetcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class All extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    AnimationDrawable animationDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);


        //for background gradient:
        constraintLayout = (ConstraintLayout) findViewById(R.id.all);
        animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(250);
        animationDrawable.setExitFadeDuration(225);
        animationDrawable.start();

        //call textview
        TextView Mercury_result1=(TextView)findViewById(R.id.Mercury_result1);
        TextView Venus_result2=(TextView)findViewById(R.id.Venus_result2);
        TextView Mars_result3=(TextView)findViewById(R.id.Mars_result3);
        TextView Jupiter_result4=(TextView)findViewById(R.id.Jupiter_result4);
        TextView Saturn_result5=(TextView)findViewById(R.id.Saturn_result5);
        TextView Uranus_result6=(TextView)findViewById(R.id.Uranus_result6);
        TextView Neptune_result7=(TextView)findViewById(R.id.Neptune_result7);


        Intent intent = getIntent();
        float weightOfUsers = intent.getFloatExtra("weightOfUser",0);

        // Answer of all planet :

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        float mercuryAns = Float.valueOf(decimalFormat.format(weightOfUsers *  0.38));
        float venusAns = Float.valueOf(decimalFormat.format(weightOfUsers *  0.91));
        float marsAns = Float.valueOf(decimalFormat.format(weightOfUsers *  0.38));
        float jupiterAns = Float.valueOf(decimalFormat.format(weightOfUsers *  2.34));
        float saturnAns = Float.valueOf(decimalFormat.format(weightOfUsers *  1.06));
        float uranusAns = Float.valueOf(decimalFormat.format(weightOfUsers *  0.92));
        float neptuneAns = Float.valueOf(decimalFormat.format(weightOfUsers *  1.19));

        // set answer :
        Mercury_result1.setText(""+ mercuryAns + " kg");
        Venus_result2.setText(""+ venusAns + " kg");
        Mars_result3.setText(""+ marsAns + " kg");
        Jupiter_result4.setText(""+ jupiterAns + " kg");
        Saturn_result5.setText(""+ saturnAns + " kg");
        Uranus_result6.setText(""+ uranusAns + " kg");
        Neptune_result7.setText(""+ neptuneAns + " kg");
    }
}
