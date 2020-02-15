package com.example.programmingknowledge.madapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Query_Post
  extends Activity
{
  Query db;
  Data mydb;
  Button post;
  EditText question;
  EditText seat;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2131427361);
    this.db = new Query(this);
    this.mydb = new Data(this);
    this.seat = ((EditText)findViewById(2131230880));
    this.question = ((EditText)findViewById(2131230856));
    this.post = ((Button)findViewById(2131230854));
    this.post.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        String str1 = Query_Post.this.seat.getText().toString();
        String str2 = Query_Post.this.question.getText().toString();
        Boolean localBoolean = Boolean.valueOf(Query_Post.this.mydb.checkseat(str1));
        if ((!str1.equals("")) && (!str2.equals("")))
        {
          if (str1.matches("[0-9]"))
          {
            if (!localBoolean.booleanValue())
            {
              if (Query_Post.this.db.insertData(str1, str2) == true)
              {
                Toast.makeText(Query_Post.this.getApplicationContext(), "Query Post Successfully", 1).show();
                Intent localIntent = new Intent(Query_Post.this, Org_Stu.class);
                Query_Post.this.startActivity(localIntent);
              }
              else
              {
                Toast.makeText(Query_Post.this.getApplicationContext(), "Enter your seat no ", 1).show();
              }
              return;
            }
            Toast.makeText(Query_Post.this.getApplicationContext(), "Enter Correct Seat Number", 1).show();
            return;
          }
          Toast.makeText(Query_Post.this.getApplicationContext(), "invaild seat number", 1).show();
          return;
        }
        Toast.makeText(Query_Post.this.getApplicationContext(), "field is empty", 1).show();
      }
    });
  }
}


/* Location:           C:\MAD\MadApp_dex2jar.jar
 * Qualified Name:     com.example.programmingknowledge.madapp.Query_Post
 * JD-Core Version:    0.7.0.1
 */