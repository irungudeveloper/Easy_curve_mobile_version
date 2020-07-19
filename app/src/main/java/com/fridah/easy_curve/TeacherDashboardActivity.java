package com.fridah.easy_curve;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Collections;

public class TeacherDashboardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_dashboard);

        CardView card_view1 = findViewById(R.id.to_teacher_profile);
        card_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toTeacherProfile = new Intent(getApplicationContext(),TeacherProfileActivity.class);
                startActivity(toTeacherProfile);
            }
        });
        CardView card_view2 = findViewById(R.id.to_my_students);
        card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toMyStudents = new Intent(getApplicationContext(),TeacherStudentsActivity.class);
                startActivity(toMyStudents);
            }
        });
        CardView card_view3 = findViewById(R.id.to_teacher_assignments);
        card_view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toGivenAssignments = new Intent(getApplicationContext(),TeacherAssignmentsActivity.class);
                startActivity(toGivenAssignments);
            }
        });
        CardView card_view4 = findViewById(R.id.to_exam_marks);
        card_view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toStudentExamMarks = new Intent(getApplicationContext(),TeacherExamMarks.class);
                startActivity(toStudentExamMarks );
            }
        });
        Button tLogOut = findViewById(R.id.logoutAs_Teacher);
        tLogOut .setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent teacherLogOut = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(teacherLogOut);

            }
        });
    }
}
