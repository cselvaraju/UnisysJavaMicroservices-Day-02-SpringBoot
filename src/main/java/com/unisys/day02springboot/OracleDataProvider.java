package com.unisys.day02springboot;

import org.springframework.stereotype.Component;

@Component(value = "oracle")
public class OracleDataProvider implements DataProvider {
	
	public void getData() {
		System.out.println("OracleDataProvider => Fetching data for analytics");
	}
	
}
