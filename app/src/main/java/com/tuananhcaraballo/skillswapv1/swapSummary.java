package com.tuananhcaraballo.skillswapv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class swapSummary extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap_summary);
    }

    public void toRateExperience(View view) {
        Intent intent = new Intent(this, rateExperience.class);
        startActivity(intent);
    }

    public void toNetworkAfter(View view) {
        GLOBALS.getGlobalInstance().setFinishSwap(true);
        Intent intent = new Intent(this, MainActivity.class);
        Toast.makeText(this, "Swap Canceled!",
                Toast.LENGTH_LONG).show();
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
