package com.moussa.database_task;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String SAMPLE_DB_NAME = "mytable";

Database mDatabaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button insert = findViewById(R.id.insert);
        Button updated_list = findViewById(R.id.updated_data);

        updated_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in);
            }
        });

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Insert_data.class);
                startActivity(in);
            }
        });

        final Database db = new Database(getApplicationContext());

        Cursor r = db.selectQuery();
        String id[] = new String[r.getCount()];
        String names[] = new String[r.getCount()];
        String adresses[] = new String[r.getCount()];
        String emails[] = new String[r.getCount()];

        for (int i = 0; i < names.length; i++) {
            r.moveToNext();
            id[i] = r.getString(0);
            names[i] = r.getString(1);
            adresses[i] = r.getString(2);
            emails[i] = r.getString(3);
        }

        Adapter x = new Adapter(this, id, names, adresses, emails);

        final ListView list = (ListView) findViewById(R.id.listview);
        list.setAdapter(x);
//registerForContextMenu(list);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view.findViewById(R.id.des_name);
                TextView add = view.findViewById(R.id.des_address);
                TextView em = view.findViewById(R.id.des_email);
                String name = textView.getText().toString();
                String address = add.getText().toString();
                String email = em.getText().toString();
                Intent editScreenIntent = new Intent(MainActivity.this, EditDataActivity.class);
                editScreenIntent.putExtra("name", name);
                editScreenIntent.putExtra("address", address);
                editScreenIntent.putExtra("email", email);
                startActivity(editScreenIntent);
            }
        });

    }
    }