package com.example.parktaejun.todo.Option;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.parktaejun.todo.Font.Font;
import com.example.parktaejun.todo.R;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Font.setGlobalFont(this, getWindow().getDecorView());
    }
}
