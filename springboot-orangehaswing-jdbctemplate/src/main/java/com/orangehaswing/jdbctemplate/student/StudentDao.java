package com.orangehaswing.jdbctemplate.student;


public interface StudentDao {

    void create(String name,Integer age);

    void deleteByName(String name);

    Integer getAllUsers();

    void deleteAllUsers();
}
