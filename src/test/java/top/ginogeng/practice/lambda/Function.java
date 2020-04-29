package top.ginogeng.practice.lambda;

/**
 * @ClassName Function
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/27 0027 15:28
 * @Version V1.0
 **/
@FunctionalInterface
public interface Function<T> {

    void test(T t);

    default void test1() {
        System.out.println();
    }

}
