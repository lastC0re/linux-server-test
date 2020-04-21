package top.ginogeng.practice.string;

/**
 * @ClassName StringTest
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/20 0020 17:48
 * @Version V1.0
 **/
public class StringTest {

    public static void main(String[] args) {
        String s = "asasa";
        System.out.println(System.identityHashCode(s));
        s = s + "2121";
        System.out.println(System.identityHashCode(s));
        String h = "asasa2121";
        System.out.println(System.identityHashCode(h));
        String a = "asasaa";
        System.out.println(System.identityHashCode(a));
        String x = "asasaa";
        System.out.println(System.identityHashCode(x));
        String d = new String("asasaa");
        System.out.println(System.identityHashCode(d));
    }
}
