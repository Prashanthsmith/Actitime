package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllsuggestFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("realme");
		Thread.sleep(4000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		int count=allSugg.size();
		System.out.println(count);
		for (WebElement webElement : allSugg) {
			String text=webElement.getText();
			System.out.println(text);
			
		}
		allSugg.get(count-1).click();
		Thread.sleep(4000);
		driver.close();

	}

}
