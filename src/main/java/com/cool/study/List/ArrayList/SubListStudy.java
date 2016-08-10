package com.cool.study.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cool on 16/7/24.
 */
public class SubListStudy {

    public static void main(String[] args) {
        List<String> c = new ArrayList<String>();
        c.add("a");
        c.add("b");

        List<String> c1=new ArrayList<String>(c);
        List<String> c2=c.subList(0,c.size());
        c2.add("c");

        for (String s:c){
            System.out.println(s);
        }
        System.out.println(" c == c1  ?" + c.equals(c1));
        System.out.println(" c == c2  ?" +c.equals(c2));

    }
}
