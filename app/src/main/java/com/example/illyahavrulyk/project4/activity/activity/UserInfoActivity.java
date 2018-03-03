package com.example.illyahavrulyk.project4.activity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.example.illyahavrulyk.project4.R;

import org.w3c.dom.Text;

/**
 * Created by Illya Havrulyk on 2/26/2018.
 */

public class UserInfoActivity extends AppCompatActivity {
    private TextView loginTextView;
    private TextView firstnameTextView;
    private TextView passwordTextView;
    private TextView loginShow;
    private TextView firstnameShow;
    private TextView passwordShow;

     Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info_activity);

        loginTextView = findViewById(R.id.loginEditText);
        firstnameTextView = findViewById(R.id.firstnameShow);
         passwordTextView = findViewById(R.id.passwordTextView);
        loginShow = findViewById(R.id.loginShow);
        firstnameShow = findViewById(R.id.firstnameShow);
        passwordShow = findViewById(R.id.passwordShow);

        intent = getIntent();

        String tempStringLogin = intent.getStringExtra("login");
        loginShow.setText(tempStringLogin);

        String tempStringPassword = intent.getStringExtra("password");
        passwordShow.setText(tempStringPassword);
    }
}
