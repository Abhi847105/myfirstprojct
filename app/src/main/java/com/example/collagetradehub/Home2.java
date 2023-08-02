package com.example.collagetradehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
    }


    public void btech(View view) {

        Intent intent=new Intent(Home2.this,Syllabus1.class);
        startActivity(intent);
    }

    public void Gate(View view) {
        Intent intent=new Intent(this, btechModule.class);
        startActivity(intent);
    }

    public void java(View view) {
        Intent intent=new Intent(this,JavaTutorial.class);
        startActivity(intent);
    }

    public void Oops(View view) {
        Intent intent=new Intent(this,Oops.class);
        startActivity(intent);
    }
}