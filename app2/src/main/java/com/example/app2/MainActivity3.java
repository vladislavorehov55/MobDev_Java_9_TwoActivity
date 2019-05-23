package com.example.app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    Button btnActOne;
    Button btnActTwo;
    Button btnActFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        btnActOne = (Button) findViewById(R.id.btnActOne);
        btnActOne.setOnClickListener(this);
        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
        btnActFour = (Button) findViewById(R.id.btnActFour);
        btnActFour.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActOne:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btnActTwo:
                Intent intent1 = new Intent(this, MainActivity2.class);
                startActivity(intent1);
                break;
            case R.id.btnActFour:
                Intent intent2 = new Intent(this, MainActivity4.class);
                startActivity(intent2);
                break;
        }
    }
}
