package com.example.collagetradehub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Syllabus1 extends AppCompatActivity {
    private CardView cr2;
    private TextView tv1;
    private  CardView cr3;
    private  CardView cr4;
    private  CardView cr5;
    private  CardView cr6;
    private  CardView cr7;
    private  TextView tvos;
    private  TextView tvDm;
    private  TextView tvdaa;
    private  TextView tvhr;
    private  TextView tvde;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus1);

        cr2 = findViewById(R.id.cr2);
        tv1 = findViewById(R.id.tv1);
        cr3=findViewById(R.id.cr3);
        cr4=findViewById(R.id.cr4);
        cr5=findViewById(R.id.cr5);
        cr6=findViewById(R.id.cr6);
        cr7=findViewById(R.id.cr7);
        tvos=findViewById(R.id.tvos);
        tvDm=findViewById(R.id.tvDm);
        tvdaa=findViewById(R.id.tvdaa);
        tvhr=findViewById(R.id.tvhr);
        tvde=findViewById(R.id.tvde);


        cr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleTextViewVisibility4();
            }
        });
        cr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                togglecv4();
            }
        });


        cr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                togglecv3();
            }
        });


        cr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                togglecv5();
            }
        });
        cr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                togglecv6();
            }
        });
        cr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                togglecv7();
            }
        });
    }

    private void togglecv7()
    {
        if(tvde.getVisibility()==View.VISIBLE)
        {
            tvde.setVisibility(View.GONE);
        }else {
            tvde.setVisibility(View.VISIBLE);
        }
    }

    private void togglecv5()
    {
        if(tvhr.getVisibility()==View.VISIBLE){
            tvhr.setVisibility(View.GONE);
        }else {
            tvhr.setVisibility(View.VISIBLE);
        }
    }

    private void togglecv6()
    {
        if(tvdaa.getVisibility()==View.VISIBLE)
        {
            tvdaa.setVisibility(View.GONE);
        }else {
            tvdaa.setVisibility(View.VISIBLE);
        }
    }



    private void togglecv3()
    {
        if(tvos.getVisibility()==View.VISIBLE){
            tvos.setVisibility(View.GONE);
        }else {
            tvos.setVisibility(View.VISIBLE);
        }
    }
private void togglecv4()
{
    if (tvDm.getVisibility()==View.VISIBLE)
    {
        tvDm.setVisibility(View.GONE);
    }else{
        tvDm.setVisibility(View.VISIBLE);
    }
}


    private void toggleTextViewVisibility4() {
        if (tv1.getVisibility() == View.VISIBLE) {
            tv1.setVisibility(View.GONE);
        } else {
            tv1.setVisibility(View.VISIBLE);
        }
    }
}