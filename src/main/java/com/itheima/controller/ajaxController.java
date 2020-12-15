package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
public class ajaxController {
    /**
     * 简单的ajax实现
     */
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/pages/ajaxJquery")

    public void test(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        System.out.println(username);
        response.getWriter().write("hello : " + username);

    }
}
