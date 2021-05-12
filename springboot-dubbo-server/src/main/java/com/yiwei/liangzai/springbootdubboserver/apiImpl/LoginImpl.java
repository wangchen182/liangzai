package com.yiwei.liangzai.springbootdubboserver.apiImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yiwei.liangzai.springbootdubboserver.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import yiwei.liangzai.domain.User;
import yiwei.liangzai.service.login.Login;
@Service
public class LoginImpl implements Login {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User find() {
        return userMapper.selectById(1);
    }
}