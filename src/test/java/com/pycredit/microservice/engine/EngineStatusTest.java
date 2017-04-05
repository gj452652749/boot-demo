package com.pycredit.microservice.engine;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class EngineStatusTest {
	@Test
	public void getLiveNodes() {
		EngineStatus status=new EngineStatus();
		status.init();
		List<String> list=status.getLiveNodes();
		for(String ele:list)
			System.out.println("node:"+ele);
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
