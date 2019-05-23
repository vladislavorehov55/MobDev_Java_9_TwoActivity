package com.example.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.actOne:
                Intent intent1 = new Intent(this, Main1Activity.class);
                startActivity(intent1);
                break;
            case R.id.actTwo:
                Intent intent2 = new Intent(this, Main2Activity.class);
                startActivity(intent2);
                break;
            case R.id.actThree:
                Intent intent3 = new Intent(this, Main3Activity.class);
                startActivity(intent3);
                break;
            case R.id.actFour:
                Intent intent4 = new Intent(this, Main4Activity.class);
                startActivity(intent4);
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
