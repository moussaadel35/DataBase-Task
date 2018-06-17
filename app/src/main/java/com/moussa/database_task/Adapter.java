package com.moussa.database_task;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adapter extends BaseAdapter {


    LayoutInflater inflater=null;
    String[]ide;
    String [] names;
    String [] adresses;
    String [] emails;

    public Adapter(Activity a,String[]id, String []names, String []adresses, String[]emails)  {
        inflater = (LayoutInflater)a.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
   //     this.cust_no=cust_no;
        this.ide=id;
    this.names=names;
    this.adresses=adresses;
    this.emails=emails;

    }

    @Override
    public int getCount() {
        return this.names.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vi = convertView;

        if(convertView==null)
            vi = inflater.inflate(R.layout.row_design, null);

TextView id = vi.findViewById(R.id.id);
id.setText(ide[position]);
   TextView     name = (TextView) vi.findViewById(R.id.des_name);
        name.setText(names[position]);

      TextView  address = (TextView) vi.findViewById(R.id.des_address);
        address .setText(adresses[position]);
  TextView email = (TextView) vi.findViewById(R.id.des_email);
        email.setText(emails[position]);

        return vi;


    }
}
