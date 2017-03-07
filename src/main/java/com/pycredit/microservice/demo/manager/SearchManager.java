package com.pycredit.microservice.demo.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pycredit.microservice.http.util.HttpRest;
@Component
public class SearchManager {
	@Autowired
	HttpRest httpRest;
	public HttpRest getHttpRest() {
		return httpRest;
	}

}
