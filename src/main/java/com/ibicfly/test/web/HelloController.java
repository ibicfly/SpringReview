package com.ibicfly.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibicfly.test.service.HelloService;

@Controller
@RequestMapping("test/hello.test")
public class HelloController {
	@Autowired
	private HelloService helloservice;
	@RequestMapping(params="method=hello")
	public String hello()
	{	
		System.out.println("hello");
		helloservice.queryNameById(0);
		return "hello/hello";
	}
}
