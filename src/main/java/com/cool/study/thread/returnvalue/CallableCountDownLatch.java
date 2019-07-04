package com.cool.study.thread.returnvalue;

import com.cool.study.thread.ExecuteThreadPool;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Copyright CAINIAO WMS. All rights reserved. Organization : Outbound Optimization Center
 * <p>
 * add your describe
 *
 * @author zhiJin
 * @date 2019-06-16
 */

public class CallableCountDownLatch {

    @Test
    public void CountDownLatchTest() throws InterruptedException, ExecutionException {

        ExecutorService executorService = ExecuteThreadPool.callabeTestThreadPool;
        CountDownLatch countDownLatch = new CountDownLatch(10);

        List<FutureTask<Integer>> futureTasks = Lists.newArrayList();
        for (int i = 0; i < 15; i++) {

            FutureTask<Integer> futureTask = (FutureTask<Integer>)executorService.submit(new ComputerNum(countDownLatch));
            futureTasks.add(futureTask);
        }

        countDownLatch.await();

        System.out.println("execute finish");

        for (FutureTask<Integer> futureTask : futureTasks) {
            System.out.println(futureTask.get());
        }

    }


    class ComputerNum implements Callable<Integer> {

        private CountDownLatch countDownLatch;

        public ComputerNum(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public Integer call() throws Exception {
            Random random  = new Random();
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" execute finish. countDownLatch.getCount()="+countDownLatch.getCount());
            countDownLatch.countDown();
            return random.nextInt() ;
        }
    }

}

    