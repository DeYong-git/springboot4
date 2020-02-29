package com.woniuxy.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
	void updateAccount(@Param("aname") String aname,@Param("money") Integer money);
}
