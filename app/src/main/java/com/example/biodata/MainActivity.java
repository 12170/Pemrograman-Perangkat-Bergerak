package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.net.Uri.*;

public class MainActivity extends AppCompatActivity {

    Button btnalamat, btntelpon, btnemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnalamat = findViewById(R.id.btn_alamat);
        btnalamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewku = new Intent(Intent.ACTION_VIEW);
                viewku.setData(Uri.parse("https://www.google.com/maps/@-7.3132514,112.6907448,20.63z"));
                startActivity(viewku);
            }
        });

        btntelpon = findViewById(R.id.btn_telpon);
        btntelpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomor = "081216554050";
                Intent memanggil = new Intent(Intent.ACTION_DIAL);
                memanggil.setData(fromParts("tel", nomor, null));
                startActivity(memanggil);
            }
        });

        btnemail = findViewById(R.id.btn_email);
        btnemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailku = "lutfias0702@gmail.com";
                Intent panggil = new Intent(Intent.ACTION_SENDTO);
                panggil.setData(fromParts("mailto", emailku, null));
                startActivity(panggil);
            }
        });
    }
}