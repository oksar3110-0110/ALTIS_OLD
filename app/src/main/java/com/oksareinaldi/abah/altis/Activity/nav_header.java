package com.oksareinaldi.abah.altis.Activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by abah on 29/03/18.
 */
import static com.oksareinaldi.abah.altis.Activity.MainActivity.TAG_ID;
import static com.oksareinaldi.abah.altis.Activity.MainActivity.TAG_USERNAME;
import static com.oksareinaldi.abah.altis.Activity.MainActivity.my_shared_preferences;
import static com.oksareinaldi.abah.altis.Activity.MainActivity.session_status;

public class nav_header extends AppCompatActivity{
        TextView uName, eMail;
        SharedPreferences sharedpreferences;
        String id, username;
        boolean session = false;

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_main_menu);

        uName = findViewById(R.id.profEmail);
        eMail = findViewById(R.id.profUser);

            sharedpreferences = getSharedPreferences(MainActivity.my_shared_preferences, Context.MODE_PRIVATE);

            id = getIntent().getStringExtra(TAG_ID);
            username = getIntent().getStringExtra(TAG_USERNAME);

            uName.setText(id);
            eMail.setText(username);


    }
}
