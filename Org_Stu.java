package com.example.programmingknowledge.madapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Org_Stu extends Activity
{
 protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_org__stu);
  }
  public void both1(View v)
  {
   
    Intent intent = new Intent(Org_Stu.this, Login_Stu.class);
    startActivity(intent);
  }
  
  public void both2(View v)
  {
    
    Intent intent = new Intent(Org_Stu.this, Login_Signup_Stu.class);
    startActivity(intent);
  }
  
  
}



