package com.pycredit.microservice.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pycredit.microservice.demo.manager.SearchManager;
@Service
public class DatingService implements SearchService{
	@Autowired
	SearchManager searchManager;
	@Override
	public String generateUrl() {
		// TODO Auto-generated method stub
		return "http://www.guokr.com/post/107666/";
	}

	@Override
	public String getResult() {
		// TODO Auto-generated method stub
		return searchManager.getHttpRest().get(generateUrl());
	}

}
