package com.kaif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PriorityButtons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priority_buttons);
    }

    public void priority1_clicked(View view) {
        Intent intent = new Intent(this, FloatingButtonAddContact.class);
        //Intent i = new Intent(CurrentActivity.this, NewActivity.class);
        intent.putExtra("PRIORITY","1");
        startActivity(intent);
    }
    public void priority2_clicked(View view) {
        Intent intent = new Intent(this, FloatingButtonAddContact.class);
        //Intent i = new Intent(CurrentActivity.this, NewActivity.class);
        intent.putExtra("PRIORITY","2");
        startActivity(intent);
    }
    public void priority3_clicked(View view) {
        Intent intent = new Intent(this, FloatingButtonAddContact.class);
        //Intent i = new Intent(CurrentActivity.this, NewActivity.class);
        intent.putExtra("PRIORITY","3");
        startActivity(intent);
    }
}