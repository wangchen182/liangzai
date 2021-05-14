package com.yiweiliangzai.springbootdubboclient.controller.config.shiro;

import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.annotation.Lazy;
import org.springframework.util.StringUtils;
import yiwei.liangzai.domain.TbPermission;
import yiwei.liangzai.domain.TbRole;
import yiwei.liangzai.domain.TbUser;
import yiwei.liangzai.service.login.Login0001;

import java.util.List;

public class CustomRealm extends AuthorizingRealm {



    @Autowired
    @Lazy
    private Login0001 login0001;

    /**
     * @MethodName doGetAuthorizationInfo
     * @Description 权限配置类
     * @Param [principalCollection]
     * @Return AuthorizationInfo
     * @Author WangShiLin
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //获取登录用户名
        String name = (String) principalCollection.getPrimaryPrincipal();
        //查询用户名称
        TbUser user = login0001.getUserByName(name);
        System.out.println(login0001+"888888888888888888888888888");
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        List<TbRole> roles = user.getRoles();
        for (TbRole role : roles) {
            //添加角色
            simpleAuthorizationInfo.addRole(role.getRole());

            TbPermission tbPermission = login0001.getTbPermissionByRoleId(role.getId());
            //添加权限
            simpleAuthorizationInfo.addStringPermission(tbPermission.getPermission());
        }


        return simpleAuthorizationInfo;
    }

    /**
     * @MethodName doGetAuthenticationInfo
     * @Description 认证配置类
     * @Param [authenticationToken]
     * @Return AuthenticationInfo
     * @Author WangShiLin
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        if (StringUtils.isEmpty(authenticationToken.getPrincipal())) {
            return null;
        }
        //获取用户信息
        String name = authenticationToken.getPrincipal().toString();
        TbUser user = login0001.getUserByName(name);
        if (user == null) {
            //这里返回后会报出对应异常
            return null;
        } else {
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(name, user.getPassword().toString(), getName());
            return simpleAuthenticationInfo;
        }
    }
}
