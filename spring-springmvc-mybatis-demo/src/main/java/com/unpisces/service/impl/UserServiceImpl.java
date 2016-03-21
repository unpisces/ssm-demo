package com.unpisces.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.unpisces.dao.IUserDao;
import com.unpisces.pojo.User;
import com.unpisces.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userdao;
	
	public User getUserById(int userId) {
		return this.userdao.selectByPrimaryKey(userId);
	}

}
