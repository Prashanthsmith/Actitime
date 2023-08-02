package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class unpwdalignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		int x1=driver.findElement(By.id("username")).getLocation().getX();
		int x2=driver.findElement(By.name("pwd")).getLocation().getX();
		if(x1==x2) 
				System.out.println("username and password textbox are aligned properly and pass ");
		else 
			System.out.println("username and password textbox are not aligned properly and fail");
		driver.close();
		
		
	}

}
