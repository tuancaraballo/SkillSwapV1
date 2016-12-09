package com.tuananhcaraballo.skillswapv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Justin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_justin);
    }

    public void toNetwork(View view) {
        GLOBALS.getGlobalInstance().setAcceptRequest(true);
        Intent intent = new Intent (this, MainActivity.class);
        Toast.makeText(this, "Request Accepted!",
                Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
        public void toNotifications(View view) {
        Intent intent = new Intent(this, notifications.class);
        startActivity(intent);
    }

    public void toSearch(View view) {
        Intent intent = new Intent(this, search.class);
        startActivity(intent);
    }

    public void toMessages(View view) {
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void toProfile(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
//
//    public void toUserOne(View view) {
//        Intent intent = new Intent(this, user1.class);
//        startActivity(intent);
//    }


}
