package com.example.user.userlogin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        EditText ed1,ed2;
        Button b;
        String usrnme,passwrdd;
        SharedPreferences pref;
        SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.usr);
        ed2=(EditText)findViewById(R.id.pwd);
        b=(Button)findViewById(R.id.log);

        pref=getApplicationContext().getSharedPreferences("mypref",0);
        editor=pref.edit();

        String a=pref.getString("usernme",null);
        if(a!=null){
            Intent i=new Intent(getApplicationContext(),UserLog2Activity.class);
            startActivity(i);
        }


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usrnme=ed1.getText().toString();
                passwrdd=ed2.getText().toString();
                if ((usrnme.equals("admin")&&(passwrdd.equals("1234"))))
                {

                    editor.putString("usernme",usrnme);
                    editor.putString("passwordd",passwrdd);

                    editor.commit();

                    Intent i=new Intent(getApplicationContext(),UserLog2Activity.class);
                    startActivity(i);
                }


            }
        });
    }
}
