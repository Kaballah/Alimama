package com.example.alimama;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mAuth;

    private TextView textView74, textView75;
    private EditText editTextTextPersonName, editTextTextPersonName2;
    private Button button10;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        textView74 = findViewById(R.id.textView74);
        textView75 = findViewById(R.id.textView75);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        button10 = findViewById(R.id.button10);
        progressBar = findViewById(R.id.progressBar);

        textView75.setOnClickListener(this);
        button10.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.textView75:
                startActivity(new Intent(this, Register.class));
                break;
            case R.id.button10:
                userMainActivity();
                break;
        }
    }

    private void userMainActivity() {
        String email = editTextTextPersonName.getText().toString();
        String password = editTextTextPersonName2.getText().toString();

        if(email.isEmpty()) {
            editTextTextPersonName.setError("Email is required!");
            editTextTextPersonName.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editTextTextPersonName.setError("Enter a valid email!");
            editTextTextPersonName.requestFocus();
            return;
        }

        if(password.isEmpty()) {
            editTextTextPersonName2.setError("Password is required!");
            editTextTextPersonName2.requestFocus();
            return;
        }

        if(password.length() < 6) {
            editTextTextPersonName2.setError("Provide a stronger password!");
            editTextTextPersonName2.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()) {
                    progressBar.setVisibility(View.GONE);
                    startActivity(new Intent(MainActivity.this, Account.class));
                } else {
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Failed to login! Please check your credentials and try again", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}