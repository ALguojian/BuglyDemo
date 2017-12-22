package com.alguojian.bugly.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alguojian.bugly.R;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    protected Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main2);
        initView();
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, Main2Activity.class);
        context.startActivity(starter);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {

            Intent ii = new Intent(this,Main3Activity.class);
            startActivity(ii);

        }
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(Main2Activity.this);
    }
}
