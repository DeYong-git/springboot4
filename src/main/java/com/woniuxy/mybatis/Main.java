package com.woniuxy.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//开启事务
@EnableTransactionManagement
//扫描包中的接口，自动生成实现类
@MapperScan("com.woniuxy.mybatis.mapper")
@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		System.out.println("222");
		SpringApplication.run(Main.class, args);
	}

}
