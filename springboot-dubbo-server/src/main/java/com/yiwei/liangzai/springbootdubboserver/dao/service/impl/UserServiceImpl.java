package com.yiwei.liangzai.springbootdubboserver.dao.service.impl;


import com.yiwei.liangzai.springbootdubboserver.dao.mapper.UserMapper;
import com.yiwei.liangzai.springbootdubboserver.dao.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yiwei.liangzai.domain.User;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangchen
 * @since 2021-05-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
