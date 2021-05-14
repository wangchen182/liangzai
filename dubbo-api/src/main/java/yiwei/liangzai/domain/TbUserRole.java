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
public class TbUserRole implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户编号
     */
    @TableField("userId")
    private Long userId;

    /**
     * 角色编号
     */
    @TableField("roleId")
    private Long roleId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "TbUserRole{" +
        "id=" + id +
        ", userId=" + userId +
        ", roleId=" + roleId +
        "}";
    }
}
