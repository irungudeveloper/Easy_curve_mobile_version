package com.fridah.easy_curve;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Student_Profile_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__profile_);

        Button sProfileBack = findViewById(R.id.student_profile_back);
        sProfileBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent studentProfileBack = new Intent(getApplicationContext(),StudentDashboardActivity.class);
                startActivity(studentProfileBack);

            }
        });


    }
}
