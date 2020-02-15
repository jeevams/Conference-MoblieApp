package com.example.programmingknowledge.madapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Query_View
  extends Activity
{
  Button btnDelete;
  Query db;
  EditText dele;
  Button go;
  Data mydb;
  Button query_vieww;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2131427362);
    this.db = new Query(this);
    this.mydb = new Data(this);
    this.query_vieww = ((Button)findViewById(2131230855));
    this.go = ((Button)findViewById(2131230802));
    this.btnDelete = ((Button)findViewById(2131230853));
    this.dele = ((EditText)findViewById(2131230778));
    this.go.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(Query_View.this, Org_Stu.class);
        Query_View.this.startActivity(localIntent);
      }
    });
    this.btnDelete.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        String str = Query_View.this.dele.getText().toString();
        Integer localInteger1 = Query_View.this.db.deleteData(str);
        Integer localInteger2 = Query_View.this.mydb.deletData(str);
        if (str.equals(""))
        {
          Toast.makeText(Query_View.this.getApplicationContext(), "Enter the seat no", 1).show();
          return;
        }
        if (localInteger1.intValue() > 0)
        {
          if (localInteger2.intValue() > 0) {
            Toast.makeText(Query_View.this, "Data Deleted", 1).show();
          }
        }
        else {
          Toast.makeText(Query_View.this, "invaild seat number", 1).show();
        }
      }
    });
    this.query_vieww.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Cursor localCursor = Query_View.this.db.getall();
        if (localCursor.getCount() == 0)
        {
          Query_View.this.showMessage("Error", "No Records");
          return;
        }
        StringBuffer localStringBuffer = new StringBuffer();
        while (localCursor.moveToNext())
        {
          StringBuilder localStringBuilder1 = new StringBuilder();
          localStringBuilder1.append("SAET NO :");
          localStringBuilder1.append(localCursor.getString(0));
          localStringBuilder1.append("\n");
          localStringBuffer.append(localStringBuilder1.toString());
          StringBuilder localStringBuilder2 = new StringBuilder();
          localStringBuilder2.append("QUERY :");
          localStringBuilder2.append(localCursor.getString(1));
          localStringBuilder2.append("\n");
          localStringBuffer.append(localStringBuilder2.toString());
          localStringBuffer.append("----------------------------------------------------");
        }
        Query_View.this.showMessage("Queries", localStringBuffer.toString());
      }
    });
  }
  
  public void showMessage(String paramString1, String paramString2)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setCancelable(true);
    localBuilder.setTitle(paramString1);
    localBuilder.setMessage(paramString2);
    localBuilder.show();
  }
}


/* Location:           C:\MAD\MadApp_dex2jar.jar
 * Qualified Name:     com.example.programmingknowledge.madapp.Query_View
 * JD-Core Version:    0.7.0.1
 */