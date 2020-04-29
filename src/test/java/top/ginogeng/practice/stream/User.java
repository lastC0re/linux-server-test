package top.ginogeng.practice.stream;

import java.util.Comparator;

/**
 * @ClassName User
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/29 0029 11:45
 * @Version V1.0
 **/
public class User implements Comparable{

    private String name;

    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static int compareTo(Object o1, Object o2) {
        return ((User) o1).getAge() - ((User) o2).getAge();
    }

    @Override
    public int compareTo(Object o) {
        return this.getAge() - ((User) o).getAge();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
