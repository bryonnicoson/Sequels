package com.bryonnicoson.sequels;

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

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
