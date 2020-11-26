package com.itheima.service.impl;

import com.itheima.dao.RoleDao;
import com.itheima.dao.impl.RoleDaoImpl;
import com.itheima.domain.Role;
import com.itheima.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public List<Role> list() {
        List<Role> roleList = roleDao.findAll();

        return roleList;
    }

    public void setRoleDao(RoleDaoImpl roleDao) {
        this.roleDao = roleDao;
    }
}
