package com.xing.magic.cube.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : xingshukui
 * @email : xingshukui@890media.com
 * @date : 2018/11/12 3:39 PM
 * @desc :
 */
@RestController
@RequestMapping("/test")
public class Test {

    @RequestMapping("/v/{msg}")
    public String test(@PathVariable String msg) {
        return "hello world " + msg;
    }
}
