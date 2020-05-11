package com.oehm.um.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.oehm.um.dao.RegisterDao;
import com.oehm.um.entity.Register;

public class RegisterService {
	@Autowired
	private RegisterDao registerDao;
	
	public void saveRegisterData(Register register) {
		registerDao.saveRegisterData(register);
		
		
	}

}
