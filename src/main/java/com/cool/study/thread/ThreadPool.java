package com.cool.study.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cool on 16/8/8.
 */
public class ThreadPool {

    public static void main(String[] args) {

        ExecutorService es= Executors.newFixedThreadPool(8);

        for (int i=0 ; i<9 ; i++){

            es.submit(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

        es.shutdown();
    }

}
