package com.tqky.loan.ui.user;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tqky.loan.R;
import com.tqky.loan.ui.home.HomeActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClickSignUp(View view) {
        startActivity(new Intent(this, UserActivity.class));
    }

    public void onClickSignIn(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }
}
