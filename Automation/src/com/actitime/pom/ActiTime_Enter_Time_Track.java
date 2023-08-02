package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTime_Enter_Time_Track {
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement taskbtn;
	@FindBy(id="logoutLink")
	private WebElement logoutBtn;
	public ActiTime_Enter_Time_Track(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setTask() {
		taskbtn.click();
	}
	public void setLogout() {
		logoutBtn.click();
	}
}
