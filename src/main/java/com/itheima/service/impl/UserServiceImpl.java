package com.itheima.service.impl;

import com.itheima.dao.RoleDao;
import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.Role;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //    @Autowired
    private UserDao userDao;
    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<User> list() {
        List<User> userList = userDao.findAll();
       //封装userList中的每一个User的roles数据
        for (User user : userList) {
            //get user's id
            Long id = user.getId();
            //将id作为参数，查询当前userID对应的role集合数据
            List<Role>roles = roleDao.findRoleByUserId(id);
            user.setRoles(roles);


        }
        return userList;
    }

    @Override
    public void save(User user, Long[] roleIds) {

    }

    @Override
    public void del(Long userId) {

    }

}
