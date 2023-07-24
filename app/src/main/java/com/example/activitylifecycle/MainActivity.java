package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "OnCreate()", Toast.LENGTH_SHORT).show();

        TextView textView = findViewById(R.id.textView1);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //to move from one activity to another.
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();

        Toast.makeText(this, "OnStart()", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume(){
        super.onResume();

        Toast.makeText(this, "OnResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();

        Toast.makeText(this, "OnPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();

        Toast.makeText(this, "OnStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        Toast.makeText(this, "OnRestart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Toast.makeText(this, "OnDestroy()", Toast.LENGTH_SHORT).show();
    }

}