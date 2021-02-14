package com.fridah.easy_curve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        Button loginAs_Student = findViewById(R.id.loginAs_Student);
        loginAs_Student.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent logInAsStudent = new Intent(getApplicationContext(),StudentDashboardActivity.class);
                startActivity(logInAsStudent);

            }
        });
    }
}
