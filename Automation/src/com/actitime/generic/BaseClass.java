package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.actitime.pom.ActiTime_Enter_Time_Track;
import com.actitime.pom.LoginPage;

public class BaseClass {
	
	public  WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   FileLib l=new FileLib();
	   driver.get(l.getPropertdata("url"));
	   String un = l.getPropertdata("username");
	   String pwd = l.getPropertdata("password");
	   LoginPage a = new LoginPage(driver);
	   a.setLogin(un, pwd);
	  
		}
	@AfterMethod
	public void logOut() {
		Reporter.log("Logout",true);
		ActiTime_Enter_Time_Track a=new ActiTime_Enter_Time_Track(driver);
		a.setLogout();
	}
	
	

}
