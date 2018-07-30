package com.heitian.ssm.service.impl;

import javax.annotation.Resource;




import org.springframework.stereotype.Service;

import com.heitian.ssm.dao.IUserDao;
import com.heitian.ssm.model.User;
import com.heitian.ssm.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User getUserById(int userId) {
        System.out.println("这里没问题");
        return this.userDao.selectByPrimaryKey(userId);
    }

}
