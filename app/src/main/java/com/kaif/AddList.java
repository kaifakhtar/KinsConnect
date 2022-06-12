package com.kaif;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddList extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_list);
    }
    public void GotoPriorityButtons(View view) {
        Intent intent = new Intent(this, PriorityButtons.class);

        startActivity(intent);
    }
}
