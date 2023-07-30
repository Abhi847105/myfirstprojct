package com.example.collagetradehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Syllabus extends AppCompatActivity {
    private TextView tvDM;
    private Button bnDM;
    private TextView tvCOA;
    private Button bnCOA;
    private TextView tvOS;
    private Button bnOS;
    private TextView tvDAA;
    private Button bnDAA;
    private TextView tvDE;
    private Button bnDE;
    private TextView tvHRD;
    private Button bnHRD;
    private TextView tvES;
    private Button bnES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        tvDM = findViewById(R.id.tvDM);
        bnDM = findViewById(R.id.btDM);
        tvCOA = findViewById(R.id.tvCOA);
        bnCOA = findViewById(R.id.btCOA);
        tvOS = findViewById(R.id.tvOS);
        bnOS = findViewById(R.id.bnOS);
        tvDE = findViewById(R.id.tvDE);
        bnDE = findViewById(R.id.btDE);
        tvHRD = findViewById(R.id.tvHRD);
        bnHRD = findViewById(R.id.bnHRD);
        tvES = findViewById(R.id.tvES);
        bnES = findViewById(R.id.btES);
        tvDAA = findViewById(R.id.tvDAA);
        bnDAA = findViewById(R.id.btDAA);


        bnDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleTextViewVisibility();
            }
        });
        bnCOA.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                toggleTextViewVisibility1();
            }
        });
        bnOS.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                toggleTextViewVisibility2();
            }
        });
        bnDE.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                toggleTextViewVisibility3();
            }
        });
        bnHRD.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                toggleTextViewVisibility4();
            }
        });
        bnES.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                toggleTextViewVisibility5();
            }
        });

    }

    private void toggleTextViewVisibility() {
        if (tvDM.getVisibility() == View.VISIBLE) {
            tvDM.setVisibility(View.GONE);
        } else {
            tvDM.setVisibility(View.VISIBLE);
        }

    }

    private void toggleTextViewVisibility1()
    {
        if(tvCOA.getVisibility()==View.VISIBLE)
        {
            tvCOA.setVisibility(View.GONE);
        }
        else
        {
            tvCOA.setVisibility(View.VISIBLE);
        }

    }
    private void toggleTextViewVisibility2()
    {
        if(tvOS.getVisibility()==View.VISIBLE)
        {
            tvOS.setVisibility(View.GONE);
        }
        else
        {
            tvOS.setVisibility(View.VISIBLE);
        }

    }
    private void toggleTextViewVisibility3()
    {
        if(tvDE.getVisibility()==View.VISIBLE)
        {
            tvDE.setVisibility(View.GONE);
        }
        else
        {
            tvDE.setVisibility(View.VISIBLE);
        }

    }
    private void toggleTextViewVisibility4()
    {
        if(tvHRD.getVisibility()==View.VISIBLE)
        {
            tvHRD.setVisibility(View.GONE);
        }
        else
        {
            tvHRD.setVisibility(View.VISIBLE);
        }

    }
    private void toggleTextViewVisibility5()
    {
        if(tvES.getVisibility()==View.VISIBLE)
        {
            tvES.setVisibility(View.GONE);
        }
        else
        {
            tvES.setVisibility(View.VISIBLE);
        }

    }



    public void btDAA(View view) {
        Intent intent= new Intent(Syllabus.this,Notes.class);
        startActivity(intent);
    }
}
