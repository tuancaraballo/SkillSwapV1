package com.tuananhcaraballo.skillswapv1;

import java.util.ArrayList;

/**
 * Created by Antuan on 12/2/16.
 */
public class user_result {

    public String user_name;
    public String imageFile;

    public ArrayList<String> teachingSkills;
    public ArrayList<String> learningSkills;

    public user_result(String nombre, String file, ArrayList<String> teachingSk,
                       ArrayList<String> learningSk){
        user_name = nombre;
        imageFile = file;
        teachingSkills = teachingSk;
        learningSkills = learningSk;

    }




}
