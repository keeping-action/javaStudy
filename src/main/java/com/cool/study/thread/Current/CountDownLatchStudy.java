package com.cool.study.thread.Current;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by cool on 16/8/8.
 */
public class CountDownLatchStudy {
    public static void main(String[] args) throws Exception{

        int num = 10;
        CountDownLatch begin = new CountDownLatch(1);
        CountDownLatch end  = new CountDownLatch(num);

        ExecutorService es= Executors.newFixedThreadPool(num);


        List<Future<Integer>> futures=new ArrayList<Future<Integer>>();

        for (int i =0 ; i<num ;i++){
            futures.add(es.submit(new Runner(begin,end)));
        }

        begin.countDown();
        end.await();
        int count=10;

        for (Future<Integer> f: futures){
            count+=f.get();
        }
        System.out.println("平均分数为" + count / num);

        es.shutdown();

    }


}
