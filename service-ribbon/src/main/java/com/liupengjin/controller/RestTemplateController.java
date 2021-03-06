package com.liupengjin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.liupengjin.service.RestTemplateService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class RestTemplateController {
	@Autowired
	RestTemplateService restTemplateService;
	@RequestMapping("/rest")
	public String getRestTemplate(@RequestParam String name){
		
		
		System.out.println("******************"+name);
		return restTemplateService.serviceCall(name);
	}
	
	
}
