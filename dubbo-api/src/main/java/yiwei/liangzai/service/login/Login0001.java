package yiwei.liangzai.service.login;

import com.baomidou.mybatisplus.extension.service.IService;
import yiwei.liangzai.domain.TbPermission;
import yiwei.liangzai.domain.TbRolePermission;
import yiwei.liangzai.domain.TbUser;

public interface Login0001 extends IService<TbUser> {
    TbUser find();
    TbUser getUserByName(String name);
    TbPermission getTbPermissionByRoleId(Long id);
}
