package com.example.laborator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        TextView txtView1 = findViewById(R.id.txtView1);
        TextView txtView2 = findViewById(R.id.txtView2);
        TextView txtView3 = findViewById(R.id.txtView3);

        TextView editText1 = findViewById(R.id.editText1);
        TextView editText2 = findViewById(R.id.editText2);
        TextView editText3 = findViewById(R.id.editText3);

        txtView1.setText(editText1.getText().toString());
        txtView2.setText(editText2.getText().toString());
        txtView3.setText(editText3.getText().toString());
    }
}