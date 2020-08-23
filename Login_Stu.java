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
  
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_login__stu);
    db = new Data(this);
    mail = ((EditText)findViewById(email_login));
    pass = ((EditText)findViewById(password_login));
    btlogin = ((Button)findViewById(login_stu));
    btlogin.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View v)
      {
        String str1 = mail.getText().toString();
        String str2 = pass.getText().toString();
        boolean bool = db.checkmaila(str1, str2);
        if ((!str1.equals("")) && (!str2.equals("")))
        {
          if ((str1.equals("jeevams")) && (str2.equals("pulsar150")))
          {
            Toast.makeText(getApplicationContext(), "Login Successfull",Toast.LENGTH_SHORT).show();
           
            Intent intent = new Intent(Login_Stu.this, Query_View.class);
            startActivity(intent);
            return;
          }
          if (!bool)
          {
            Toast.makeText(getApplicationContext(), "Login Successfull",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Login_Stu.this, Query_Post.class);
            startActivity(intent);
            return;
          }
          Toast.makeText(getApplicationContext(), "incorrect user name and password",Toast.LENGTH_SHORT).show();
          return;
        }
        Toast.makeText(getApplicationContext(), "Field is empty",Toast.LENGTH_SHORT).show();
      }
    });
  }
}



