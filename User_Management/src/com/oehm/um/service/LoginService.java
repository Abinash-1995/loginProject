package com.oehm.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oehm.um.dao.LoginDao;
import com.oehm.um.entity.LoginDTO;
import com.oehm.um.entity.Register;
@Service
public class LoginService {
	@Autowired
	private LoginDao loginDao;

	public Register login(LoginDTO loginDTO) {
		return loginDao.login(loginDTO);
	}

}
