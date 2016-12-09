package com.tuananhcaraballo.skillswapv1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fencing extends AppCompatActivity {

    Button beginnerButton;
    Button intermediateButton;
    Button advacedButton;

    String themeColor ="#4579C7";
    String background2 ="#eae8e8";
    String whiteColor = "#FFFFFF";
    String greyColor = "#777777";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fencing);
        beginnerButton = (Button) findViewById(R.id.beginnerButton);
        intermediateButton = (Button) findViewById(R.id.intermediateButton);
        advacedButton = (Button) findViewById(R.id.advancedButton);
    }

    public void toProfile(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }


//myLayout.setBackgroundColor(Color.parseColor("#636161"));
    // <color name="themeColor">#4579C7</color>
    // <color name="background2">#eae8e8</color>

    public void updateButtonHelper(int num){
        if(num == 0){
            beginnerButton.setBackgroundColor(Color.parseColor(themeColor));
            beginnerButton.setTextColor(Color.parseColor(whiteColor));
        }else{
            beginnerButton.setBackgroundColor(Color.parseColor(background2));
            beginnerButton.setTextColor(Color.parseColor(greyColor));
        }
        if(num == 1){
            intermediateButton.setBackgroundColor(Color.parseColor(themeColor));
            intermediateButton.setTextColor(Color.parseColor(whiteColor));
        }else {
            intermediateButton.setBackgroundColor(Color.parseColor(background2));
            intermediateButton.setTextColor(Color.parseColor(greyColor));
        }

        if(num == 2){
            advacedButton.setBackgroundColor(Color.parseColor(themeColor));
            advacedButton.setTextColor(Color.parseColor(whiteColor));
        }else{
            advacedButton.setBackgroundColor(Color.parseColor(background2));
            advacedButton.setTextColor(Color.parseColor(greyColor));
        }
    }

    public void updateBeginner(View view) {
        updateButtonHelper(0);
        GLOBALS.getGlobalInstance().setLEVEL(0);
    }

    public void updateIntermidiate(View view) {
        updateButtonHelper(1);
        GLOBALS.getGlobalInstance().setLEVEL(1);
    }

    public void updateAdvanced(View view) {
        updateButtonHelper(2);
        GLOBALS.getGlobalInstance().setLEVEL(2);
    }

    public void teachFencing(View view) {
        GLOBALS.getGlobalInstance().setCOLUMN(0);
        if(GLOBALS.getGlobalInstance().getLEVEL() == -1){
            Toast.makeText(this, "Pick a Level",
                    Toast.LENGTH_LONG).show();
        }else{
            String text = "Fencing";
            Intent intent =  new Intent(this, profile.class);
            intent.putExtra("skill",text);
            Toast.makeText(this, "Skill added",
                    Toast.LENGTH_LONG).show();
            startActivity(intent);
        }

    }

    public void learnFencing(View view){
        GLOBALS.getGlobalInstance().setCOLUMN(1);
        if(GLOBALS.getGlobalInstance().getLEVEL() == -1){
            Toast.makeText(this, "Pick a Level",
                    Toast.LENGTH_LONG).show();
        }else{
            String text = "Fencing";
            Intent intent =  new Intent(this, profile.class);
            intent.putExtra("skill",text);
            Toast.makeText(this, "Skill added",
                    Toast.LENGTH_LONG).show();
            startActivity(intent);
        }
    }

    public void toNetwork(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("tab","profile");
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

    public void toUserOne(View view) {
        Intent intent = new Intent(this, user1.class);
        startActivity(intent);
    }
}
