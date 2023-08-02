package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Upacsting1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
public
static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Upcasting.testA1(driver);
	Thread.sleep(2000);
	WebDriver driver1=new FirefoxDriver();
	Upcasting.testA1(driver1);
	Thread.sleep(2000);
	
}
}
