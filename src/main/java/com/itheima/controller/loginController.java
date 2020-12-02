package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class loginController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest request;
    @RequestMapping("/login")
    public void test(@RequestParam String password,@RequestParam String email ){
        List<User> userList = jdbcTemplate.query("select * from sys_user where email = ? and password = ?",new Object[]{email,password}, new BeanPropertyRowMapper<User>(User.class));
        if(userList!=null)
        {
            //do something
        }

    }
}
