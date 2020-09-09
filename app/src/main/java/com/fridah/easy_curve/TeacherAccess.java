package com.fridah.easy_curve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherAccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_access);
        Button select_logInAs_Teacher = findViewById(R.id.select_logInAs_Teacher);
        select_logInAs_Teacher.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent loginAsStudentIntent = new Intent(getApplicationContext(),StudentLoginActivity.class);
                startActivity(loginAsStudentIntent);
            }
        });

        Button  select_registerAs_Teacher = findViewById(R.id. select_registerAs_Teacher);
        select_registerAs_Teacher.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerAsTeacherIntent = new Intent(getApplicationContext(),TeacherRegistrationActivity.class);
                startActivity(registerAsTeacherIntent);
            }
        });
    }
}
