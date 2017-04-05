package com.pycredit.microservice.demo.stmt;


public class SearchStmt {

	String core;
	String qPara=null;
	String fqPara=null;
	int start=1;
	int rows=10;
	
	public String getCore() {
		return core;
	}
	public void setCore(String core) {
		this.core = core;
	}
	public String getqPara() {
		return qPara;
	}
	public void setqPara(String qPara) {
		this.qPara = qPara;
	}
	public String getFqPara() {
		return fqPara;
	}
	public void setFqPara(String fqPara) {
		this.fqPara = fqPara;
	}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
}
