package com.example.bict_smart_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppCompatButton loginbtn;
    ProgressBar progressBar;
    AppCompatEditText emailedittext, passwordedittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailedittext= (AppCompatEditText) findViewById(R.id.emailedittext) ;
        passwordedittext= (AppCompatEditText) findViewById(R.id.passwordedittext) ;

        progressBar = (ProgressBar) findViewById(R.id.progressbar) ;
        progressBar.setVisibility(View.VISIBLE);

        loginbtn = (AppCompatButton) findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (emailedittext.getText().toString().equals("uzarwanda@gmail.com") && passwordedittext.getText().toString().equals("123456") ){
                    Intent i = new Intent(MainActivity.this, COOL_NAVIGATION.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this, "Email or password is incorrect",Toast.LENGTH_LONG).show();

                }

            }
        });

    }
}
