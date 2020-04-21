package top.ginogeng.practice.mongodb.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

/**
 * @ClassName User
 * @Description: TODO 用户实体
 * @Author jipin.Geng
 * @Date 2020/4/20 0020 16:12
 * @Version V1.0
 **/
public class User {

    /**
     * id
     */
    @Id
    private Integer userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 车
     */
    private Car car;

    private List<Role> roles;

    /**
     * 创建时间
     */
    private Date createTime = new Date();

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
