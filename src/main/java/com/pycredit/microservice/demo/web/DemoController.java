package com.pycredit.microservice.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pycredit.microservice.demo.service.DatingService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	DatingService datingService;
	@RequestMapping("/do")
	@ResponseBody
	public String doThing() {
		return "sucess";
	}
	@RequestMapping("/datingSearch")
	@ResponseBody
	public String datingSearch() {
		return datingService.getResult();
	}
}
