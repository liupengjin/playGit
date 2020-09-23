package com.liupengjin.interfac;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.liupengjin.Hystric.FeignHystrix;

@FeignClient(value= "service-hi",fallback=FeignHystrix.class)
public interface ServiceHiFeign {
	@RequestMapping(value="/getData")
	public String getData(@RequestParam(value="name") String name);
}