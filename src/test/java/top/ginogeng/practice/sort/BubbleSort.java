package top.ginogeng.practice.sort;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description: TODO 冒泡排序
 * @Author jipin.Geng
 * @Date 2020/4/16 0016 17:41
 * @Version V1.0
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {3, 5, 8, 9, 1, 0, 4, 6, 2, 7};
        for (int i = a.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
