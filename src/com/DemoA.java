package com;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {

	@Test
	public void run(){
		Reporter.log("Maven is running successfully in my project",true);
	}
}
