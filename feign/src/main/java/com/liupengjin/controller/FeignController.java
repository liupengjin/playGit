package com.liupengjin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.liupengjin.interfac.ServiceHiFeign;

@RestController
public class FeignController {
	@Autowired 
	ServiceHiFeign serviceHiFeign;
	@RequestMapping("/rest")
	public String getData(String name){
		
		return serviceHiFeign.getData(name);
	}
}
