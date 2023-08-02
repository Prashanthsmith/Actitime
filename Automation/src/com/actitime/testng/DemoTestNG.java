package com.actitime.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
	@Test
	public void print()
	{
		Reporter.log("Hi",true);
		Reporter.log("Hlo");
		Reporter.log("Bye",false);
	}
}
