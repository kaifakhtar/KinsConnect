package com.kaif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class FloatingButtonAddContact extends AppCompatActivity implements View.OnClickListener {
    private static final int RESULT_PICK_CONTACT =1;
    TextView tx;
    View fab;
    ChipGroup chipGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_button_add_contact);
        chipGroup=findViewById(R.id.chipgroup);
         fab =findViewById(R.id.floatingActionButton);
            //tx=findViewById(R.id.contactText);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent (Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult (in, RESULT_PICK_CONTACT);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case RESULT_PICK_CONTACT:
                    contactPicked(data);
                    break;
            }
        } else {
            Toast.makeText(this, "Failed To pick contact", Toast.LENGTH_SHORT).show();
        }
    }
    private void contactPicked(Intent data) {
        Cursor cursor = null;

        try {
            String phoneNo = null;
            String name = null;
            Uri uri = data.getData ();
            cursor = getContentResolver ().query (uri, null, null,null,null);
            cursor.moveToFirst ();
            int phoneIndex = cursor.getColumnIndex (ContactsContract.CommonDataKinds.Phone.NUMBER);
            int nameIndex = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);
            phoneNo = cursor.getString (phoneIndex);
            name = cursor.getString (nameIndex);
           // tx.setText (name);
            //Chip chip=new Chip(this);
            LayoutInflater inflater = LayoutInflater.from(this);

            // Create a Chip from Layout.
            Chip chip = (Chip) inflater.inflate(R.layout.layout_entry_chip, this.chipGroup, false);
            chip.setText(name);
            chip.setChipIcon(ContextCompat.getDrawable(this,R.drawable.person));
            chip.setCloseIconVisible(true);
            chip.setClickable(false);
            chip.setCheckable(false);
            chip.setOnCloseIconClickListener(this);

            chipGroup.addView(chip);
            this.chipGroup.addView(chip);
            chipGroup.setVisibility(View.VISIBLE);

        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void onClick(View view) {
        Chip chip=(Chip) view;
        chipGroup.removeView(chip);
    }
}