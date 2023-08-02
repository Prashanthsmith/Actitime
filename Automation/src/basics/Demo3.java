package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/chromedriver_win32/geckodriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	Demo1.testA(driver);
	WebDriver driver1=new FirefoxDriver();
	Demo1.testA(driver1);
			
		

	}

}
