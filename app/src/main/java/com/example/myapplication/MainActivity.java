package com.example.myapplication;

import static android.content.ContentValues.TAG;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Declaration of variables to be used in app
    private EditText userInput;
    private TextView textView;
    private final String TEXT_CONTENTS = "TextContents";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // This is logging
        Log.d(TAG, "onCreate: This method has started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editTextTextPersonName);
        userInput.setText("");
        Button button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
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
        Log.d(TAG, "onCreate: This method has ended");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: This method has started");
        super.onStart();
        Log.d(TAG, "onStart: this method has ended");
    }

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState){
        Log.d(TAG, "onRestoreInstanceState: this method has started");
        super.onRestoreInstanceState(saveInstanceState);
        textView.setText(saveInstanceState.getString(TEXT_CONTENTS));
        Log.d(TAG, "onRestoreInstanceState: this method has ended");
    }

    @Override
    protected void onRestart(){
        Log.d(TAG, "onRestart: this method has started");
        super.onRestart();
        Log.d(TAG, "onRestart: this method has ended");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: this method has started");
        super.onResume();
        Log.d(TAG, "onResume: this method has ended");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: this method has started");
        super.onPause();
        Log.d(TAG, "onPause: this method has ended");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: this method has started");
        outState.putString(TEXT_CONTENTS, textView.getText().toString());
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: this method has ended");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: this method has started");
        super.onStop();
        Log.d(TAG, "onStop: this method has ended");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: this method has started");
        super.onDestroy();
        Log.d(TAG, "onDestroy: this method has ended");
    }
}