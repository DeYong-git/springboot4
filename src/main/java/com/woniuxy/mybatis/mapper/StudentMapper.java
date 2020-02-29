package com.woniuxy.mybatis.mapper;



import org.apache.ibatis.annotations.Mapper;

import com.woniuxy.mybatis.entity.Student;
//mapper注释生成接口的实现类
@Mapper
public interface StudentMapper {
	void insertStudent(Student student);
}
