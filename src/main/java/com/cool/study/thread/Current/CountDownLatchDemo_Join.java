package com.cool.study.thread.Current;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cool on 16/8/9.
 */
public class CountDownLatchDemo_Join {

    final static int num=9;

    final static CountDownLatchDemo_Join countDownLatchDemo=new CountDownLatchDemo_Join();

    final static CountDownLatch countDownLatch=new CountDownLatch(num);

    public static void main(String[] args) {



        

        //testThread();
        testThreadPool();
    }

    public static void testThread(){

        try {
            for (int i=0 ;i<num;i++){
                new Thread(countDownLatchDemo.new Work(countDownLatch,"工人"+i)).start();
            }

            countDownLatch.await();

            System.out.println("end");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void testThreadPool() {

        ExecutorService executorService= Executors.newFixedThreadPool(num);

        try {

            for (int i=0 ;i<num;i++){
                executorService.submit(countDownLatchDemo.new Work(countDownLatch,"工人"+i));
            }

        countDownLatch.await();

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("end Thread pool");
        executorService.shutdown();
    }

    class Work implements Runnable{


        private CountDownLatch countDownLatch;
        private String workName;
        public Work(CountDownLatch _countDownLatch,String _workName){
            countDownLatch=_countDownLatch;
            workName=_workName;
        }

        public void run() {
            System.out.println(workName+" 已完成工作了");
            countDownLatch.countDown();
        }
    }

}
