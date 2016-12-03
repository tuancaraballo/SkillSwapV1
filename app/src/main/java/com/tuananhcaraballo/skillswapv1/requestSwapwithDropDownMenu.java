package com.tuananhcaraballo.skillswapv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class requestSwapwithDropDownMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_swapwith_drop_down_menu);
    }

    //-----> Classes used to navigate between activities, not the most clean way, but it works
    public void toNetwork(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toProfile(View view) {
        Intent intent = new Intent(this, profile.class);
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

    public void toBackNetwork(View view) {
        Toast.makeText(requestSwapwithDropDownMenu.this, "Request Sent!",
                Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
