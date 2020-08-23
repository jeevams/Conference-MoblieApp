package com.example.programmingknowledge.madapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Query_Post extends Activity
{
  Query db;
  Data mydb;
  Button post;
  EditText question;
  EditText seat;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_query__post);
    db = new Query(this);
    mydb = new Data(this);
    seat = ((EditText)findViewById(seat_no));
    question = ((EditText)findViewById(question));
    post = ((Button)findViewById(query_post));
    
    post.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View v)
      {
        String str1 = seat.getText().toString();
        String str2 = question.getText().toString();
        
        boolean bool = mydb.checkseat(str1);
        if ((!str1.equals("")) && (!str2.equals("")))
        {
          if (str1.matches("[0-9]"))
          {
            if (!bool)
            {
              if (db.insertData(str1, str2) == true)
              {
                Toast.makeText(getApplicationContext(), "Query Post Successfully",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Query_Post.this, Org_Stu.class);
                startActivity(intent);
              }
              else
              {
                Toast.makeText(getApplicationContext(), "Enter your seat no ", Toast.LENGTH_SHORT).show();
              }
              return;
            }
            Toast.makeText(getApplicationContext(), "Enter Correct Seat Number", Toast.LENGTH_SHORT).show();
            return;
          }
          Toast.makeText(getApplicationContext(), "invaild seat number", Toast.LENGTH_SHORT).show();
          return;
        }
        Toast.makeText(getApplicationContext(), "field is empty", Toast.LENGTH_SHORT).show();
      }
    });
  }
}



