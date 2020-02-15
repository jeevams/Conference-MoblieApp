package com.example.programmingknowledge.madapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Login_Signup_Stu
  extends Activity
{
  Button log;
  Button sig;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2131427357);
    this.log = ((Button)findViewById(2131230824));
    this.sig = ((Button)findViewById(2131230888));
    this.log.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(Login_Signup_Stu.this, Login_Stu.class);
        Login_Signup_Stu.this.startActivity(localIntent);
      }
    });
    this.sig.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(Login_Signup_Stu.this, Signup_Stu.class);
        Login_Signup_Stu.this.startActivity(localIntent);
      }
    });
  }
}


/* Location:           C:\MAD\MadApp_dex2jar.jar
 * Qualified Name:     com.example.programmingknowledge.madapp.Login_Signup_Stu
 * JD-Core Version:    0.7.0.1
 */