package com.example.firstapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CallLog;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText editNama,editAngka1,editAngka2,editNomor;
    TextView text,textHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAngka1 = findViewById(R.id.editAngka1);
        editAngka2 = findViewById(R.id.editAngka2);
        textHasil = findViewById(R.id.textHasil);
        editNomor = findViewById(R.id.editNomor);

        text= findViewById(R.id.textView);
        text.setText(new Date().toString());
        editNama = findViewById(R.id.editNama);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = editNama.getText().toString() ;
                text.setText(nama);
            }
        });
    }

    public void penambahan(View view) {
        int angka1 = Integer.parseInt(editAngka1.getText().toString());
        int angka2 = Integer.parseInt(editAngka2.getText().toString());
        textHasil.setText(String.valueOf(angka1+angka2) );
    }

    public void halamanSelanjutnya(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void pergiDialup(View view) {
        String data= editNomor.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+data));
        startActivity(intent);
    }

//    public void Submit(View view) {
//        Toast.makeText(getApplicationContext(),"Mantap",Toast.LENGTH_SHORT).show();
//    }
}