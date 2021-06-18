package com.geekchtech.android1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;
    public static final int THIRD_ACTIVITY_CODE = 85;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.numbers);
    }


    public void click(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivityForResult(intent,THIRD_ACTIVITY_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == MainActivity3.RESULT_OK && requestCode == THIRD_ACTIVITY_CODE){
            String result = data.getStringExtra(MainActivity3.RESULT);
            textView.setText(result);
        } else {
            Toast.makeText(this,"Результат не удался",Toast.LENGTH_LONG).show();
        }
    }
}