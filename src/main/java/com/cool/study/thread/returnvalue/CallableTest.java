package com.cool.study.thread.returnvalue;

import com.alibaba.fastjson.JSON;
import com.cool.study.thread.ExecuteThreadPool;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

/**
 * Copyright CAINIAO WMS. All rights reserved. Organization : Outbound Optimization Center
 * <p>
 * add your describe
 *
 * @author zhiJin
 * @date 2019-06-16
 */

public class CallableTest {


    @Test
    public  void testThread() throws ExecutionException, InterruptedException {

        System.out.println("CallableTest");


        ExecutorService executorService = ExecuteThreadPool.callabeTestThreadPool;

        List<FutureTask<List<Long>>> futureTasks = Lists.newArrayList();
        for (int i = 0; i < 150; i++) {

            System.out.println("create thread - "+i);
            ThreadCallable bomRebuildCallable = new ThreadCallable();
            FutureTask<List<Long>> futureTask = (FutureTask<List<Long>>)executorService.submit(bomRebuildCallable);
            //System.out.println(futureTask.get());
            //
            //executorService.submit(bomRebuildCallable);

            futureTasks.add(futureTask);
        }


        futureTasks.forEach(futureTask->{
            try {
                System.out.println(futureTask.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        Thread.sleep(5000);

    }



    class ThreadCallable implements Callable<List<Long>> {

        @Override
        public List<Long> call() throws Exception {

            System.out.println("calling");
            List<Long> result = Lists.newArrayList();
            for (int i = 0; i < 10; i++) {
                result.add(Long.valueOf(i));
            }
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" execute result: "+ JSON.toJSONString(result));
            return result;
        }
    }


}

    