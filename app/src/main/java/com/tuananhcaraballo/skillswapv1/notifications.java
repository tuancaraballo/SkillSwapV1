package com.tuananhcaraballo.skillswapv1;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class notifications extends ActivityGroup{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
    }

    @Override
    protected void onResume() {
        super.onResume();
        View toolbar = findViewById(R.id.toolbar);
        if (GLOBALS.getGlobalInstance().isNotInMain()) {
            toolbar.setVisibility(View.VISIBLE);
        } else {
            toolbar.setVisibility(View.GONE);
        }
    }

    public void toUserOne(View view) {
        Intent intent = new Intent(this, user1.class);
        startActivity(intent);
    }

    public void toSwapRequest(View view) {
        Intent intent = new Intent(this, swapRequest.class);
        startActivity(intent);
    }



    public void toJustinRequest(View view) {
        Intent intent = new Intent(this, swapRequest.class);
        startActivity(intent);
    }

    public void toNetwork(View view){
        Intent intent = new Intent (this, MainActivity.class);
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
}
