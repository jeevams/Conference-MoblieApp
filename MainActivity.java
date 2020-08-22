package com.example.programmingknowledge.madapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
  @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   }
  
  public void welcome(View view)
  {
     Intent intent = new Intent(this, List_of_Confer.class);
     startActivity(intent);
  }
}



