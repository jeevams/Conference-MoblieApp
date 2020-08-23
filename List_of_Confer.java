package com.example.programmingknowledge.madapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class List_of_Confer
  extends Activity
{
  Button ama;
  Button blo;
  Button cis;
  Button or;
  
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_list_of__confer);
    or = ((Button)findViewById(oracle));
    cis = ((Button)findViewById(cisco));
    ama = ((Button)findViewById(amazon));
    blo = ((Button)findViewById(block));
    
    
    or.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View v)
      {
        Intent intent = new Intent(List_of_Confer.this, Org_Stu.class);
        startActivity(intent);
      }
    });
    cis.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View v)
      {
        Intent intent = new Intent(List_of_Confer.this, Org_Stu.class);
        startActivity(intent);
      }
    });
    ama.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View v)
      {
        Intent intent = new Intent(List_of_Confer.this, Org_Stu.class);
        startActivity(intent);
      }
    });
    blo.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View v)
      {
        Intent intent = new Intent(List_of_Confer.this, Org_Stu.class);
        startActivity(intent);
      }
    });
  }
}



