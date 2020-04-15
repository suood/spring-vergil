package com.vergil.service;

import com.pojo.req.Base;
import org.springframework.stereotype.Service;

@Service("calculateService")
public class CalculateService {
    public String calculate(Base base){
        System.out.println(base.getData());
        return new StringBuilder(Integer.toString(base.getData()*10 )).toString();
    }
}
