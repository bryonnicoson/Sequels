package com.bryonnicoson.sequels;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by bryon on 6/22/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final int DB_VERSION = 1;  // important: you must change this when you change structure
    public static final String DB_NAME = "ReallyBadSequels.db";
    public static final String CREATE_TABLE = "CREATE TABLE sequels ( id INT PRIMARY KEY, name TEXT);";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS sequels;";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }

    public void seedDatabase(){
        insertSequel(1, "Empire Strikes Back");
        insertSequel(2, "Toy Story 2");
        insertSequel(3, "Raiders of the Lost Ark");
        insertSequel(4, "Halloween 2");
        insertSequel(5, "Mulan 2");
        insertSequel(6, "Taken 2");
        insertSequel(7, "Jaws 2");
        insertSequel(8, "Deathwish 2");
        insertSequel(9, "Zoolander 2");
        insertSequel(10, "Breakin' 2: Electric Boogaloo");
    }

    public void insertSequel(int id, String name) {
        // INSERT INTO sequels VALUES(0, "Jaws 2");

        SQLiteDatabase db = getReadableDatabase();
        ContentValues values = new ContentValues();  // special type of hashmap for db values
        values.put("id", id);
        values.put("name", name);  // great place to put a breakpoint when debugging

        db.insert("sequels", null, values);
    }
}
