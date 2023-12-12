package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button1);
        tv1 = findViewById(R.id.tv1);

        Button button1 = (Button) findViewById(R.id.button1);
        View.OnClickListener oclButton1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);

                String nameToPass = tv1.getText().toString();
                intent.putExtra("NAME", nameToPass);
                startActivity(intent);

            }
        };
        button1.setOnClickListener(oclButton1);

    }
}