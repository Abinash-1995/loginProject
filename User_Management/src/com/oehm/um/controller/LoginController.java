package com.oehm.um.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oehm.um.entity.LoginDTO;
import com.oehm.um.entity.Register;
import com.oehm.um.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	@RequestMapping(value = "/login")
	public ModelAndView login(LoginDTO loginDTO) {
		Register register=loginService.login(loginDTO);
		if(register!=null) {
			return new ModelAndView("home.jsp","registerData",register);
		}else {
			return new ModelAndView("login.jsp","msg","Invalid credentials");
		}
	}
}
