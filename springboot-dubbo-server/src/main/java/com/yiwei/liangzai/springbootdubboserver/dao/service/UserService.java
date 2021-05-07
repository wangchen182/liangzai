package com.yiwei.liangzai.springbootdubboserver.dao.service;

import com.yiwei.liangzai.springbootdubboserver.dao.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangchen
 * @since 2021-05-07
 */
public interface UserService extends IService<User> {
        User findAll();
}
