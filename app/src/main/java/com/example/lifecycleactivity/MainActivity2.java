package com.example.lifecycleactivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button mBtnNavigate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mBtnNavigate = findViewById(R.id.buttonNavigateScreen1);

        mBtnNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Log.d("BBB", "Main2 : onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Main2 : onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Main2 :onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Main2 :onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Main2 :onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Main2 :onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Main2 :onDestroy");
    }
}