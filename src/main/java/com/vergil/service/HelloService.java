package com.vergil.service;

import com.pojo.req.Girl;
import org.springframework.stereotype.Service;

@Service("helloService")// 这个字符串会在ApplicationContext里面作为 bean的 id使用
public class HelloService {
    public String  chatting(Girl girl) {
       return new StringBuffer("chatting with ").append(girl.getLooks()).toString();
    }
}
