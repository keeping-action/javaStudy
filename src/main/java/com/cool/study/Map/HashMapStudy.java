package com.cool.study.Map;

import java.util.*;

/**
 * Created by cool on 16/4/16.
 */
public class HashMapStudy {

    public static void main(String[] args) {

//        Map<String,Object> params=new HashMap<String, Object>();
//
//
//        params.put("key1","value1");
//
//
//        System.out.println(params.put("key1", "value1_2"));
//        System.out.println(params.put("key3", "value3"));
//        System.out.println(params.get("key1"));
//
//        System.out.println(params.size());
//        params.clear();
//        System.out.println(params==null);
        setAndMapEquals();

    }



    public static void setAndMapEquals(){

        Set<String> hashSet=new HashSet<String>();
        hashSet.add("a");

        Set<String> treeSet=new TreeSet<String>();
        treeSet.add("a");

        Map<String,Object> hash=new HashMap<String, Object>();
        hash.put("a", "a");
        Map<String,Object> tree=new TreeMap<String, Object>();
        tree.put("a","a");

        System.out.println(hash.equals(tree));
        System.out.println(hashSet.equals(treeSet));
    }


}
