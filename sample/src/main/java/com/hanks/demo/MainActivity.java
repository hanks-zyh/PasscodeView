package com.hanks.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void passcode(View view){
        startActivity(new Intent(this,PasscodeActivity.class));
    }
    public void passcode2(View view){
        startActivity(new Intent(this,PasscodeActivity2.class));
    }
    public void passcode3(View view){
        startActivity(new Intent(this,PasscodeActivity3.class));
    }
}
