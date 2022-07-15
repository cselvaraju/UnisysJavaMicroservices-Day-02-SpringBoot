package com.unisys.day02springboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "mysql")
//@Primary
public class MySqlDataProvider implements DataProvider {
	
	public void getData() {
		System.out.println("MySqlDataProvider => Fetching data for analytics");
	}
	
}
