package com.fridah.easy_curve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button select_loginAs_Student = findViewById(R.id.select_loginAs_Student);
        select_loginAs_Student.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent logInAsStudentIntent = new Intent(getApplicationContext(),StudentLoginActivity.class);
                startActivity(logInAsStudentIntent);

            }
        });
        Button select_loginAs_Teacher = findViewById(R.id.select_loginAs_Teacher);
        select_loginAs_Teacher.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent logInAsTeacherIntent = new Intent(getApplicationContext(),TeacherLoginActivity.class);
                startActivity(logInAsTeacherIntent);

            }
        });

    }

}
