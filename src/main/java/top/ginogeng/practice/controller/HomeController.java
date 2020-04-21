package top.ginogeng.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName controller
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/1/21 0021 14:14
 * @Version V1.0
 **/
@RestController
public class HomeController {

    static int i = 100;

    static AtomicInteger ai = new AtomicInteger(100);

    ReentrantLock lock = new ReentrantLock();

    @RequestMapping("/")
    public Integer home() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(5000);
//                    i--;
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
        ai.decrementAndGet();
        return ai.get();
    }

    @RequestMapping("/reset")
    public Integer reset() {
        i = 100;
        return i;
    }

    @RequestMapping("/getNumber")
    public Integer getNumber() {
        return ai.get();
    }

    public static void main(String[] args) {
        Date date = new Date(1586770086000L);
        System.out.println(date);
    }
}
