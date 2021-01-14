package com.example.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mBtnNavigate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","onCreate");


//        intent explicit : gui du lieu giữa các màn hình với nhau
//        intent implicit : thuc hien hanh dong ko cụ thể

        mBtnNavigate = findViewById(R.id.buttonNavigateScreen2);
        mBtnNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy");
    }
}