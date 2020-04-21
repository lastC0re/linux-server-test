package top.ginogeng.practice.mongodb.entity;

import org.springframework.data.annotation.Id;

/**
 * @ClassName Role
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/4/20 0020 17:00
 * @Version V1.0
 **/
public class Role {

    @Id
    private String roleId;

    private String roleName;

    private String roleDesc;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
