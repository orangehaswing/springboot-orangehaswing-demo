package com.orangehaswing.jdbctemplate.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("studentDao")
public class StudentMapper implements StudentDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private User user;

    @Override
    public void create(String name, Integer age) {
        String sql = "INSERT  INTO USER(NAME ,AGE) VALUES (?,?)";
        int c = jdbcTemplate.update(sql,name,age);
        System.out.println("c:"+ c);
    }

    @Override
    public void deleteByName(String name) {
        String sql = "delete from USER where NAME = ?";
        int temp = jdbcTemplate.update(sql,name);
        System.out.println("temp :" + temp);
    }

    @Override
    public Integer getAllUsers() {
        return 1;
    }

    @Override
    public void deleteAllUsers() {

    }
}
