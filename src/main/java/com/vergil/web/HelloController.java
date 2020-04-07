package com.vergil.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController// 此注解表明改类所有的public方法 对外提供rest服务
public class HelloController {

    @GetMapping("hello")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new StringBuilder("hello ").append(name).toString();
    }
}
