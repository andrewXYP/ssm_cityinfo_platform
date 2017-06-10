package com.cityinfo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cityinfo.model.User;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> getUsers();
}