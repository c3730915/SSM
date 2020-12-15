package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView test(@RequestParam String password, @RequestParam String email ){
        List<User> userList = jdbcTemplate.query("select * from sys_user where email = ? and password = ?",new Object[]{email,password}, new BeanPropertyRowMapper<User>(User.class));
        User user= new User();
        ModelAndView modelAndView = new ModelAndView();
        if(userList.size()==1)
        {
            modelAndView.setViewName("login/success");
            user=userList.get(0);

        }else if (userList.size()==0)
        {

            modelAndView.setViewName("login/fail");
            user=null;
        }
        modelAndView.addObject("user",user);
        return modelAndView;

    }
}
