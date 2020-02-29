package com.woniuxy.mybatis;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.woniuxy.mybatis.entity.Student;
import com.woniuxy.mybatis.mapper.StudentMapper;
import com.woniuxy.mybatis.service.AccountService;
import com.woniuxy.mybatis.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTests {
	@Autowired
	StudentMapper studentMapper;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	AccountService accountService;
	
	@Test
	public void contextLoads() {
		studentMapper.insertStudent(new Student("s001", "soon", 23, new Date()));
	}

	@Test
	public void test() {
		studentService.addStudent(new Student("s002", "soon", 23, new Date()));
	}
	@Test
	public void test1() {
		accountService.changeAccount("何坤坤","周江明", 3200);
	}
}
