package com.example.christian.eatingtogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Verification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
    }
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, registering.class);
        startActivity(intent);
    }
}
