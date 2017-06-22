package com.jikexueyuan.learnparcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        User newUser = getIntent().getParcelableExtra("user");
        System.out.println(newUser.getUsername());
    }
}
