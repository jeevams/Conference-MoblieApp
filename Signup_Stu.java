package com.example.programmingknowledge.madapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup_Stu extends Activity
{
  EditText confrim;
  Data db;
  EditText email;
  EditText password;
  EditText seatno;
  Button sig;
  
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_signup__stu);
    db = new Data(this);
    email =((EditText)findViewById(mail));
    seatno =((EditText)findViewById(seatnoo));
    password =((EditText)findViewById(password));
    confrim =((EditText)findViewById(confirm));
    sig =((Button)findViewById(btnAddData));
    
    sig.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View v)
      {
        String str1 = email.getText().toString();
        String str2 = seatno.getText().toString();
        String str3 = password.getText().toString();
        String str4 = confrim.getText().toString();
        
        boolean bool =db.checkseat(str2);
        
        if ((!str1.equals("")) && (!str3.equals("")) && (!str4.equals("")) && (!str2.equals("")))
        {
          if (str1.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"))
          {
            if (bool(db.checkemail(str1))== true)
            {
              if (str3.equals(str4))
              {
                if (str2.matches("[0-9]"))
                {
                  if (bool == true)
                  {
                    if (db.insertData(str1, str3, str2) == true)
                    {
                      Toast.makeText(getApplicationContext(), "Signup successfully", 1).show();
                      Intent intent = new Intent(this, Login_Signup_Stu.class);
                      startActivity(intent);
                    }
                  }
                  else {
                    Toast.makeText(getApplicationContext(), "Enter Your Seat Number", Toast.LENGTH_SHORT).show();
                  }
                }
                else {
                  Toast.makeText(getApplicationContext(), "Invaild Seat no", Toast.LENGTH_SHORT).show();
                }
              }
              else {
                Toast.makeText(getApplicationContext(), "Pasword and Confrim Password Must be Same", 1).show();
              }
            }
            else {
              Toast.makeText(getApplicationContext(), "email alreay exists", Toast.LENGTH_SHORT).show();
            }
            return;
          }
          Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
          return;
        }
        Toast.makeText(getApplicationContext(), "Fields is empty", Toast.LENGTH_SHORT).show();
      }
    });
  }
}



