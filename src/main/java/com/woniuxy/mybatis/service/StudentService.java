package com.woniuxy.mybatis.service;

import com.woniuxy.mybatis.entity.Student;


public interface StudentService {
	void addStudent(Student student);
	void changeAccount(String from,String to,Integer money);
}
