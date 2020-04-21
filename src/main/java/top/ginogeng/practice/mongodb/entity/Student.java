package top.ginogeng.practice.mongodb.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * @ClassName Student
 * @Description: TODO 学生实体
 * @Author jipin.Geng
 * @Date 2020/4/20 0020 16:45
 * @Version V1.0
 **/
public class Student {

    /**
     * id
     */
    @Id
    private String stuId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 创建时间
     */
    private Date createTime = new Date();

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
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
}
