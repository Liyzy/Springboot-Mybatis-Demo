package com.dashang.service;

import com.dashang.mapper.UserMapper;
import com.dashang.model.UserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<UserDomain> getUsers(){
        return userMapper.getUser();
    }
}
