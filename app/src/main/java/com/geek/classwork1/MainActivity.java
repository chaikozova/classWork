package com.geek.classwork1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.helloWorld);
        btn = findViewById(R.id.btn);
        final int[] language = {1};


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (language[0] == 1) {
                    language[0] = 2;
                    text.setText("Привет мир!");
                }
                else {
                    language[0] = 1;
                    text.setText("Hello World!");
                }
            }
        });
    }
}