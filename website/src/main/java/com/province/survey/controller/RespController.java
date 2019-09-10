package com.province.survey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangbingquan
 * @version 2019年09月10日
 * @since 2019年09月10日}
 **/
@RestController
@RequestMapping("/api")
public class RespController {

    @GetMapping("/helloWorld")
    public String testHello(){
        return "helloWorld";
    }
}
