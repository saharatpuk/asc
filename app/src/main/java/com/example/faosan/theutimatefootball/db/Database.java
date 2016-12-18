package com.example.faosan.theutimatefootball.db;

import android.content.ContentValues;
import android.content.Context;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;





/**
 * Created by Faosan on 13/12/2016.
 */

public class Database extends SQLiteOpenHelper {
    private static final String DB_NAME = "UltimateFootball";
    private static final int DB_VERSION = 1;

    public static final String TABLE_NAME = "FootbaallData";

    public static final String COL_NAME  = "Name";
    public static final String COL_DATE = "data";
    public static final String COL_POSITION ="Position" ;
    public static final String COL_HEIGHT = "Height";
    public static final String COL_CLUB= "Club";
    public static final String COL_PLAYER_NUMBER = "Player";
    public static final String COL_PICTURE = "Pictuer";

    private static final String SQL_CRATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_NAME + " TEXT, "
                    + COL_DATE + " TEXT, "
                    + COL_POSITION + " TEXT, "
                    + COL_HEIGHT + " TEXT, "
                    + COL_CLUB + " TEXT, "
                    + COL_PLAYER_NUMBER + " TEXT, "
                    + COL_PICTURE + " TEXT"
                    + ")";

    public Database(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    public void insertInitialData(SQLiteDatabase db){
        ContentValues cv = new ContentValues();
        cv = new ContentValues();
        cv.put(COL_NAME, "Cristiano Ronaldo");
        cv.put(COL_DATE, "5 กุมภาพันธ์ 2528 (31 ปี)");
        cv.put(COL_POSITION, "Striker");
        cv.put(COL_HEIGHT, "1.85 cm");
        cv.put(COL_CLUB, "Real Madrid Club");
        cv.put(COL_PLAYER_NUMBER,"7");
        cv.put(COL_PICTURE,"ronaldo.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Lionel   Messi");
        cv.put(COL_DATE, "24 มิถุนายน 2530 (29 ปี)");
        cv.put(COL_POSITION, "Midfielder");
        cv.put(COL_HEIGHT, "1.70 cm");
        cv.put(COL_CLUB, "FC Barcelona");
        cv.put(COL_PLAYER_NUMBER,"10");
        cv.put(COL_PICTURE,"messi.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Gareth Bale");
        cv.put(COL_DATE, "16 กรกฎาคม 2532 (27 ปี)");
        cv.put(COL_POSITION, "Midfielder");
        cv.put(COL_HEIGHT, "1.83 cm");
        cv.put(COL_CLUB, "Real Madrid");
        cv.put(COL_PLAYER_NUMBER,"11");
        cv.put(COL_PICTURE,"bale.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Paul Pogba");
        cv.put(COL_DATE, "15 มีนาคม 2536 (23 ปี)");
        cv.put(COL_POSITION, "Midfielder");
        cv.put(COL_HEIGHT, "1.91 cm");
        cv.put(COL_CLUB, "Manchester United");
        cv.put(COL_PLAYER_NUMBER,"6");
        cv.put(COL_PICTURE,"pogba.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Aubameyang");
        cv.put(COL_DATE, "18 มิ.ย. 2532 (อายุ 27)");
        cv.put(COL_POSITION, "Striker ");
        cv.put(COL_HEIGHT, "1.85 cm");
        cv.put(COL_CLUB, "Borussia Dortmund");
        cv.put(COL_PLAYER_NUMBER,"17");
        cv.put(COL_PICTURE,"aubameyang.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Agüero");
        cv.put(COL_DATE, "2 มิถุนายน 2531 (28 ปี)");
        cv.put(COL_POSITION, "Striker ");
        cv.put(COL_HEIGHT, "1.73 cm");
        cv.put(COL_CLUB, "Manchester City");
        cv.put(COL_PLAYER_NUMBER,"10");
        cv.put(COL_PICTURE,"aguero.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Zlatan Ibrahimović");
        cv.put(COL_DATE, "3 ตุลาคม 2524 (35 ปี)");
        cv.put(COL_POSITION, "Striker ");
        cv.put(COL_HEIGHT, "1.95 cm");
        cv.put(COL_CLUB, "Manchester United");
        cv.put(COL_PLAYER_NUMBER,"9");
        cv.put(COL_PICTURE,"zlatan.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Manuel  Neuer ");
        cv.put(COL_DATE, "27 มีนาคม 2529 (30 ปี)");
        cv.put(COL_POSITION, "Goalkeeper");
        cv.put(COL_HEIGHT, "1.98 cm");
        cv.put(COL_CLUB, "FC Bayern Munich");
        cv.put(COL_PLAYER_NUMBER,"1");
        cv.put(COL_PICTURE,"neuer.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Neymar");
        cv.put(COL_DATE, "5 กุมภาพันธ์ 2535 (24 ปี)");
        cv.put(COL_POSITION, "Striker");
        cv.put(COL_HEIGHT, "1.74 cm");
        cv.put(COL_CLUB, "FC Barcelona");
        cv.put(COL_PLAYER_NUMBER,"11");
        cv.put(COL_PICTURE,"neymar.png");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_NAME, "Sergio Ramos");
        cv.put(COL_DATE, "30 มีนาคม 2529 (30 ปี)");
        cv.put(COL_POSITION, "center");
        cv.put(COL_HEIGHT, "1.83 cm");
        cv.put(COL_CLUB, "Real Madrid ");
        cv.put(COL_PLAYER_NUMBER,"4");
        cv.put(COL_PICTURE,"ramos.png");
        db.insert(TABLE_NAME, null, cv);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CRATE_TABLE);
        insertInitialData(db);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }
}
