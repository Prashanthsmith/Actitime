package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableLinks {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91916/Desktop/table.html");
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//td"));
		int count=allLinks.size();
		System.out.println(count);
		for (WebElement webElement : allLinks) {
			String text = webElement.getText();
			System.out.println(text);
					
		}
		
		driver.close();

	}

}
