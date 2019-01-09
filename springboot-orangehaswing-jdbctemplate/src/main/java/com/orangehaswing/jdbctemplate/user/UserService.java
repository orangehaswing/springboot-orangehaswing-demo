package com.orangehaswing.jdbctemplate.user;

public interface UserService {

//    接口头注释：/** + 回车
    /**
     *
     * @param name
     * @param age
     */
    void create(String name,Integer age);

    /**
     *
     * @param name
     */
    void deleteByName(String name);

    /**
     *
     * @return Integer
     */
    Integer getAllUsers();

    void deleteAllUsers();

}
