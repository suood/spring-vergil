package com.vergil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication(scanBasePackages = {"com.vergil.*"})//注解扫描，用于扫描相关注解类。 注解会被记录在类的元信息里 meta info 将会被装载到jvm的 metaspace中
public class SpringVergilApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringVergilApplication.class, args);
	}

}
