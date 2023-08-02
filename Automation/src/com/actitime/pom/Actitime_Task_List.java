package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_Task_List {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnew;
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newcust;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdes;
	@FindBy(xpath="//div[.='- Select Customer -'and @class='emptySelection']")
	private WebElement selectcust;
	@FindBy (xpath="//div[.='Big Bang Company'and@class='itemRow cpItemRow ']")
	private WebElement bigbang;
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement ccbtn;
	public Actitime_Task_List(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getAddnew() {
		return addnew;
	}
	public WebElement getNewcust() {
		return newcust;
	}
	public WebElement getCustname() {
		return custname;
	}
	public WebElement getCustdes() {
		return custdes;
	}
	public WebElement getSelectcust() {
		return selectcust;
	}
	public WebElement getBigbang() {
		return bigbang;
	}
	public WebElement getCcbtn() {
		return ccbtn;
	}
	
}
