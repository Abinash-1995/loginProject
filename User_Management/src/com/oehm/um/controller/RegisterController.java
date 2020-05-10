package com.oehm.um.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oehm.um.entity.Register;
import com.oehm.um.service.RegisterService;
@Controller
public class RegisterController {
	@Autowired
	private RegisterService registerService;
	
	@PostMapping(value = "/register")
	public ModelAndView saveRegisterData(Register register) {
		registerService.saveRegisterData(register);
		return new ModelAndView("login.jsp","msg","Registration successful please login");	
	}
}
