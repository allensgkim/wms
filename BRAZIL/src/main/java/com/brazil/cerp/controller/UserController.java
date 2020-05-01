package com.brazil.cerp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brazil.cerp.domain.UserVO;
import com.brazil.cerp.mapper.user.UserMapper;

@Controller
public class UserController {
	@Autowired
	private UserMapper mapper;
	
	@RequestMapping("/user")
	public void user(Model model) throws Exception {
		String id = "test";
		
		UserVO user = mapper.getLoginInfor(id);
		model.addAttribute("user", user);
	}
}
