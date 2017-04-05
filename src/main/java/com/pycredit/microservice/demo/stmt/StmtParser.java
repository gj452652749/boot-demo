package com.pycredit.microservice.demo.stmt;

import org.springframework.stereotype.Component;

/**
 * 将stmt解析成 engine rest url
 * @author gaoj
 *
 */
@Component
public class StmtParser {
	public String generateUrl(String engineHost,SearchStmt stmt) {
		StringBuilder sb=new StringBuilder();
		sb.append(engineHost).append("/select?");		
		return null;
	}
	public String generateUpdateUrl(String engineHost,SearchStmt stmt) {
		StringBuilder sb=new StringBuilder();
		sb.append(engineHost).append(stmt.getCore()).append("/update?commit=true");	
		return sb.toString();
	}
	public String generateSaveUrl(String engineHost,SearchStmt stmt) {	
		return generateUpdateUrl(engineHost,stmt);
	}
	public String generateDeleteUrl(String engineHost,SearchStmt stmt) {		
		return generateUpdateUrl(engineHost,stmt);
	}

}
