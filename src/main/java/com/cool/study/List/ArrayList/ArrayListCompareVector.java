package com.cool.study.List.ArrayList;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by cool on 16/7/24.
 */
public class ArrayListCompareVector {

    public static void main(String[] args) {
        ArrayList<String> strs=new ArrayList<String>();
        strs.add("a");

        Vector<String> strs2=new Vector<String>();
        strs2.add("a");

        System.out.println(strs.equals(strs2));
    }
}
