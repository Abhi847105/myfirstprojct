package com.example.collagetradehub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Home2 extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.HNv);
        toolbar = findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.OpenDrawer, R.string.CloseDrawer);


        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        loadFragment(new JavaFragment());

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id==R.id.Java)
                {
                    loadFragment(new HomeFragment());
                }else if (id==R.id.C)
                {
                    Toast.makeText(Home2.this, "open C++", Toast.LENGTH_SHORT).show();
                }else if (id==R.id.html)
                {
                    Toast.makeText(Home2.this, "html", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(Home2.this, "Android Developing", Toast.LENGTH_SHORT).show();
                }

              drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    private void loadFragment(Fragment fragment) {

        FragmentManager fm= getSupportFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.fragContainer, fragment);
        ft.commit();
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