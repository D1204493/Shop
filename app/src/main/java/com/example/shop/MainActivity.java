package com.example.shop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void eatPage(View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.eatogether.com.tw/zh-TW/store/EAT008"));
        startActivity(i);
    }

    public void callPhone(View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel: +12345"));
        startActivity(i);
    }

    public void GotoEAT(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:24.163905742424483, 120.64456305168923"));
        startActivity(i);
    }

    public void orderOnline(View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.feastogether.com.tw/booking/Eatogether"));
        startActivity(i);
    }


}