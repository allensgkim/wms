package com.brazil.cerp.controller;

import com.brazil.cerp.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brazil.cerp.domain.UserVO;

@RestController
@RequiredArgsConstructor
public class HelloController {

	@Autowired
	private UserService userService;

	@RequestMapping("/hello")
	public String hello() {
		return "hello Spring Boot!";
	}
	
	@RequestMapping(value="/helloUser/{id}", method=RequestMethod.GET)
	public ResponseEntity<UserVO> helloJson(@PathVariable String id) throws Exception {
		return new ResponseEntity<>(userService.getLoginInfor(id), HttpStatus.OK);
	}

}
