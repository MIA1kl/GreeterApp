package com.example.android.greeter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText a = (EditText) findViewById(R.id.editTextTextPersonName);
                TextView res = (TextView) findViewById(R.id.textView);
                String name = a.getText().toString();

                if(name.length()==0){
                    res.setText("Write your name");
                }
                else {
                    res.setText("Hello, " + name);
                }
            }
        });

    }
}