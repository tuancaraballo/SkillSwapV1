package com.tuananhcaraballo.skillswapv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class skillsTabs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_skills_tabs);
    }


    public void toFencing(View view) {
        Intent intent = new Intent(this, fencing.class);
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

    public void toSwapOne(View view) {
        Toast.makeText(this, "Sorry, not available in Demo version",
                Toast.LENGTH_SHORT).show();
    }
}
