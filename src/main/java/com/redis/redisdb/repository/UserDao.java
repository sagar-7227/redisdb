package com.redis.redisdb.repository;

import java.util.List;

import com.redis.redisdb.model.User;

public interface UserDao{

    boolean saveUser(User user);

    List<User> getAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);
    
}
