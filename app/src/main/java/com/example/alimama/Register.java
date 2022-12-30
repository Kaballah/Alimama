package com.example.alimama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mAuth;
    Button button11;
    EditText editTextTextPersonName3, editTextTextPersonName4,editTextTextPersonName5, editTextTextPersonName6;
    ProgressBar progressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        button11 = findViewById(R.id.button11);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
        progressBar2 = findViewById(R.id.progressBar2);

        button11.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button11:
                registerUser();
                break;
        }
    }

    private void registerUser() {
        String fullName = editTextTextPersonName3.getText().toString();
        String age = editTextTextPersonName4.getText().toString();
        String email = editTextTextPersonName5.getText().toString();
        String password = editTextTextPersonName6.getText().toString();

        if(fullName.isEmpty()) {
            editTextTextPersonName3.setError("Full Name is Required!");
            editTextTextPersonName3.requestFocus();
            return;
        }

        if(age.isEmpty()) {
            editTextTextPersonName4.setError("An age is required!");
            editTextTextPersonName4.requestFocus();
            return;
        }

        if(email.isEmpty()) {
            editTextTextPersonName5.setError("An email is required!");
            editTextTextPersonName5.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editTextTextPersonName5.setError("Please provide a valid email!");
            editTextTextPersonName5.requestFocus();
            return;
        }

        if(password.isEmpty()) {
            editTextTextPersonName6.setError("Enter a password!");
            editTextTextPersonName6.requestFocus();
            return;
        }

        if(password.length() < 6) {
            editTextTextPersonName6.setError("Enter a stronger password!");
            editTextTextPersonName6.requestFocus();
            return;
        }

        progressBar2.setVisibility(View.VISIBLE);

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            User user = new User(fullName, age, email);
                            FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if(task.isSuccessful()) {
                                                Toast.makeText(Register.this, "User has been registered successfully", Toast.LENGTH_LONG).show();
                                                progressBar2.setVisibility(View.GONE);
                                                startActivity(new Intent(Register.this, Login.class));
                                            } else {
                                                Toast.makeText(Register.this, "Failed to register the user. Try again shortly!", Toast.LENGTH_LONG).show();
                                                progressBar2.setVisibility(View.GONE);
                                            }
                                        }
                                    });
                        } else {
                            Toast.makeText(Register.this, "Failed to register the user. Try again shortly!", Toast.LENGTH_LONG).show();
                            progressBar2.setVisibility(View.GONE);
                        }
                    }
                });

    }
}