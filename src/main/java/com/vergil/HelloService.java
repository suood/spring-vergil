package com.vergil;

import org.springframework.stereotype.Service;

@Service("helloService")// 这个字符串会在ApplicationContext里面作为 bean的 id使用
public class HelloService {
    public void doNothing() {
        System.out.println("just print ");
    }
}
