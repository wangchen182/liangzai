package yiwei.liangzai.service.login;

import com.baomidou.mybatisplus.extension.service.IService;
import yiwei.liangzai.domain.User;

public interface Login extends IService<User> {
    User find();
}
