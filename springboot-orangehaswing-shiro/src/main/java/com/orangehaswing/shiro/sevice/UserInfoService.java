package com.orangehaswing.shiro.sevice;

import com.orangehaswing.shiro.entity.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}