package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private Button button2;
    private TextView tv2;
    private TextView tev2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button2=findViewById(R.id.button2);
        tv2=findViewById(R.id.tv2);
        tev2=findViewById(R.id.tеv2);

        String nameReceived = getIntent().getStringExtra("NAME");
        tev2.setText(nameReceived);

        Button button2 = (Button) findViewById(R.id.button2);
        View.OnClickListener oclButton1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);

            }
        };
        button2.setOnClickListener(oclButton1);
    }
}