package yiwei.liangzai.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangchen
 * @since 2021-05-13
 */
@Data
public class TbRolePermission implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 角色编号
     */
    @TableField("roleId")
    private Long roleId;

    /**
     * 权限编号
     */
    @TableField("permissionId")
    private Long permissionId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "TbRolePermission{" +
        "id=" + id +
        ", roleId=" + roleId +
        ", permissionId=" + permissionId +
        "}";
    }
}
