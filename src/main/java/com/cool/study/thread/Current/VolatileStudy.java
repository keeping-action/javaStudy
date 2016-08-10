package com.cool.study.thread.Current;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cool on 16/4/2.
 */
public class VolatileStudy {


    public static List<Thread> threads=new ArrayList<Thread>();

    public static int count=0;

    public volatile static int countWithVolatile=0;
    public volatile static Map<String,Object> parmasWithVolatile = new HashMap<String, Object>();
    public static Map<String,Object> parmas = new HashMap<String, Object>();

    public static void inc(){

        try {
            Thread.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        count++;
        countWithVolatile++;
        parmasWithVolatile.put(String.valueOf(countWithVolatile),countWithVolatile);
        parmas.put(String.valueOf(parmas),count);
    }

    public static void main(String [] args) throws InterruptedException{


        for(int i=0;i<1000;i++){
            Thread thread=new Thread(new Runnable() {
                public void run() {
                    VolatileStudy.inc();
                }
            });
            thread.start();
            threads.add(thread);

        }



        for (Thread thread : threads){
            thread.join();
        }

        System.out.println("count 运行结果为："+VolatileStudy.count);
        System.out.println("countWithVolatile 运行结果为："+VolatileStudy.countWithVolatile);

        System.out.println("parmasWithVolatile of size is " +parmasWithVolatile.size());
        System.out.println("parmas of size is " +parmas.size());


    }



}
