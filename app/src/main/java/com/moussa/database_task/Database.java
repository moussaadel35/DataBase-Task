package com.moussa.database_task;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class Database extends SQLiteOpenHelper {
    final String NAME="cust_name";
    final String    ADDRSS = "cust_address";
    final String    EMAIL="cust_email";
    final String    TABLE_NAME="mytable";
    final String ID = "cust_no";


    public Database(Context context) {
        super(context, "mytable", null, 1);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL("CREATE TABLE mytable(cust_no INTEGER PRIMARY KEY AUTOINCREMENT , cust_name VARCHAR(100),cust_address VARCHAR(100), cust_email VARCHAR(100))");
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion > oldVersion) {
        if (newVersion > oldVersion) {
        db.execSQL("DROP TABLE mytable");
            }
        }
    }



    public boolean insert(String name,String address,String email){
        try{
            ContentValues  values = new ContentValues();
values.put(NAME,name);
values.put(ADDRSS,address);
values.put(EMAIL,email);
SQLiteDatabase db = getWritableDatabase();
db.insert(TABLE_NAME,null,values);
            return true;
        }
        catch (Exception e){
            return  false;
        }
    }



    public boolean delete(String name,String address ,String email){

        try{
    SQLiteDatabase x=this.getWritableDatabase();
    x.execSQL("DELETE FROM mytable WHERE cust_name='"+name+"' AND   cust_address ='"+address+"'  AND " +
    " cust_email ='"+email+"'  ");
return true;
        }
        catch (Exception e){
            return  false;
        }
    }


    public Cursor selectQuery()
    {
        SQLiteDatabase myDB = this.getReadableDatabase();
        return myDB.rawQuery("SELECT * FROM mytable", null );
    }



    public boolean update(String name , String address,String email){

      String id_st;
            String query = "SELECT cust_no FROM " + TABLE_NAME + " WHERE " + NAME + " = '" + name +
                    "'  AND   cust_address ='"+address+"'    AND   cust_email ='"+email+"'        ";
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor res = db.rawQuery(query, null);
            int id=-1;
            if(res!=null&&res.moveToFirst())
            id=res.getInt(res.getColumnIndex("cust_no"));
             id_st= String.valueOf(id);

        try {
            ContentValues  values = new ContentValues();
            values.put(NAME,name);
            values.put(ADDRSS,address);
            values.put(EMAIL,email);
            SQLiteDatabase up = getWritableDatabase();
            db.update(TABLE_NAME,values,id_st,null);
            return true;
        }catch (Exception e){
            return false;
        }
    }



}