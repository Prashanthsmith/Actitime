package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptions {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/91916/Desktop/Hotel.html");
WebElement slvListbox = driver.findElement(By.id("slv"));
Select s=new Select(slvListbox);
List<WebElement> allOptions = s.getOptions();
int count=allOptions.size();
System.out.println(count);
for(int i=0;i<count;i++) {
	s.selectByIndex(i);
	Thread.sleep(3000);
}
driver.quit();


	}

}
