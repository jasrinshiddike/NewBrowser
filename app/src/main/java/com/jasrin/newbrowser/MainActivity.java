package com.jasrin.newbrowser;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int splashTimeOut=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);

                finish();
            }
        },splashTimeOut);


    }
}
