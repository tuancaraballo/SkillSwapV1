package com.tuananhcaraballo.skillswapv1;

import java.util.ArrayList;

/**
 * Created by Antuan on 12/2/16.
 */
 public class GLOBALS {

    private static GLOBALS globalInstance = new GLOBALS();

    public static GLOBALS getGlobalInstance() {
        return globalInstance;
    }

    public ArrayList<partner> partners = new ArrayList<>();
    public ArrayList<user_result> users_results = new ArrayList<>();

    public boolean isFinishSwap() {
        return finishSwap;
    }

    public void setFinishSwap(boolean finishSwap) {
        this.finishSwap = finishSwap;
    }

    public boolean isAcceptRequest() {
        return acceptRequest;
    }

    public void setAcceptRequest(boolean acceptRequest) {
        this.acceptRequest = acceptRequest;
    }

    private boolean finishSwap = false;
    private boolean acceptRequest = false;

    public int getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(int LEVEL) {
        this.LEVEL = LEVEL;
    }


    public int getCOLUMN() {
        return COLUMN;
    }

    public void setCOLUMN(int COLUMN) {
        this.COLUMN = COLUMN;
    }

    public boolean isNotInMain() {
        return notInMain;
    }

    public void setNotInMain(boolean notInMain) {
        this.notInMain = notInMain;
    }

    private  boolean notInMain = false;

    private int COLUMN = -1;
    private int LEVEL = -1;


}
