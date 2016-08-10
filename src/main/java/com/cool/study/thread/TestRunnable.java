package com.cool.study.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cool on 16/5/27.
 */
public class TestRunnable {


    public static  int count=1;

    public static void main(String[] args) throws InterruptedException {


        testCount();
        System.out.println(count);
    }


    public static  void testCount() throws InterruptedException {


        List<Thread> list = new ArrayList<Thread>();
        for (int i = 0; i < 1000; i++) {
                Thread t = new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(3);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                            count++;

                    }

                });
                list.add(t);
                t.start();
        }


        //Thread.sleep(100000);
        for (Thread thread : list) {
            thread.join();
        }


    }

}
