package com.cool.study.thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Copyright CAINIAO WMS. All rights reserved. Organization : Outbound Optimization Center
 * <p>
 * add your describe
 *
 * @author zhiJin
 * @date 2019-06-16
 */

public class ExecuteThreadPool {

    public static ExecutorService callabeTestThreadPool = new ThreadPoolExecutor(2, 5, 30, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10),
        new CustomerRejectedExecutionHandler());

    static class CustomerRejectedExecutionHandler implements RejectedExecutionHandler {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println("|ConsumerRejectedExecutionHandler|The index thread pool is full and be blocked!" + "|core|"
                + executor.getCorePoolSize() + "|max|" + executor.getMaximumPoolSize()
                + "|taskCount|" + executor.getTaskCount() + "|completed="
                + executor.getCompletedTaskCount());
        }
    }


    static class DefaultThreadFactory implements ThreadFactory {
        private static final AtomicInteger poolNumber = new AtomicInteger(1);
        private final AtomicInteger threadNumber = new AtomicInteger(1);

        private String threadNamePrefix;
        DefaultThreadFactory(String threadNamePrefix) {
            this.threadNamePrefix = threadNamePrefix + "Pool-" + poolNumber.getAndIncrement() + "-thread-";
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(null, r,
                threadNamePrefix + threadNumber.getAndIncrement(),
                0);
            if (t.isDaemon()) {

                t.setDaemon(false);
            }
            if (t.getPriority() != Thread.NORM_PRIORITY) {

                t.setPriority(Thread.NORM_PRIORITY);
            }
            return t;
        }
    }

}

    