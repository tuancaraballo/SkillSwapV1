package com.tuananhcaraballo.skillswapv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }


//
    public void toSkillTabs(View view) {
        Intent intent = new Intent(this, skillsTabs.class);
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

    @Override
    protected void onResume() {
        super.onResume();

        View toolbar = findViewById(R.id.toolbar);
        if(GLOBALS.getGlobalInstance().isNotInMain()){
            toolbar.setVisibility(View.VISIBLE);
        }
        else{
            toolbar.setVisibility(View.GONE);
        }

        Bundle extras = getIntent().getExtras();
        String text;
        if (extras != null) {

            text = extras.getString("skill");
            Log.e("COMe FENCING!!!! ----> ", text);
            TextView skillText;
            String skill;
            if(text.equals("Fencing")){
                if(GLOBALS.getGlobalInstance().getCOLUMN() == 0){
                    if(GLOBALS.getGlobalInstance().getLEVEL() == 0){
                        skillText = (TextView) findViewById(R.id.teachBeginner);
                        skill = skillText.getText().toString() + text;
                        skillText.setText(skill);
                    }else if(GLOBALS.getGlobalInstance().getLEVEL() == 1){
                        skillText = (TextView) findViewById(R.id.teachIntermediate);
                        skill = skillText.getText().toString() + text;
                        skillText.setText(skill);
                    }else{
                        skillText = (TextView) findViewById(R.id.teachAdvanced);
                        skill = skillText.getText().toString();
                        if(skill.equals("\n\n")){
                            skillText.setText(text + "\n");
                        }else{
                            skillText.setText(skill + text);
                        }
                    }
                }else{
                    if(GLOBALS.getGlobalInstance().getLEVEL() == 0){
                        skillText = (TextView) findViewById(R.id.learnBeginner);
                        skill = skillText.getText().toString() + text;
                        skillText.setText(skill);
                    }else if(GLOBALS.getGlobalInstance().getLEVEL() == 1){
                        skillText = (TextView) findViewById(R.id.learnIntermediate);
                        skill = skillText.getText().toString() + text;
                        skillText.setText(skill);
                    }else{
                        skillText = (TextView) findViewById(R.id.learnAdvanced);
                        skill = skillText.getText().toString();
                        if(skill.equals("\n\n")){
                            skillText.setText(text + "\n");
                        }else{
                            skillText.setText(skill + text);
                        }
                    }
                }
            }else{
                boolean adding = extras.getBoolean("adding");
                skillText = (TextView) findViewById(R.id.learnAdvanced);
                skill = skillText.getText().toString();
                if(skill.equals("Dancing\n")){
                    skillText.setText("\n\n");
                }else{
                    skillText.setText("Fencing\n");
                }
                if(adding){
                    skillText = (TextView) findViewById(R.id.teachAdvanced);
                    skill = skillText.getText().toString();
                    if(skill.equals("\n\n")){
                        skillText.setText(text + "\n");
                    }else{
                        skillText.setText(skill + text);
                    }
                }


            }





            GLOBALS.getGlobalInstance().setLEVEL(-1);
            GLOBALS.getGlobalInstance().setCOLUMN(-1);
        }

    }
}
