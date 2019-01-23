package com.example.user.userlogin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserLog2Activity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_log2);
        ed1=(EditText)findViewById(R.id.usr);
        ed2=(EditText)findViewById(R.id.pwd);
        b=(Button)findViewById(R.id.logot);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"logout successfully",Toast.LENGTH_LONG).show();
            }
        });

        SharedPreferences pref=getApplicationContext().getSharedPreferences("mypref",0);

        String a=pref.getString("usernme",null);
        String b=pref.getString("passwordd",null);

        ed1.setText(a);
        ed2.setText(b);
    }
}
