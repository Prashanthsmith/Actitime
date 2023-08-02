package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class careInsurancePopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		WebElement monthlistbox= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(monthlistbox);
		s.selectByValue("11");
		WebElement datelistbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(datelistbox);
		s1.selectByValue("2000");
		driver.findElement(By.xpath("//a[@data-date='19']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		String text = driver.findElement(By.id("policynumberError")).getText();		
		
		System.out.println(text);
		Thread.sleep(3000);
		boolean is = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(is==true)
		{
			System.out.println("message is displayed and pass");
		}
		else
			System.out.println("message is not displayed and fail ");
		
		driver.close();
		
		
		

	}

}
