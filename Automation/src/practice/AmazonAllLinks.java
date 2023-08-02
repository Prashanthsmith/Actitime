package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAllLinks {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
int count=allLinks.size();
System.out.println(count);
for (WebElement ele : allLinks) {
	System.out.println(ele.getText());
	
}
driver.close();
	}

}
