package com.example.hrankinoleksandr.simplelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.tv_names);

        String[] numbers = {"one", "two", "three", "four", "five", "three", "four", "five"};

        list.setText("");
        for (String n : numbers) {
            list.append(n + "\n");
        }
    }
}
