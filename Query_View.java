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
  
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_query__view);
    db = new Query(this);
    mydb = new Data(this);
    query_vieww = ((Button)findViewById(query_view));
    go = ((Button)findViewById(go_back));
    btnDelete = ((Button)findViewById(query_del));
    dele = ((EditText)findViewById(del));
    
    go.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View v)
      {
        Intent intent = new Intent(Query_View.this, Org_Stu.class);
        startActivity(intent);
      }
    });
    
    btnDelete.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View v)
      {
        String str =dele.getText().toString();
        int a = db.deletData(str);
        int b = mydb.deletData(str);
        if (str.equals(""))
        {
          
           Toast.makeText(getApplicationContext(), "Enter the seat no",Toast.LENGTH_SHORT).show();
          return;
        }
        if (a>0)
        {
          if (b > 0) 
          {
            
            Toast.makeText(getApplicationContext(), "Data Deleted",Toast.LENGTH_SHORT).show();
            
          }
        }
        else 
        {
          
           Toast.makeText(getApplicationContext(), "invaild seat number",Toast.LENGTH_SHORT).show();
        }
      }
    });
    
    query_vieww.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View v)
      {
        Cursor localCursor = db.getall();
        if (localCursor.getCount() == 0)
        {
          showMessage("Error", "No Records");
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
        showMessage("Queries", localStringBuffer.toString());
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



