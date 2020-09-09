package com.fridah.easy_curve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentAccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_access);

        Button select_logInAs_Student = findViewById(R.id.select_logInAs_Student);
        select_logInAs_Student.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent loginAsStudentIntent = new Intent(getApplicationContext(),StudentLoginActivity.class);
                startActivity(loginAsStudentIntent);
            }
        });

        Button  select_registerAs_Student = findViewById(R.id. select_registerAs_Student);
        select_registerAs_Student.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerAsStudentIntent = new Intent(getApplicationContext(),StudentRegistrationActivity.class);
                startActivity(registerAsStudentIntent);
            }
        });
    }
}
