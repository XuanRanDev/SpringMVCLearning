package dev.xuanran.springmvcdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By XuanRan on 2022/2/23
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
