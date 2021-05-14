package yiwei.liangzai.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangchen
 * @since 2021-05-13
 */
@Data
public class TbUser implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐值
     */
    private String salt;

    /**
     *
     */
    @TableField(exist = false)
    private List<TbRole> roles;

    /**
     * 角色id
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
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
        return "TbUser{" +
        "id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", salt=" + salt +
        ", roleId=" + roleId +
        ", locked=" + locked +
        "}";
    }
}
