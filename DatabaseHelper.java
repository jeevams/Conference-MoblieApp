package com.example.programmingknowledge.madapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper
  extends SQLiteOpenHelper
{
  public static final String COL_1 = "ID";
  public static final String COL_2 = "PASSWORD";
  public static final String DATABASE_NAME = "Student.db";
  public static final String TABLE_NAME = "student_table";
  
  public DatabaseHelper(Context paramContext)
  {
    super(paramContext, "Student.db", null, 1);
  }
  
  public boolean checkemail(String paramString)
  {
    return getWritableDatabase().rawQuery("Select * from student_table where ID=?", new String[] { paramString }).getCount() <= 0;
  }
  
  public boolean checkmaila(String paramString1, String paramString2)
  {
    return getWritableDatabase().rawQuery("Select * from student_table where ID=? and PASSWORD=?", new String[] { paramString1, paramString2 }).getCount() <= 0;
  }
  
  public Integer deletData(String paramString)
  {
    return Integer.valueOf(getWritableDatabase().delete("student_table", "SEAT_NO = ?", new String[] { paramString }));
  }
  
  public boolean insertData(String paramString1, String paramString2)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("ID", paramString1);
      localContentValues.put("PASSWORD", paramString2);
      long l = localSQLiteDatabase.insert("student_table", null, localContentValues);
      return l != -1L;
    }
    catch (SQLException localSQLException)
    {
      Log.e("jeeva", localSQLException.getMessage());
    }
    return true;
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table student_table (ID TEXT PRIMARY KEY ,PASSWORD TEXT)");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS student_table");
    onCreate(paramSQLiteDatabase);
  }
}



