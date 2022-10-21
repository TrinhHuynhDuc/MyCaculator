package com.example.mycaculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBang = (Button) findViewById(R.id.b64);
        TextView kq = (TextView) findViewById(R.id.kq);
        btnBang.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                kq.setText("okkkk");
            }
        });
        
    }
}