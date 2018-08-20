package com.spring.boot.all.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.all.bean.StudentBean;
import com.spring.boot.all.service.StudentService;

@RestController
public class StudentController {

	//
	@Autowired
	public StudentService service;

	@GetMapping(value = "/hello")
	public String greeting() {
		return "hello Spring boot";

	}

	@RequestMapping("/testuser")
	public String greetings(@RequestParam("userID") String userID) {
		return "hello again   " + userID;

	}

	@GetMapping("/greet/{userid}/{coursename}")
	public String greet(@PathVariable("userid") String userid, @PathVariable("coursename") String coursename) {
		return userid + "hi there..." + coursename;

	}

	@RequestMapping(value = "/app/create", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public StudentBean insertmethod(@RequestBody StudentBean bean) {

		service.insert(bean);

		return bean;

	}

}
