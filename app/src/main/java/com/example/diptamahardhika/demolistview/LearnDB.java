package com.example.diptamahardhika.demolistview;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dipta Mahardhika on 11/2/2015.
 * https://www.youtube.com/watch?v=ge7m4nWmggs  7:29
 * this class is still an experimental class, and not yet connected with the main app
 */
public class LearnDB extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "diptadatabase";
    private static final String TABLE_NAME = "TABLEAKU";
    private static final String UID = "_id";
    private static final String NAME = "Name";
    private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+" ("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+NAME+" VARCHAR(255);";
    private static final int DATABASE_VERSION = 1;

    public LearnDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate (SQLiteDatabase db){
        try {
            db.execSQL(CREATE_TABLE);
        } catch (SQLException e){e.printStackTrace();}
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS TABLEAKU");
        onCreate(db);
    }

}
