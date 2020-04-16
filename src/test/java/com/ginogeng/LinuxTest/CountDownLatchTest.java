package com.ginogeng.LinuxTest;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName CountDownLatchTest
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/14 0014 16:19
 * @Version V1.0
 **/
public class CountDownLatchTest {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < 50; i++) {
            countDownLatch.countDown();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
