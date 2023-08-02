package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggAmazon {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		int count=allSugg.size();
		System.out.println(count);
		for (WebElement webElement : allSugg) {
			String text=webElement.getText();
			System.out.println(text);
			
		}
         allSugg.get(count-1).click();
         Thread.sleep(3000);
         driver.close();
         
	}

}
