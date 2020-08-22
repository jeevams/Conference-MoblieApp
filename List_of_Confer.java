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
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(2131427356);
    or = ((Button)findViewById(2131230840));
    cis = ((Button)findViewById(2131230765));
    ama = ((Button)findViewById(2131230749));
    blo = ((Button)findViewById(2131230754));
    
    
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



