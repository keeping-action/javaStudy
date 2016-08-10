package com.cool.study.thread.Current;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cool on 16/4/2.
 */
public class ReentrantLockStudy {


    private ReentrantLock lock=new ReentrantLock();


    public  void untimed(){
        boolean flagCaptured=lock.tryLock();

        try {
            System.out.println("tryLock(): " + flagCaptured);
        }finally {
            if (flagCaptured){
                lock.unlock();
            }
        }
    }

    public void timed() {
        boolean flagCaptured = false;
        try {
            flagCaptured = lock.tryLock(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("tryLock(2, TimeUnit.SECONDS): " + flagCaptured);
        } finally {
            if (flagCaptured)
                lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException{


       final ReentrantLockStudy  al = new  ReentrantLockStudy();

        al.untimed(); // True -- 可以成功获得锁
        al.timed(); // True --可以成功获得锁
        //新创建一个线程获得锁并且不释放
        new Thread() {
            {
                setDaemon(true);
            }

            public void run() {
                al.lock.lock();
                System.out.println("acquired");
            }
        }.start();
        Thread.sleep(1000);// 保证新线程能够先执行
        al.untimed(); // False -- 马上中断放弃
        al.timed(); // False -- 等两秒超时后中断放弃

    }
}
