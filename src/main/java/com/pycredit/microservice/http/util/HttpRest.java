package com.pycredit.microservice.http.util;

public interface HttpRest {

	public String get(String url);
	public String post(String url,String dataJson);
}
