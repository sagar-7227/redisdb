package com.redis.redisdb.service;

import java.util.List;

import com.redis.redisdb.model.User;

public interface UserService {

    boolean saveUser(User user);

    List<User> getAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);
    
}
