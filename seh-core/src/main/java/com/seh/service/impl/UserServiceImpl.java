package com.seh.service.impl;

import com.seh.domain.User;
import com.seh.mapper.UserMapper;
import com.seh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xinhezhang on 2018/3/31.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper mapper;

    public void save(User entity) {
        mapper.insertSelective(entity);
    }

    public void delete(Long id) {
        mapper.deleteByPrimaryKey(id);
    }

    public void update(User entity) {
        mapper.updateByPrimaryKeySelective(entity);
    }

    public User findById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<User> getAll() {
        return mapper.selectByExample(null);
    }
}
