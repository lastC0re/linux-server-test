package top.ginogeng.practice.jdk14;

import java.util.Random;

/**
 * @ClassName Stream
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/27 0027 10:08
 * @Version V1.0
 **/
public class Stream {

    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
