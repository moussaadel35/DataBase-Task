package com.moussa.database_task;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Insert_data extends AppCompatActivity {
    Database db = new Database(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);
        Button save =findViewById(R.id.final_save);
        Button menu = findViewById(R.id.updated_menu);
        EditText name,address,email;
        name=findViewById(R.id.inserted_name);
        address=findViewById(R.id.inserted_address);
        email= findViewById(R.id.inserted_mail);



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name,address,email;
                name=findViewById(R.id.inserted_name);
                address=findViewById(R.id.inserted_address);
                email= findViewById(R.id.inserted_mail);

                String getted_name =name.getText().toString();
                String getted_addres=address.getText().toString();
                String getted_email= email.getText().toString();
if (getted_email.contains("@")==true) {
    if (db.insert(getted_name, getted_addres, getted_email) == true) {
        Toast.makeText(Insert_data.this, "Inserted", Toast.LENGTH_SHORT).show();
    } else {
        Toast.makeText(Insert_data.this, "Not Inserted", Toast.LENGTH_SHORT).show();
    }
}else Toast.makeText(Insert_data.this, "Your E-mail Must Contains '@' sign. ", Toast.LENGTH_SHORT).show();
            }
        });


        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(Insert_data.this,MainActivity.class);
                startActivity(in);
            }
        });

    }
}
