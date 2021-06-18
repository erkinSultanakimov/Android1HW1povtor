package com.geekchtech.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    private EditText editText;
    public static final String RESULT = "result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editText = findViewById(R.id.number_edit);

    }

    public void click(View view) {
        Intent intent = new Intent();

        intent.putExtra(RESULT, editText.getText().toString());
        setResult(MainActivity3.RESULT_OK,intent);
        finish();


    }
}