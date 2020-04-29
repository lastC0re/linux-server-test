package top.ginogeng.practice;

import java.util.Arrays;

/**
 * @ClassName DataDelivery
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/27 0027 17:08
 * @Version V1.0
 **/
public class DataDelivery {

    public static void main(String[] args) {
        int [] a = {1, 2};
        add(a);
        System.out.println(Arrays.toString(a));
    }

    static void add(int [] b) {
        b[0] = 2;
    }
}
