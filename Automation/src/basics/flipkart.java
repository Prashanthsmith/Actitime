package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max 128gb"+Keys.ENTER);
		List<WebElement> mobiles = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max ')]"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max ')]/../../div[2]/div[1]/div[1]/div[1]"));
		for(int i=0;i<mobiles.size();i++){

	 String mobile = mobiles.get(i).getText();
	 String price = prices.get(i).getText();
	 System.out.println(mobile+ "--->"+price);
	 
		
			
		}
		driver.close();
		
	}	
		

}
