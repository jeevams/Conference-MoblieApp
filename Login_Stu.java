package com.example.programmingknowledge.madapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Stu
  extends Activity
{
  Button btlogin;
  Data db;
  EditText mail;
  EditText pass;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2131427358);
    this.db = new Data(this);
    this.mail = ((EditText)findViewById(2131230788));
    this.pass = ((EditText)findViewById(2131230848));
    this.btlogin = ((Button)findViewById(2131230823));
    this.btlogin.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        String str1 = Login_Stu.this.mail.getText().toString();
        String str2 = Login_Stu.this.pass.getText().toString();
        boolean bool = Login_Stu.this.db.checkmaila(str1, str2);
        if ((!str1.equals("")) && (!str2.equals("")))
        {
          if ((str1.equals("jeevams")) && (str2.equals("pulsar150")))
          {
            Toast.makeText(Login_Stu.this.getApplicationContext(), "Login Successfull", 1).show();
            Intent localIntent2 = new Intent(Login_Stu.this, Query_View.class);
            Login_Stu.this.startActivity(localIntent2);
            return;
          }
          if (!bool)
          {
            Toast.makeText(Login_Stu.this.getApplicationContext(), "Login Successfull", 1).show();
            Intent localIntent1 = new Intent(Login_Stu.this, Query_Post.class);
            Login_Stu.this.startActivity(localIntent1);
            return;
          }
          Toast.makeText(Login_Stu.this.getApplicationContext(), "incorrect user name and password", 1).show();
          return;
        }
        Toast.makeText(Login_Stu.this.getApplicationContext(), "Field is empty", 1).show();
      }
    });
  }
}


/* Location:           C:\MAD\MadApp_dex2jar.jar
 * Qualified Name:     com.example.programmingknowledge.madapp.Login_Stu
 * JD-Core Version:    0.7.0.1
 */