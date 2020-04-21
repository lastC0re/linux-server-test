package top.ginogeng.practice.mongodb.entity;

/**
 * @ClassName Car
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/20 0020 16:57
 * @Version V1.0
 **/
public class Car {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 名称
     */
    private String name;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
