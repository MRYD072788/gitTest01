package com.wyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author :wyz
 * @description:
 * @create :2022/12/29
 */

@Controller
@RequestMapping("/user")
public class ParamsDemo {
    @RequestMapping( "/paramsToMap")
    public String getParamsToMap(@RequestParam Map map, ModelAndView mav){

        System.out.println(map);
        return "index";

    }
}
