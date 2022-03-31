package com.example.firstapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class activity_input extends AppCompatActivity {

    EditText editNama,editAlamat,editNoTelepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        editNama = findViewById(R.id.inputNama);
        editAlamat = findViewById(R.id.inputAlamat);
        editNoTelepon = findViewById(R.id.inputNoTelepon);
    }

    public void halamanKonfirmasi(View view) {
        Intent intent = new Intent(this, activity_detail_input.class);
        intent.putExtra("nama",editNama.getText().toString());
        intent.putExtra("alamat",editAlamat.getText().toString());
        intent.putExtra("telepon",editNoTelepon.getText().toString());
        startActivity(intent);
    }

}