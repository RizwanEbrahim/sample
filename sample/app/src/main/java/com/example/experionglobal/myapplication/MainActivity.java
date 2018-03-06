package com.example.experionglobal.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btnAction);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToSecondActivity();
            }

        });
    }
    private void goToSecondActivity() {


        Intent intent = new Intent(this, Main2Activity.class);

        startActivity(intent);

    }

}

