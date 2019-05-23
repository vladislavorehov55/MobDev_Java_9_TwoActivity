package com.example.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    Button btnActTwo;
    EditText edittxt;
    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        edittxt = (EditText) findViewById(R.id.edittext);
        btnActTwo.setOnClickListener(this);

        Log.d(TAG, "MainActivity: onCreate()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                Intent intent = new Intent(this, ActivityTwo.class);
                intent.putExtra("Name", edittxt.getText());
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity: onRestart()");
}}
