package com.pycredit.microservice.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.pycredit.microservice.demo.manager.SearchManager;

/**
 * 增删查改
 * @author gaoj
 *
 */
public class DatingDao {
	@Autowired
	SearchManager searchManager;
	public String generateDeleteJson(String id) {
		String json="{\"id\":\"+id+\"}";
		return json;
	}
	void delete(String id) {
		
	}
	void save(String json) {
		
	}
}
