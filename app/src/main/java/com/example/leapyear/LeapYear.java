package com.example.leapyear;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LeapYear extends AppCompatActivity {
    TextView tOne;
    EditText eOne;
    Button bone,bTwo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_leap_year);
        tOne=findViewById(R.id.AnswerButton);
        eOne=findViewById(R.id.editButton);
        bone=findViewById(R.id.SubmitButton);
        bone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year;
                year = Integer.parseInt(eOne.getText().toString());
                if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                {
                    tOne.setText("The year "+year+" is Leap year");
                }
                else
                {
                    tOne.setText("The year "+year+" isn't Leap year");
                }
            }
        });

    }
}