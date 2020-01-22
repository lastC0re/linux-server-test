package com.ginogeng.LinuxTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName controller
 * @Description: TODO
 * @Author jipin.Geng
 * @Date 2020/1/21 0021 14:14
 * @Version V1.0
 **/
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "hello world!";
    }
}
