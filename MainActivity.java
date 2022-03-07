package com.example.clicer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String LOG_TAG = "myLogs";
    Integer counter = 0;

    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("Count");
        Log.d(LOG_TAG, "onRestoreInstanceState");
    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Count", counter);
        Log.d(LOG_TAG, "onSaveInstateState");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Инициализация Активности
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }

    public void onClickBtnAddStudents(View view) {
        counter+=1;
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
        if (counter >= 10){
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams oval = layout.getLayoutParams();
            oval.height = 400;
            oval.width = 400;
            layout.setLayoutParams(oval);

        }
        if (counter >= 100){
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams oval = layout.getLayoutParams();
            oval.height = 450;
            oval.width = 450;
            layout.setLayoutParams(oval);

        }
        if (counter >= 1000){
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams oval = layout.getLayoutParams();
            oval.height = 500;
            oval.width = 500;
            layout.setLayoutParams(oval);

        }
    }
}