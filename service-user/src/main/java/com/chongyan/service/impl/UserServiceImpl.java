package com.chongyan.service.impl;

import com.chongyan.mapper.UserMapper;
import com.chongyan.entity.User;
import com.chongyan.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper mapper;

    @Override
    public User getUserById(int uid) {
        return mapper.getUserById(uid);
    }
}
