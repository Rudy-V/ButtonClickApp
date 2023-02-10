package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText userInput = (EditText) findViewById(R.id.editTextTextPersonName);
        Button button = (Button) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.textView);

        userInput.setText("");
        textView.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());

        View.OnClickListener ourOnClickListener = view -> {
            String result = userInput.getText().toString();
            if (!result.equals("")){
                result = result + "\n";
                textView.append(result);
                userInput.setText("");
            }
        };

        button.setOnClickListener(ourOnClickListener);

    }
}