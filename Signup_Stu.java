package com.example.programmingknowledge.madapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup_Stu
  extends Activity
{
  EditText confrim;
  Data db;
  EditText email;
  EditText password;
  EditText seatno;
  Button sig;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2131427363);
    this.db = new Data(this);
    this.email = ((EditText)findViewById(2131230825));
    this.seatno = ((EditText)findViewById(2131230881));
    this.password = ((EditText)findViewById(2131230847));
    this.confrim = ((EditText)findViewById(2131230769));
    this.sig = ((Button)findViewById(2131230757));
    this.sig.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        String str1 = Signup_Stu.this.email.getText().toString();
        String str2 = Signup_Stu.this.seatno.getText().toString();
        String str3 = Signup_Stu.this.password.getText().toString();
        String str4 = Signup_Stu.this.confrim.getText().toString();
        Boolean localBoolean = Boolean.valueOf(Signup_Stu.this.db.checkseat(str2));
        if ((!str1.equals("")) && (!str3.equals("")) && (!str4.equals("")) && (!str2.equals("")))
        {
          if (str1.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"))
          {
            if (Boolean.valueOf(Signup_Stu.this.db.checkemail(str1)).booleanValue() == true)
            {
              if (str3.equals(str4))
              {
                if (str2.matches("[0-9]"))
                {
                  if (localBoolean.booleanValue() == true)
                  {
                    if (Signup_Stu.this.db.insertData(str1, str3, str2) == true)
                    {
                      Toast.makeText(Signup_Stu.this.getApplicationContext(), "Signup successfully", 1).show();
                      Intent localIntent = new Intent(Signup_Stu.this, Login_Signup_Stu.class);
                      Signup_Stu.this.startActivity(localIntent);
                    }
                  }
                  else {
                    Toast.makeText(Signup_Stu.this.getApplicationContext(), "Enter Your Seat Number", 1).show();
                  }
                }
                else {
                  Toast.makeText(Signup_Stu.this.getApplicationContext(), "Invaild Seat no", 1).show();
                }
              }
              else {
                Toast.makeText(Signup_Stu.this.getApplicationContext(), "Pasword and Confrim Password Must be Same", 1).show();
              }
            }
            else {
              Toast.makeText(Signup_Stu.this.getApplicationContext(), "email alreay exists", 1).show();
            }
            return;
          }
          Toast.makeText(Signup_Stu.this.getApplicationContext(), "Invalid email address", 0).show();
          return;
        }
        Toast.makeText(Signup_Stu.this.getApplicationContext(), "Fields is empty", 0).show();
      }
    });
  }
}


/* Location:           C:\MAD\MadApp_dex2jar.jar
 * Qualified Name:     com.example.programmingknowledge.madapp.Signup_Stu
 * JD-Core Version:    0.7.0.1
 */