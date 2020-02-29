package com.woniuxy.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.mybatis.entity.Student;
import com.woniuxy.mybatis.mapper.StudentMapper;
import com.woniuxy.mybatis.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentMapper studentMapper;
	
	@Override
	public void addStudent(Student student) {
		studentMapper.insertStudent(student);
	}

	@Override
	public void changeAccount(String from, String to, Integer money) {
		// TODO Auto-generated method stub
		
	}
	
}
