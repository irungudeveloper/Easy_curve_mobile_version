package com.fridah.easy_curve;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);

        CardView card_view = findViewById(R.id.to_student_profile);
        card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toStudentProfile = new Intent(getApplicationContext(),Student_Profile_Activity.class);
                startActivity(toStudentProfile);
            }
        });
        CardView card_view1 = findViewById(R.id.to_student_assignment);
        card_view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toStudentAssignment = new Intent(getApplicationContext(),StudentAssignmentsActivity.class);
                startActivity(toStudentAssignment);
            }
        });
        CardView card_view2 = findViewById(R.id.to_student_fees);
        card_view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toStudentAssignment = new Intent(getApplicationContext(),StudentFeesActivity.class);
                startActivity(toStudentAssignment);
            }
        });

        Button sLogOut = findViewById(R.id.logoutAs_Student);
        sLogOut .setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent studentLogOut = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(studentLogOut);

            }
        });
    }

}
