package practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allLinks1 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[.='✕']")).click();
List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
int count=allLinks.size();
System.out.println(count);
for (WebElement ele : allLinks) {
	String text=ele.getText();
	System.out.println(text);
	
}
driver.close();
	}

}
