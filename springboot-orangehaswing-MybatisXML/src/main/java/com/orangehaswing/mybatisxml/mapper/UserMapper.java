package com.orangehaswing.mybatisxml.mapper;

import com.orangehaswing.mybatisxml.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
