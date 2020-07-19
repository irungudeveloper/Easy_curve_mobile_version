package com.fridah.easy_curve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_profile);

        Button tProfileBack = findViewById(R.id.teacher_profile_back);
        tProfileBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent teacherProfileBack = new Intent(getApplicationContext(),TeacherDashboardActivity.class);
                startActivity(teacherProfileBack);

            }
        });
    }
}
