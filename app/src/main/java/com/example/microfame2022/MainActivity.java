package com.example.microfame2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(final android.view.View v) {
        switch (v.getId()) {
            case R.id.Register:
                Intent Register_Activity = new Intent(MainActivity.this, Register_Activity.class);
                startActivity(Register_Activity);
                break;
        }
    }
}