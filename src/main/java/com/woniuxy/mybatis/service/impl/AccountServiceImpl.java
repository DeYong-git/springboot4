package com.woniuxy.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.mybatis.mapper.AccountMapper;
import com.woniuxy.mybatis.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountMapper accountMapper;
	
	@Transactional(isolation=Isolation.DEFAULT,rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
	@Override
	public void changeAccount(String from, String to, Integer money) {
		accountMapper.updateAccount(from, money*-1);
		if(true) {
			throw new RuntimeException("转账异常");
		}
		accountMapper.updateAccount(to, money);
	}
	
}
