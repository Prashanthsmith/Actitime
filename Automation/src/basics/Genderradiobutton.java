package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genderradiobutton {
	static {
		System.setProperty("webddriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-test id='open-registration-form-button]")).click();
		Thread.sleep(3000);
		WebElement female = driver.findElement(By.xpath("//span/span/input(@type='radio'])[1]"));
		int y1=female.getLocation().getY();
		WebElement male = driver.findElement(By.xpath("//span/span/input(@type='radio'])[2]"));
		int y2=male.getLocation().getY();
		WebElement cust = driver.findElement(By.xpath("//span/span/input(@type='radio'])[3]"));
		int y3=cust.getLocation().getY();
		if(y1==y2&&y2==y3)
			System.out.println("radio buttonms are properly aligned");
		else
			System.out.println("radio buttons are not properly aligned");
		driver.close();
			
		
		
		
		

	}

}
