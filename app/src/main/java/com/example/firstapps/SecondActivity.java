package com.example.firstapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.firstapps.model.UserModel;

public class SecondActivity extends AppCompatActivity {

    EditText editEmail,editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
    }

    public void login(View view) {
        UserModel user = new UserModel();
        user.setEmail(editEmail.getText().toString());
        user.setPassword(editPassword.getText().toString());

        Intent intent = new Intent(this,HomeActivity.class);
        intent.putExtra("user",user);
        startActivity(intent);
        finish();
    }
}