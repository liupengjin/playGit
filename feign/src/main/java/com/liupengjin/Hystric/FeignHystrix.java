package com.liupengjin.Hystric;

import org.springframework.stereotype.Component;

import com.liupengjin.interfac.ServiceHiFeign;
@Component
public class FeignHystrix implements ServiceHiFeign{

	@Override
	public String getData(String name) {
		return "sorry " + name;
	}
}
