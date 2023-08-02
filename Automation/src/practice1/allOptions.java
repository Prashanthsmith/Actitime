package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.netty.handler.ssl.util.SelfSignedCertificate;

public class allOptions {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/91916/Desktop/Hotel.html");
WebElement mtrListbox = driver.findElement(By.id("mtr"));
Select s=new Select(mtrListbox);
List<WebElement> allOptions = s.getOptions();
for (WebElement ele : allOptions) {
	String text=ele.getText();
	System.out.println(text);
	
}
driver.quit();
	}

}
