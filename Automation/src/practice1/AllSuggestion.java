package practice1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllSuggestion {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme");
	Thread.sleep(2000);
	List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
	int count=allSugg.size();
	for (WebElement ele : allSugg) {
		System.out.println(ele.getText());
		
	}
	allSugg.get(2).click();
	Thread.sleep(4000);
	driver.quit();
}
}
