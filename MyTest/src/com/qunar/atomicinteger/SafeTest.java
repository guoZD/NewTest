package com.qunar.atomicinteger;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhenwei.liu created on 2013 13-9-2 下午10:18
 * @version $Id$
 */
public class SafeTest {

    private static AtomicInteger count = new AtomicInteger(0);
    private static final int times = Integer.MAX_VALUE;

    public static void main(String[] args) {

        long curTime = System.nanoTime();

        Thread decThread = new DecThread();
        decThread.start();

        // 使用run()来运行结果为0,原因是单线程执行不会有线程安全问题
        // new DecThread().run();

        System.out.println("Start thread: " + Thread.currentThread() + " i++");

        for (int i = 0; i < times; i++) {
            count.incrementAndGet();
        }

        // 等待decThread结束
        while (decThread.isAlive());

        long duration = System.nanoTime() - curTime;
        System.out.println("Result: " + count);
        System.out.format("Duration: %.2f\n", duration / 1.0e9);
    }

    private static class DecThread extends Thread {

        @Override
        public void run() {
            System.out.println("Start thread: " + Thread.currentThread() + " i--");
            for (int i = 0; i < times; i++) {
                count.decrementAndGet();
            }
            System.out.println("End thread: " + Thread.currentThread() + " i--");
        }
    }
}