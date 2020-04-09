package com.vergil.service;

import com.pojo.req.Base;
import org.springframework.stereotype.Service;

@Service("calculateService")
public class CalculateService {
    public String calculate(Base origin){ return new StringBuilder(Integer.toString(origin.getOriginData()*10 )).toString();}
}
