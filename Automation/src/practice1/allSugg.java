package practice1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allSugg {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
//driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//button[.='✕']")).click();
driver.findElement(By.name("q")).sendKeys("realme");
List<WebElement> allSugg = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
int count=allSugg.size();
System.out.println(count);
for (WebElement ele : allSugg) {
	String text=ele.getText();
	System.out.println(text);
	
}
allSugg.get(1).click();
Thread.sleep(5000);
String title = driver.getTitle();
System.out.println("Title: "+title);
driver.close();
}

}
