package com.ajarihantjain54gmail.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private TextView textView;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);
         textView = (TextView) findViewById(R.id.text);


    }
    private void showMessage() {

        if (i % 2 == 0) {
            textView.setText("Hello World!"); //set text for text view
            i++;
        } else {
            textView.setText("Goodbye World!");
            i++;


        }
    }

    @Override
    public void onClick(View v) {
        showMessage();

    }
}
