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
        startActivity(intent);
    }
}