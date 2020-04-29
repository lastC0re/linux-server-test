package top.ginogeng.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName StreamTest
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/29 0029 10:44
 * @Version V1.0
 **/
public class StreamTest {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("z3", 10));
        users.add(new User("l4", 30));
        users.add(new User("w5", 20));
        users.add(new User("z6", 10));
        Stream<User> userStream = users.stream();
        userStream.collect(Collectors.toList());
    }
}
