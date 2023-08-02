package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class attributexpath {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/91916/Desktop/sample.html");
		driver.findElement(By.xpath("//input[@type='text']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button'][2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' or @type='button']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	}

}
