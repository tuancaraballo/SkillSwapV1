package com.tuananhcaraballo.skillswapv1;

import android.app.ActivityGroup;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class network extends ActivityGroup{

    protected static LocalActivityManager mLocalActivityManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        updateView();
    }


    public void toUserOne(View view) {
        Intent intent = new Intent(this, user1.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        updateView();
    }


    public void updateView(){

        LinearLayout jamieLayout= (LinearLayout) findViewById(R.id.JamieID);
        LinearLayout justinLayout = (LinearLayout) findViewById(R.id.JustinID);
        if(GLOBALS.getGlobalInstance().isFinishSwap()){
            jamieLayout.setVisibility(View.GONE);
        }else{
            jamieLayout.setVisibility(View.VISIBLE);
        }
        if(GLOBALS.getGlobalInstance().isAcceptRequest()){
            justinLayout.setVisibility(View.VISIBLE);
        }else{
            justinLayout.setVisibility(View.GONE);
        }


    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }


    public void toSwapSummary(View view) {
        Intent intent =  new Intent(this, swapSummary.class);
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
