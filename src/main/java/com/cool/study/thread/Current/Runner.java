package com.cool.study.thread.Current;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by cool on 16/8/8.
 */
public class Runner implements Callable<Integer>{

    private CountDownLatch begin;
    private CountDownLatch end;

    public Runner(CountDownLatch _begin ,CountDownLatch _end){
        begin=_begin;
        end=_end;
    }

    public Integer call() throws Exception {

        int score=new Random().nextInt(100);


        TimeUnit.MILLISECONDS.sleep(score);

        end.countDown();
        return score;
    }


}
