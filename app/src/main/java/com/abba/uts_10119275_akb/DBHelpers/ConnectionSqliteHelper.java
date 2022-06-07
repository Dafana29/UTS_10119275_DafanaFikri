package com.abba.uts_10119275_akb.DBHelpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConnectionSqliteHelper extends SQLiteOpenHelper {
//Dafana Fikri, IF7, 10119275, 7juni2022


    public ConnectionSqliteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SqliteStringHelpers.CREATE_TABLE_CLIENTE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS cliente");
        onCreate(db);


    }
}
