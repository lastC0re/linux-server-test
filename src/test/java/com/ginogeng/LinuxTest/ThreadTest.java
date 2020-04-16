package com.ginogeng.LinuxTest;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ThreadTest
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/14 0014 15:23
 * @Version V1.0
 **/
public class ThreadTest {

    private static Integer inventory = 1001;
    private static final int NUM = 1000;
    private static LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque<>();
    static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(inventory, inventory, 10L, TimeUnit.SECONDS, linkedBlockingDeque);
        final CountDownLatch countDownLatch = new CountDownLatch(NUM);
        long start = System.currentTimeMillis();
        for (int i = 0; i <= NUM; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    reentrantLock.lock();
                    inventory--;
                    reentrantLock.unlock();
                    System.out.println("线程执行:" + Thread.currentThread().getName());
                    //线程数减1
                    countDownLatch.countDown();
                }
            });
        }
        threadPoolExecutor.shutdown();
        try {
            //挂起,等待其他线程执行完毕
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("线程执行数:" + NUM + "     总耗时:" + (end - start) + "     库存数为:" + inventory);
    }

}
