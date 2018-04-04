package com.example.yang.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by yang on 2018/2/1.
 */

public class TwoActivity extends AppCompatActivity {

    public static void create(Context context) {
        Intent intent = new Intent(context, TwoActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        JNIUitl jniUitl = new JNIUitl();

        TextView jni_text = findViewById(R.id.jni_text);
        jni_text.setText(jniUitl.text());
    }
}
