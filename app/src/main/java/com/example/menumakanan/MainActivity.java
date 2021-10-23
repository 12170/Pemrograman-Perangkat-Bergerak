package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[], s3[];
    int images[] = {R.drawable.rawon, R.drawable.soto, R.drawable.sate, R.drawable.semanggi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.menuMakanan);
        s2 = getResources().getStringArray(R.array.hargaMakanan);
        s3 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public void bukaSecond(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}