package com.actimetime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.ActiTime_Enter_Time_Track;
import com.actitime.pom.Actitime_Task_List;
@Listeners(com.actitime.generic.ListnersImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ActiTime_Enter_Time_Track a=new ActiTime_Enter_Time_Track(driver);
		a.setTask();
		
		Actitime_Task_List ts=new Actitime_Task_List(driver);
		ts.getAddnew().click();
		ts.getNewcust().click();
		FileLib f=new FileLib();
		String createcustomer = f.getExceldata("CreateCustomer", 1, 6);
		ts.getCustname().sendKeys(createcustomer);
	String custdes=f.getExceldata("createcustomer", 1, 7);
	ts.getCustdes().sendKeys(custdes);
	ts.getSelectcust().click();
	ts.getBigbang().click();
	ts.getCcbtn().click();
	Thread.sleep(5000);
	WebElement  actualresult = driver.findElement(By.xpath("(//div[.='All Customers'and@class='title'])[2]"));
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualresult,createcustomer);
	s.assertAll();
	
	
		
	}

}
