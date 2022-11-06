package com.example.sqlite_db_demo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {

    //creating a constant variables for our database.
    //below variable is for our database name.
    private static final String DB_Name = "coursedb";

    //below int is our database version
    private static final int DB_VERSION = 1;

    //below variable is for our table name.
    private static final String TABLE_NAME = "mycourses";

    //below variable is for our ID Column.
    private static final String ID_COL = "id";

    //below variable is for our Course Name column.
    private static final String NAME_COL = "name";

    //below variable is for our course duration column.
    private static final String DURATION_COL = "duration";

    //below variable is for our cour description column.
    private static final String DESCRIPTION_COL = "description";

    //below variable is for our course tracks column.
    private static final String TRACKS_COL = "tracks";



    public DBHandler(@Nullable Context context) {
        super(context, DB_Name, null, DB_VERSION);
    }
    /*Close: constructor*/

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME
                      +" ( "
                      + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                      + NAME_COL + " TEXT,"
                      + DURATION_COL + " TEXT,"
                      + DESCRIPTION_COL + " TEXT,"
                      + TRACKS_COL + " TEXT"
                      +" ) ";

        db.execSQL(query);
    }
    /*close: onCreate()*/

    public void addNewCourse(String courseName, String courseDuration, String courseDescription, String courseTracks){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NAME_COL, courseName);
        values.put(DURATION_COL, courseDuration);
        values.put(DESCRIPTION_COL, courseDescription);
        values.put(TRACKS_COL, courseTracks);

        /*After adding all values, we are passing values to table*/
        db.insert(TABLE_NAME, null, values);
        db.close();
    }
    /*Close: addNewCourse()*/

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    /*close: onUpgrade()*/

}
/*Close: Class DBHandler*/
