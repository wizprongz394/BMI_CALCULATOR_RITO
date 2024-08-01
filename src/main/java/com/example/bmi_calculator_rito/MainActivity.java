package com.example.bmi_calculator_rito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtresult;
        EditText heightin,heightft,weight;
        Button btncal;

        txtresult=findViewById(R.id.txtresult);
        heightft=findViewById(R.id.heightft);
        heightin=findViewById(R.id.heightin);
        weight=findViewById(R.id.weight);
        btncal=findViewById(R.id.btncal);

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt= Integer.parseInt( weight.getText().toString());
                int ft= Integer.parseInt(heightft.getText().toString());
                int inc=Integer.parseInt(heightin.getText().toString());

                int Totalin=ft*12+inc;
                double Totalcm=Totalin*2.53;
                double Totalm=Totalcm/100;
                double BMI=wt/(Totalm*Totalm);

                if (BMI>25){
                    txtresult.setText("You are overweight");
                } else if (BMI<18) {
                    txtresult.setText("You are Underweight");

                }else {
                    txtresult.setText("You Healthy Asf");
                }
            }
        });



    }
}