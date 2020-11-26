package com.itheima.controller;

import com.itheima.domain.Role;
import com.itheima.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/role")
@Controller
public class RoleController {

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }
    @Autowired
    private RoleService roleService;
    @RequestMapping("/list")
    public ModelAndView list(){
        System.out.println(1);
        ModelAndView modelAndView =new ModelAndView();
        List<Role> roleList = roleService.list();
        modelAndView.addObject("roleList",roleList);
        //set view
        modelAndView.setViewName("role-list");

        return modelAndView;
    }
}
