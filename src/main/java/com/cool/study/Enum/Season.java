package com.cool.study.Enum;

/**
 * Created by cool on 16/8/1.
 */
 enum Season {

    Spring("春"),Summer("夏"),Autoumn("秋"),Winter("冬");


    private String desc;
    Season(String _desc){

        desc=_desc;
    }

    public String getDesc(){
        return desc;
    }
    public static Season getComfortableSeason(){

        return Spring;
    }

    public static Season getCoolSeason(){

        return Winter;
    }

    public static Season getHotSeason(){

        return Summer;
    }

    public  Season firstSeason(){
        return Summer;
    }

    public static Season getBumperSeason(){

        return Autoumn;
    }


}
