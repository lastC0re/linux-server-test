package top.ginogeng.practice.lambda;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/27 0027 11:56
 * @Version V1.0
 **/
public class Test {

    public static void main(String[] args) {
        LambdaUse use = new LambdaUse();
        use.lambdaUse(new FuncRef()::print);
        System.out.println();
    }

}
