package com.chongyan.service.client;

import com.chongyan.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserFallbackClient implements UserClient{
    @Override
    public User getUserById(int uid) {
        User user = new User();
        user.setName("我是替代方案");
        return user;
    }
}
