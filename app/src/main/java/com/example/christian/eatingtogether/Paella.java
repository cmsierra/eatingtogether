package com.example.christian.eatingtogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Paella extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paella);
    }
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Taco.class);
        startActivity(intent);
    }
    public void sendMessage2(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, food1.class);
        startActivity(intent);
    }


}
