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
public class TbRole implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 角色名称
     */
    private String role;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 父角色id
     */
    @TableField("parentId")
    private Long parentId;

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "TbRole{" +
        "id=" + id +
        ", role=" + role +
        ", description=" + description +
        ", parentId=" + parentId +
        ", locked=" + locked +
        "}";
    }
}
