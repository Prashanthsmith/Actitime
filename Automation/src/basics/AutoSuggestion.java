package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=allSugg.size();
		for(WebElement webElement: allSugg)
		{
			String text = webElement.getText();
			System.out.println(text);
			
		}
		driver.close();

	}

}
