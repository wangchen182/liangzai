package com.yiwei.liangzai.springbootdubboserver.apiImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yiwei.liangzai.springbootdubboserver.dao.mapper.TbPermissionMapper;
import com.yiwei.liangzai.springbootdubboserver.dao.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import yiwei.liangzai.domain.TbPermission;
import yiwei.liangzai.domain.TbUser;
import yiwei.liangzai.service.login.Login0001;

@Service
public class LoginImpl extends ServiceImpl<TbUserMapper, TbUser> implements Login0001 {
    @Autowired
    private TbUserMapper tbUserMapper;
    @Autowired
    private TbPermissionMapper tbPermissionMapper;
    @Override
    public TbUser find() {
        return tbUserMapper.selectById(1);
    }

    @Override
    public TbUser getUserByName(String name) {
        QueryWrapper<TbUser> tbUserQueryWrapper = new QueryWrapper<>();
        tbUserQueryWrapper.eq("username",name);
        return tbUserMapper.selectOne(tbUserQueryWrapper);
    }

    @Override
    public TbPermission getTbPermissionByRoleId(Long id) {
        QueryWrapper<TbPermission> tbUserQueryWrapper = new QueryWrapper<>();
        tbUserQueryWrapper.eq("roleId",id);
        return tbPermissionMapper.selectOne(tbUserQueryWrapper);
    }
}
