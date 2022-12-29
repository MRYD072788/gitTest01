package com.wyz.controller;

import com.wyz.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :wyz
 * @description:
 * @create :2022/12/29
 */

@RestController
public class ResponBadyDemo {
    @RequestMapping("/responseJson")
    public User responseJson() {
        User user = new User(9,"wyz",999,"xyl");
        return user;

    }
}
