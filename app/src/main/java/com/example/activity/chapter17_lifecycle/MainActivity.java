package com.example.activity.chapter17_lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTodo = (TextView) findViewById(R.id.todo);
        edt = (EditText) findViewById(R.id.edt);
        linear = (LinearLayout) findViewById(R.id.linear);

        String msg = "Instructions: \n" + "0. New instance (onCreate, onStart, onResume) \n"
                + "1. Back Arrow (onPause, onStop, onDestroy) \n"
                + "2. Finish (onPause, onStop, onDestroy) \n" + "3. Home (onPause, onStop) \n"
                + "4. After 3 > App Tab > re-execute current app \n"
                + " (onRestart, onStart, onResume) \n"
                + "5. Run DDMS > Receive a phone call or SMS \n"
                + " (onRestart, onStart, onResume) \n" + "6. Enter some data - repeat steps 1-5 \n";
        tvTodo.setText(msg);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(getBaseContext(), "onRestoreInstanceState...BUNDLING", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getBaseContext(), "onSaveInstanceState...BUNDLING", Toast.LENGTH_LONG).show();
    }
}
