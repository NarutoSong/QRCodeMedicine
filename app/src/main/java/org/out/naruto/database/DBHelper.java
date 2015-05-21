package org.out.naruto.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Hao_S on 2015/5/4.
 */

public class DBHelper extends SQLiteOpenHelper {

    private final String CREATE_TABLE = "";

    private static final int DBVersion = 1;

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
                    int version) {
        super(context, name, factory, version);
    }

    public DBHelper(Context context, String name, int version) {
        this(context, name, null, version);
    }

    public DBHelper(Context context, String name) {
        this(context, name, DBVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public synchronized void close() {
        super.close();
    }
}
