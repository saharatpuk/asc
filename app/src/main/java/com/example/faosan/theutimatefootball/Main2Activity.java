package com.example.faosan.theutimatefootball;

import android.app.Dialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.faosan.theutimatefootball.db.Database;
import com.example.faosan.theutimatefootball.db.Utils;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    SQLiteDatabase mDb;
    Database mHelper;
    Cursor mCursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mHelper = new Database(this);
        mDb = mHelper.getWritableDatabase();

        mCursor = mDb.rawQuery("SELECT * FROM "
                + Database.TABLE_NAME, null);

        ArrayList<String> dirArray = new ArrayList<String>();

        mCursor.moveToFirst();
        while ( !mCursor.isAfterLast() ){
            dirArray.add(mCursor.getString(mCursor.getColumnIndex
                    (Database.COL_NAME)));
            mCursor.moveToNext();
        }
        ListView listView1 = (ListView)findViewById(R.id.list);
        listView1.setAdapter(new ArrayAdapter(this
                , android.R.layout.simple_list_item_1, dirArray));
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> arg0, View arg1
                    , int arg2, long arg3) {
                mCursor.moveToPosition(arg2);

                final Dialog dialog = new Dialog(com.example.faosan.theutimatefootball.Main2Activity.this);
                dialog.requestWindowFeature
                        (dialog.getWindow().FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.activity_main3);

                TextView textTHName =
                        (TextView)dialog.findViewById(R.id.textName);
                textTHName.setText("Name :  "
                        + mCursor.getString(mCursor.getColumnIndex
                        (Database.COL_NAME)));

                TextView textENName =
                        (TextView)dialog.findViewById(R.id.textDate);
                textENName.setText("Date :  "
                        + mCursor.getString(mCursor.getColumnIndex
                        (Database.COL_DATE)));

                TextView textKingdom =
                        (TextView)dialog.findViewById(R.id.textPosition);
                textKingdom.setText("Position :  "
                        + mCursor.getString(mCursor.getColumnIndex
                        (Database.COL_POSITION)));

                TextView textPhylum =
                        (TextView)dialog.findViewById(R.id.textHeight);
                textPhylum.setText("Height :  "
                        + mCursor.getString(mCursor.getColumnIndex
                        (Database.COL_HEIGHT)));

                TextView textClass =
                        (TextView)dialog.findViewById(R.id.textClub);
                textClass.setText("Club : "
                        + mCursor.getString(mCursor.getColumnIndex
                        (Database.COL_CLUB)));

                TextView textOrder =
                        (TextView)dialog.findViewById(R.id.textPlayer_name);
                textOrder.setText("Player Number :  "
                        + mCursor.getString(mCursor.getColumnIndex
                        (Database.COL_PLAYER_NUMBER)));

                ImageView imageView = (ImageView) dialog.findViewById(R.id.imageView);
                Drawable drawable = Utils.getDrawableFromAssets(
                        Main2Activity.this,
                        mCursor.getString(mCursor.getColumnIndex
                                (Database.COL_PICTURE))
                );
                imageView.setImageDrawable(drawable);


                Button buttonOK =
                        (Button)dialog.findViewById(R.id.buttonOk);
                buttonOK.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });

                dialog.show();
            }
        });
    }

    public void onPause() {
        super.onPause();
        mHelper.close();
        mDb.close();
    }


}

