package com.orangehaswing.shiro.sevice.impl;

import com.orangehaswing.shiro.dao.UserInfoDao;
import com.orangehaswing.shiro.entity.UserInfo;
import com.orangehaswing.shiro.sevice.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}