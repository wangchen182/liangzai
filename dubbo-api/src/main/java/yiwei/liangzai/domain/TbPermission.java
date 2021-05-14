package yiwei.liangzai.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangchen
 * @since 2021-05-13
 */
public class TbPermission implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 权限编号
     */
    private String permission;

    /**
     * 权限描述
     */
    private String description;

    /**
     * 权限关联的角色id
     */
    @TableField("roleId")
    private String roleId;

    /**
     * 是否锁定
     */
    private Boolean locked;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "TbPermission{" +
        "id=" + id +
        ", permission=" + permission +
        ", description=" + description +
        ", roleId=" + roleId +
        ", locked=" + locked +
        "}";
    }
}
