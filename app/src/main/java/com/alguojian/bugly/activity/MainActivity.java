package com.alguojian.bugly.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alguojian.bugly.R;

public class MainActivity extends AppCompatActivity {

    protected TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        init();
        initView();
    }

    private void init() {

        text.setOnClickListener(v -> Main2Activity.start(this));
    }

    private void initView() {
        text = findViewById(R.id.text);
    }
}
