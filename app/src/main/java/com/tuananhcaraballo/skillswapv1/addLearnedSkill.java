package com.tuananhcaraballo.skillswapv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class addLearnedSkill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_learned_skill);
    }


    public void toNetwork(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toProfile(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }

    public void addDancing(View view) {
        Intent intent = new Intent(this, profile.class);
        intent.putExtra("skill", "Dancing");
        intent.putExtra("adding",true);
        Toast.makeText(this, "Skill added",
                Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    public void removeDancing(View view) {
        Intent intent = new Intent(this, profile.class);
        intent.putExtra("skill", "Dancing");
        intent.putExtra("adding",false);
        startActivity(intent);
    }
}
