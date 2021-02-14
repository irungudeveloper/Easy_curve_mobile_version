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

        Button select_accessAs_Student = findViewById(R.id.select_accessAs_Student);
        select_accessAs_Student.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent accessAsStudentIntent = new Intent(getApplicationContext(),StudentAccess.class);
                startActivity(accessAsStudentIntent);

            }
        });
        Button select_accessAs_Teacher = findViewById(R.id.select_accessAs_Teacher);
        select_accessAs_Teacher.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent accessAsTeacherIntent = new Intent(getApplicationContext(),TeacherAccess.class);
                startActivity(accessAsTeacherIntent);

            }
        });

    }

}
