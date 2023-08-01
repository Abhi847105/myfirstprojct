package com.example.collagetradehub;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class JavaTutorial extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment fragment1, fragment2, fragment3;
    private Fragment activeFragment;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_tutorial);


        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        // Create instances of your fragments
        fragment1 = new HomeFragment();
        fragment2 = new ContentFragment();
        fragment3 = new NotificationFragment();

        // Set the initial fragment to be shown
        activeFragment = fragment1;
        loadFragment(activeFragment);

        // Set click listener for BottomNavigationView items
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.Home:
                    loadFragment(fragment1);
                    return true;
                case R.id.Content:
                    loadFragment(fragment2);
                    return true;
                case R.id.Notification:
                    loadFragment(fragment3);
                    return true;
            }
            return false;
        });
    }

    // Function to load a selected fragment
    private void loadFragment(Fragment fragment) {
        if (fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (!fragment.isAdded()) {
                transaction.add(R.id.frameLayout, fragment);
            }
            transaction.hide(activeFragment);
            transaction.show(fragment);
            transaction.commit();
            activeFragment = fragment;
        }
    }

}
