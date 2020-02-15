package com.example.programmingknowledge.madapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Org_Stu
  extends Activity
{
  public void both1(View paramView)
  {
    startActivity(new Intent(this, Login_Stu.class));
  }
  
  public void both2(View paramView)
  {
    startActivity(new Intent(this, Login_Signup_Stu.class));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2131427360);
  }
}


/* Location:           C:\MAD\MadApp_dex2jar.jar
 * Qualified Name:     com.example.programmingknowledge.madapp.Org_Stu
 * JD-Core Version:    0.7.0.1
 */