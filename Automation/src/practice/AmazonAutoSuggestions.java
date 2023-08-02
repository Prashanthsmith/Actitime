package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme");
List<WebElement> allSugg = driver.findElements(By.xpath("//div[contains(text(),'realme')]"));
int count=allSugg.size();
System.out.println(count);
for (WebElement ele : allSugg) {
	String text=ele.getText();
	System.out.println(text);
	
	
}
allSugg.get(2).click();
Thread.sleep(3000);
driver.close();
}

}
