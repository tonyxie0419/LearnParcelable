package com.jikexueyuan.learnparcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 推荐使用此接口，开销比较小，但如果需要序列化以后用于网络传输或者到存储设备中，建议使用Serializable接口
 * 因为此接口在序列化和反序列化的过程比较复杂
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User(0, "Jim", false);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("user", user);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
