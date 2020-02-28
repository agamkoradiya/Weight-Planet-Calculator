package com.example.weight_planetcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    AnimationDrawable animationDrawable;
    EditText editText;
    float weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //for background gradient:
        constraintLayout = (ConstraintLayout) findViewById(R.id.myLayout);
        animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(200);
        animationDrawable.setExitFadeDuration(200);
        animationDrawable.start();
        //weight:
        editText = (EditText) findViewById(R.id.weight);
    }

    public void Mercury(View view) {
        if (TextUtils.isEmpty(editText.getText())) {
            Toast.makeText(this, "Please Enter your weight", Toast.LENGTH_SHORT).show();
        }else {
            weight = Float.valueOf(editText.getText().toString());
            Intent intent = new Intent(getApplicationContext(), Mercury.class);
            intent.putExtra("weightOfUser", weight);
            startActivity(intent);
        }
    }

    public void Venus(View view) {
        if (TextUtils.isEmpty(editText.getText())) {
            Toast.makeText(this, "Please Enter your weight", Toast.LENGTH_SHORT).show();
        }else {
            weight = Float.valueOf(editText.getText().toString());
            Intent intent = new Intent(getApplicationContext(), Venus.class);
            intent.putExtra("weightOfUser", weight);
            startActivity(intent);
        }
    }

    public void Mars(View view) {
        if (TextUtils.isEmpty(editText.getText())) {
            Toast.makeText(this, "Please Enter your weight", Toast.LENGTH_SHORT).show();
        }else {
            weight = Float.valueOf(editText.getText().toString());
            Intent intent = new Intent(getApplicationContext(), Mars.class);
            intent.putExtra("weightOfUser", weight);
            startActivity(intent);
        }
    }

    public void Jupiter(View view) {
        if (TextUtils.isEmpty(editText.getText())) {
            Toast.makeText(this, "Please Enter your weight", Toast.LENGTH_SHORT).show();
        }else {
            weight = Float.valueOf(editText.getText().toString());
            Intent intent = new Intent(getApplicationContext(), Jupiter.class);
            intent.putExtra("weightOfUser", weight);
            startActivity(intent);
        }
    }

    public void Saturn(View view) {
        if (TextUtils.isEmpty(editText.getText())) {
            Toast.makeText(this, "Please Enter your weight", Toast.LENGTH_SHORT).show();
        }else {
            weight = Float.valueOf(editText.getText().toString());
            Intent intent = new Intent(getApplicationContext(), Saturn.class);
            intent.putExtra("weightOfUser", weight);
            startActivity(intent);
        }
    }

    public void Uranus(View view) {
        if (TextUtils.isEmpty(editText.getText())) {
            Toast.makeText(this, "Please Enter your weight", Toast.LENGTH_SHORT).show();
        }else {
            weight = Float.valueOf(editText.getText().toString());
            Intent intent = new Intent(getApplicationContext(), Uranus.class);
            intent.putExtra("weightOfUser", weight);
            startActivity(intent);
        }
    }

    public void Neptune(View view) {
        if (TextUtils.isEmpty(editText.getText())) {
            Toast.makeText(this, "Please Enter your weight", Toast.LENGTH_SHORT).show();
        }else {
            weight = Float.valueOf(editText.getText().toString());
            Intent intent = new Intent(getApplicationContext(), Neptune.class);
            intent.putExtra("weightOfUser", weight);
            startActivity(intent);
        }
    }

    public void All(View view) {
        if (TextUtils.isEmpty(editText.getText())) {
            Toast.makeText(this, "Please Enter your weight", Toast.LENGTH_SHORT).show();
        }else {
            weight = Float.valueOf(editText.getText().toString());
            Intent intent = new Intent(getApplicationContext(), All.class);
            intent.putExtra("weightOfUser", weight);
            startActivity(intent);
        }
    }
}
