package com.tuananhcaraballo.skillswapv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ToolBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_bar);
    }

    public void toProfile(View view) {
        Log.v("SSIGN!!","GOT HERE!!");
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}
