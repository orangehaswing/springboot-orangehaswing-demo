package com.orangehaswing.cache.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
@Service
@CacheConfig(cacheNames = "user")
public interface UserMapper {

    @Select("select * from user where name = #{name}")
    @Cacheable(key = "#p0")
    User findByName(@Param("name") String name);

    @Insert("insert into user(name,age) values(#{name},#{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}
