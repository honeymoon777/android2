package com.example.firstapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.firstapps.model.UserModel;

public class HomeActivity extends AppCompatActivity {

    TextView textEmail,textPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textEmail = findViewById(R.id.textEmail);
        textPassword = findViewById(R.id.textPassword);


        UserModel user = getIntent().getExtras().getParcelable("user");
        textEmail.setText(user.getEmail());
        textPassword.setText(user.getPassword());
    }


}