package com.cool.study.thread.returnvalue;

import com.cool.study.thread.ExecuteThreadPool;
import org.junit.Test;

import java.util.concurrent.ExecutorService;

/**
 * Copyright CAINIAO WMS. All rights reserved. Organization : Outbound Optimization Center
 * <p>
 * add your describe
 *
 * @author zhiJin
 * @date 2019-06-16
 */

public class RunnableTest {

    @Test
    public void mainThread() {
        ExecutorService executorService = ExecuteThreadPool.callabeTestThreadPool;

        for (int i = 0; i < 15; i++) {
            executorService.submit(new ThreadRunnable());
        }


    }

    class ThreadRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"  start running!");
        }
    }
}


    