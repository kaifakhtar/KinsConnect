package com.kaif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next=findViewById(R.id.next);
    }
    public void GotoAddList(View view) {
        Intent intent = new Intent(this, AddList.class);
        //EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
      // String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}