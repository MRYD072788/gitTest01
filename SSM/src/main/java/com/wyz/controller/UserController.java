package com.wyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :wyz
 * @description:
 * @create :2022/12/29
 */

@Controller
public class UserController {
    @RequestMapping("/hello/sayHello")
    public String sayHello(HttpServletResponse response) throws IOException {
        System.out.println("UserController的sayHello()方法执行了");
        response.getWriter().write("are you ok?");
        return "index";

    }
}
