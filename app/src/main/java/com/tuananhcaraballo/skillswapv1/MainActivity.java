package com.tuananhcaraballo.skillswapv1;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

public class MainActivity extends ActivityGroup {


    private TabHost tabs;
    private static MainActivity theInstance;

    public static MainActivity getInstance() {
        return MainActivity.theInstance;
    }

    public MainActivity() {
        MainActivity.theInstance = this;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = (TabHost)findViewById(R.id.tabHost);
        tabs.setup(this.getLocalActivityManager());
        TabHost.TabSpec tab1 = tabs.newTabSpec("Tab 1");
        tab1.setContent(new Intent(this, network.class));
        tab1.setIndicator("",getResources().getDrawable(R.drawable.network_text));
        tabs.addTab(tab1);


        TabHost.TabSpec tab2 = tabs.newTabSpec("Tab 2");
        tab2.setContent(new Intent(this, notifications.class));
        tab2.setIndicator("",getResources().getDrawable(R.drawable.notify_text));
        tabs.addTab(tab2);
        TabHost.TabSpec tab3 = tabs.newTabSpec("Tab 3");
        tab3.setContent(new Intent(this, search.class));
        tab3.setIndicator("",getResources().getDrawable(R.drawable.search_text));
        tabs.addTab(tab3);

        TabHost.TabSpec tab4 = tabs.newTabSpec("Tab 4");
        tab4.setContent(new Intent(this, messages.class));
        tab4.setIndicator("",getResources().getDrawable(R.drawable.message_text));
        tabs.addTab(tab4);

        TabHost.TabSpec tab5 = tabs.newTabSpec("Tab 5");
        tab5.setContent(new Intent(this, profile.class));
        tab5.setIndicator("",getResources().getDrawable(R.drawable.profile_text));
        tabs.addTab(tab5);

        tabs.setCurrentTab(0);



    }

    @Override
    protected void onResume() {
        super.onResume();
        GLOBALS.getGlobalInstance().setNotInMain(false);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String tab = extras.getString("profile");
            if(tab != null){
                tabs.setCurrentTab(4);
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        GLOBALS.getGlobalInstance().setNotInMain(true);
    }

    public void toUserOne(View view) {
        Intent intent = new Intent(this, user1.class);
        startActivity(intent);
    }




//        Intent intent = new Intent(this, results.class);
//        //  StringBuffer urlString = new StringBuffer();
//        //  search parentActivity = (search) getParent();
//        //  replaceContentView("search", intent);
//        startActivity(intent);



    public void toSkillTabs(View view) {
        Intent intent = new Intent(this, skillsTabs.class);
        startActivity(intent);
    }

// //-----> Classes used to navigate between activities, not the most clean way, but it works
//    public void toNetwork(View view) {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//    }
//
    public void toProfile(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }


    public void toSwapRequest(View view) {
        Intent intent = new Intent(this, swapRequest.class);
        startActivity(intent);
    }



    public void toNotifications(View view) {
        Intent intent = new Intent(this, notifications.class);
        startActivity(intent);
    }
//
//    public void toSearch(View view) {
//        Intent intent = new Intent(this, search.class);
//        startActivity(intent);
//    }
//
//    public void toMessages(View view) {
//        Intent intent = new Intent(this, messages.class);
//        startActivity(intent);
//    }
//
//    public void toUserOne(View view) {
//        Intent intent = new Intent(this, user1.class);
//        startActivity(intent);
//    }


}
