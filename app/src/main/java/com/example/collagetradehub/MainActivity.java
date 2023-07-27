package com.example.collagetradehub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        EditText editTextEmail= findViewById(R.id.EtUI);
        EditText editText1=findViewById(R.id.EtP);



        MaterialButton btnLI=(MaterialButton) findViewById(R.id.btnLI);

        btnLI.setOnClickListener(view ->{


            String email = editTextEmail.getText().toString().trim();
            String password =editText1.getText().toString().trim();

            if(email.isEmpty() || password.isEmpty())
            {
                Toast.makeText(MainActivity.this, "Please enter email and password", Toast.LENGTH_SHORT).show();
            }else{
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, go to the main activity or do something else
                                    openMainActivity();
                                    Toast.makeText(MainActivity.this, "Sign in success", Toast.LENGTH_SHORT).show();


                                } else {
                                    // Sign in failed, display a message to the user
                                    Toast.makeText(MainActivity.this, "Sign in failed: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }

                }


                );


    }
         public void button(View view) {

          Intent intent=new Intent(this,SignUpActivity.class);
          startActivity(intent);

    }

    private void openMainActivity() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
        finish(); // Optional: You can finish the SignInActivity so that pressing back won't go back to it.
    }
}

