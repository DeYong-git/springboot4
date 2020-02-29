package com.woniuxy.mybatis.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private String sno;
	private String sname;
	private Integer age;
	private Date birthday;
}
