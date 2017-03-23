package com.example.robertsenini.seninia3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadweb1(View view)
    {
        Intent intent = new Intent(this, Web1.class);
        startActivity(intent);
    }

    public void loadweb2(View view)
    {
        Intent intent = new Intent(this, Web2.class);
        startActivity(intent);
    }
}
