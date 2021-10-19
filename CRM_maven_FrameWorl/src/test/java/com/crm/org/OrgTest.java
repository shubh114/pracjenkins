package com.crm.org;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createorg() {
		System.out.println("create org");
		String url = System.getProperty("url");
		System.out.println(url);
	
	}
	
	@Test
	public void editorg() {
		System.out.println("edit org");
	
	}
}
