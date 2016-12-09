package com.tuananhcaraballo.skillswapv1;

import android.app.LocalActivityManager;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class search extends AppCompatActivity{

    Button leftTop;
    Boolean lTColor = false;
    Button leftMid;
    Boolean lMColor = false;
    Button leftBottom;
    Boolean lBColor = false;


    Button rightTop;
    Boolean rTColor = false;
    Button rightMid;
    Boolean rMColor = false;
    Button rightBottom;
    Boolean rBColor = false;


    String background2 = "#eae8e8";
    String themeColor = "#4579C7";

    protected static LocalActivityManager mLocalActivityManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

       leftTop = (Button) findViewById(R.id.leftTop);
       leftMid =  (Button)findViewById(R.id.leftMid);
        leftBottom = (Button)findViewById(R.id.leftBottom);

        rightTop = (Button)findViewById(R.id.rightTop);
        rightMid = (Button)findViewById(R.id.rightMid);
        rightBottom = (Button)findViewById(R.id.rightBottom);

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

    public void toResultList(View view) {
        Intent intent = new Intent(this, results.class);
        startActivity(intent);

    }

    public void changeLeftTop(View view) {

            if(!lTColor){
                leftTop.setBackgroundColor(Color.parseColor(themeColor));
                leftTop.setTextColor(Color.WHITE);
            }else{
                leftTop.setBackgroundColor(Color.parseColor(background2));
                leftTop.setTextColor(Color.BLACK);
            }
        lTColor = !lTColor;
    }

    public void changeLeftMid(View view) {
        if(!lMColor){
            leftMid.setBackgroundColor(Color.parseColor(themeColor));
            leftMid.setTextColor(Color.WHITE);
        }else{
            leftMid.setBackgroundColor(Color.parseColor(background2));
            leftMid.setTextColor(Color.BLACK);
        }
        lMColor = !lMColor;
    }

    public void changeLeftBottom(View view) {
        if(!lBColor){
            leftBottom.setBackgroundColor(Color.parseColor(themeColor));
            leftBottom.setTextColor(Color.WHITE);
        }else{
            leftBottom.setBackgroundColor(Color.parseColor(background2));
            leftBottom.setTextColor(Color.BLACK);
        }
        lBColor = !lBColor;
    }

    public void changeRightTop(View view) {
        if(!rTColor){
            rightTop.setBackgroundColor(Color.parseColor(themeColor));
            rightTop.setTextColor(Color.WHITE);
        }else{
            rightTop.setBackgroundColor(Color.parseColor(background2));
            rightTop.setTextColor(Color.BLACK);
        }
        rTColor = !rTColor;
    }

    public void changeRightMid(View view) {
        if(!rMColor){
            rightMid.setBackgroundColor(Color.parseColor(themeColor));
            rightMid.setTextColor(Color.WHITE);
        }else{
            rightMid.setBackgroundColor(Color.parseColor(background2));
            rightMid.setTextColor(Color.BLACK);
        }
        rMColor = !rMColor;
    }

    public void changeRightBottom(View view) {
        if(!rBColor){
            rightBottom.setBackgroundColor(Color.parseColor(themeColor));
            rightBottom.setTextColor(Color.WHITE);
        }else{
            rightBottom.setBackgroundColor(Color.parseColor(background2));
            rightBottom.setTextColor(Color.BLACK);
        }
        rBColor = !rBColor;
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


//    public void toResultList(View view) {
//
//        View view = getLocalActivityManager()
//                .startActivity("ReferenceName", new
//                        Intent(this,YourActivity.class)
//                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
//                .getDecorView();
//        this.setContentView(view);
//
//
//
//       // TabWidget.getInstance().getTabHost().setCurrentTab(3);
//        Intent intent = new Intent(this, results.class);
//      //  StringBuffer urlString = new StringBuffer();
//      //  search parentActivity = (search) getParent();
//      //  replaceContentView("search", intent);
//        startActivity(intent);
//    }

//    private void replaceContentView(String id, Intent intent) {
//        View view = getLocalActivityManager().startActivity(id,intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)) .getDecorView(); this.setContentView(view);
//    }
//
//    public void toResultList(View view) {
//
//        View new_view = getLocalActivityManager()
//                .startActivity("ReferenceName", new
//                        Intent(this, results.class)
//                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
//                .getDecorView();
//        this.setContentView(new_view);
//    }
}
