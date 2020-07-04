package com.fridah.easy_curve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);

        Button loginAs_Teacher = findViewById(R.id.loginAs_Teacher);
        loginAs_Teacher.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent logInAsTeacher = new Intent(getApplicationContext(),TeacherDashboardActivity.class);
                startActivity(logInAsTeacher);

            }
        });
    }
}
