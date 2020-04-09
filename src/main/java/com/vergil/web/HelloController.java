package com.vergil.web;

import com.pojo.req.Base;
import com.pojo.req.Girl;
import com.vergil.service.CalculateService;
import com.vergil.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController// 此注解表明改类所有的public方法 对外提供rest服务
public class HelloController {

    @Autowired
    private HelloService helloService;
    private CalculateService calculateService;

    @GetMapping("/hello")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new StringBuilder("hello ").append(name).toString();
    }
    @PostMapping("/chatting")
    public String chatting(@RequestBody Girl girl) {
        return helloService.chatting(girl);
    }

    @GetMapping("/add")
    public String add(@RequestParam(value = "origin_num", defaultValue = "100") String origin_num) {
        return new StringBuilder(Integer.toString(Integer.parseInt(origin_num) + 20)).toString();
    }
    @PostMapping("/calculate")
    public String calculate(@RequestBody Base base) { return calculateService.calculate(base); }
}
