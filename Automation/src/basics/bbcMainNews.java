package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbcMainNews {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		List<WebElement> allnews = driver.findElements(By.xpath("(//h2[@class='top-list__heading'])[1]/..//h3"));
		for (WebElement ele : allnews) {
			System.out.println(ele.getText());
			
		}
		driver.close();

	}

}
