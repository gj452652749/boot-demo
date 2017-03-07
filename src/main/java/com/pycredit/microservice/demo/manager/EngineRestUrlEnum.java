package com.pycredit.microservice.demo.manager;

public enum EngineRestUrlEnum {
	SAVE_REST_URL("http://localhost:8090/solr/geo/update?wt=json"),
	DELETE_REST_URL("http://localhost:8090/solr/geo/update?wt=json");
	private String restUrl;	
	private EngineRestUrlEnum(String restUrl) {
		this.restUrl=restUrl;
	}
	public String getRestUrl() {
		return restUrl;
	}
	
}
