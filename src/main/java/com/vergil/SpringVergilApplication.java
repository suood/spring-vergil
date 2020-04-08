package com.vergil;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

//注解扫描，用于扫描相关注解类。 注解会被记录在类的元信息里 meta info 将会被装载到jvm的 metaspace中
@SpringBootApplication(scanBasePackages = {"com.vergil.*"},excludeName = {"com.vergil.mapper.*"})
@MapperScan(value = {"com.vergil.mapper.*"})
public class SpringVergilApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringVergilApplication.class, args);
	}

}
