package com.cool.study.set;

import java.util.BitSet;

/**
 * Created by cool on 16/7/11.
 */
public class BitSetStudy {


    public static void main(String[] args) {


        BitSet bitSet=new BitSet();

        System.out.println(bitSet.get(2) +" ---- size is "+bitSet.size());

        bitSet.set(2);
//        bitSet.set(0,22);
//        bitSet.set(1,2);
//        bitSet.set(2,3);

//        long [] longs= bitSet.toLongArray();
//
//
//        for (int i=0 ; i<longs.length ;i++){
//            System.out.println(i);
//        }
//
       // System.out.println(bitSet.toLongArray());
    }
}
