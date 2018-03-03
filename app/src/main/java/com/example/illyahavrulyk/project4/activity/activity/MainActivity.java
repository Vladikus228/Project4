package com.example.illyahavrulyk.project4.activity.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.illyahavrulyk.project4.R;

import database.Database;
import database.DatabaseImpl;
import model.User;

public class MainActivity extends AppCompatActivity {

    private EditText loginEditText;
    private EditText passwordEditText;
    private Button signInButton;
    private Button registrationButton;

    private Intent intent;

    private Database database;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEditText = findViewById(R.id.loginEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        signInButton = findViewById(R.id.signInButton);
        registrationButton = findViewById(R.id.registrationButton);



        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String login = loginEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            User user = database.findUser(login);

            intent = new Intent(MainActivity.this,UserInfoActivity.class);
            intent.putExtra("login",loginEditText.getText().toString());
            startActivity(intent);


            intent.putExtra("password",passwordEditText.getText().toString());
            startActivity(intent);

//            if(user == null){
//                Toast.makeText(MainActivity.this, "User not found", Toast.LENGTH_SHORT).show();
//            }else{
//                Toast.makeText(MainActivity.this,"User found",Toast.LENGTH_SHORT).show();
//            }

            }
        });

        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        database = new DatabaseImpl();
    }
}
