package com.fridah.easy_curve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherExamEntry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_exam_entry);
        Button ExamEntrySubmit = findViewById(R.id.exam_entry_submit);
        ExamEntrySubmit .setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent ExamEntryIntent = new Intent(getApplicationContext(),TeacherDashboardActivity.class);
                startActivity(ExamEntryIntent);
            }
        });
    }
}
