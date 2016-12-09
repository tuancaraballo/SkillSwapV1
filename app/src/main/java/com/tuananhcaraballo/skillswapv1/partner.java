package com.tuananhcaraballo.skillswapv1;

/**
 * Created by Antuan on 12/2/16.
 */

public class partner {

    public String user_name;
    public String imageFile;
    public String teachingSkill;
    public String teachingLevel;
    public String learningLevel;
    public String learningSkill;

    public partner(String nombre, String imagen, String teachSk, String teachLvl,
                   String learnLvl, String learnSk){
        user_name = nombre;
        imageFile = imagen;
        teachingSkill = teachSk;
        teachingLevel = teachLvl;
        learningSkill = learnLvl;
        learningLevel = learnLvl;
    }

}
