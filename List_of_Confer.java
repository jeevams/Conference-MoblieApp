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
    requestWindowFeature(1);
    setContentView(2131427356);
    this.or = ((Button)findViewById(2131230840));
    this.cis = ((Button)findViewById(2131230765));
    this.ama = ((Button)findViewById(2131230749));
    this.blo = ((Button)findViewById(2131230754));
    this.or.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(List_of_Confer.this, Org_Stu.class);
        List_of_Confer.this.startActivity(localIntent);
      }
    });
    this.cis.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(List_of_Confer.this, Org_Stu.class);
        List_of_Confer.this.startActivity(localIntent);
      }
    });
    this.ama.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(List_of_Confer.this, Org_Stu.class);
        List_of_Confer.this.startActivity(localIntent);
      }
    });
    this.blo.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(List_of_Confer.this, Org_Stu.class);
        List_of_Confer.this.startActivity(localIntent);
      }
    });
  }
}


/* Location:           C:\MAD\MadApp_dex2jar.jar
 * Qualified Name:     com.example.programmingknowledge.madapp.List_of_Confer
 * JD-Core Version:    0.7.0.1
 */