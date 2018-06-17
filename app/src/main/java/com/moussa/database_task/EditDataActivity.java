package com.moussa.database_task;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditDataActivity extends AppCompatActivity {
    private static final String TAG = "EditDataActivity";

    public Button btnSave,btnDelete,back;
     public EditText editable_item;
    public EditText for_address,for_email;

    Database mDatabaseHelper;

     String selectedName;
    String selectedAddress;
    String selectedEmail;
     int selectedID;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        back=findViewById(R.id.back);
        editable_item = (EditText) findViewById(R.id.editable_item);
        for_address=findViewById(R.id.edit_adress);
        for_email=findViewById(R.id.edit_mail);

back.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
});

        mDatabaseHelper = new Database(this);

        Intent receivedIntent = getIntent();



        selectedName = receivedIntent.getStringExtra("name");
        selectedAddress = receivedIntent.getStringExtra("address");
        selectedEmail = receivedIntent.getStringExtra("email");


        //set the text to show the current selected name
        editable_item.setText(selectedName);
        for_address.setText(selectedAddress);
        for_email.setText(selectedEmail);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // updated values
                String updated_name = editable_item.getText().toString();
                String updated_address= for_address.getText().toString();
                String updated_email=for_email.getText().toString();

                // check emails contains @ sign....
                if (updated_email.contains("@")) {
                    if (mDatabaseHelper.update(updated_name, updated_address, updated_email) == true) {

                        Toast.makeText(EditDataActivity.this, "Data Is Updated", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(EditDataActivity.this, "Your E-mail Must Contains '@' sign. ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mDatabaseHelper.delete(selectedName,selectedAddress,selectedEmail)==true) {
                    editable_item.setText("");
                    for_address.setText("");
                    for_email.setText("");
                    toastMessage("removed from database");
                }
                }
        });

    }
    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}
