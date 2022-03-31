package com.example.firstapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_detail_input extends AppCompatActivity {

    TextView textNama,textAlamat,textTelepon;
    EditText editTelepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_input);
        textNama = findViewById(R.id.textNama);
        String nama=getIntent().getExtras().getString("nama");
        textNama.setText(nama);
        textAlamat = findViewById(R.id.textAlamat);
        String alamat=getIntent().getExtras().getString("alamat");
        textAlamat.setText(alamat);
        textTelepon = findViewById(R.id.textTelepon);
        String telepon=getIntent().getExtras().getString("telepon");
        textTelepon.setText(telepon);

    }

    public void dial(View view) {
        String data= textTelepon.getText().toString();
        Intent nomor = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+data));
        startActivity(nomor);
    }
}