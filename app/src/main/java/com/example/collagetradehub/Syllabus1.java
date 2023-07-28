package com.example.collagetradehub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Syllabus1 extends AppCompatActivity {
    private CardView cr2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus1);

        cr2 = findViewById(R.id.cr2);
        tv1 = findViewById(R.id.tv1);


        cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleTextViewVisibility4();
            }
        });
    }

    private void toggleTextViewVisibility4() {
        if (tv1.getVisibility() == View.VISIBLE) {
            tv1.setVisibility(View.GONE);
        } else {
            tv1.setVisibility(View.VISIBLE);
        }
    }
}