package com.cool.study.thread.CyclicBarrier;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

/**
 * 线程汇聚到一点时（采用CyclicBarrier进行通信）
 * Created by cool on 16/8/8.
 */
public class Work implements Runnable{

    private CyclicBarrier cyclicBarrier;

    public Work(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier=cyclicBarrier;
    }

    public void run() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println(Thread.currentThread().getName()+"- 到达汇合点");
            cyclicBarrier.await();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CyclicBarrier cb=new CyclicBarrier(3, new Runnable() {
            public void run() {
                System.out.println("隧道已经打通");
            }
        });

        new Thread(new Work(cb),"工人1").start();
        new Thread(new Work(cb),"工人2").start();
        new Thread(new Work(cb),"工人3").start();


        System.out.println(cb.getNumberWaiting());
    }
}
