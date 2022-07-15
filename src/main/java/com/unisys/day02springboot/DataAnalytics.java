package com.unisys.day02springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DataAnalytics {
	
//	@Autowired
//	@Qualifier("mysql")
	private DataProvider dataProvider;
	
	private String description;
	
	public DataAnalytics() {
		System.out.println("DataAnalytics: Default Ctor");
	}
	
	@Autowired
	public DataAnalytics(@Qualifier("oracle") DataProvider dataProvider) {
		System.out.println("DataAnalytics: 1-arg Ctor");
		this.dataProvider = dataProvider;
	}
	
	public void setDataProvider(DataProvider dataProvider) {
		System.out.println("DataAnalytics: Setter");
		this.dataProvider = dataProvider;
	}
	
	public void getData() {
		this.dataProvider.getData();
	}
}
