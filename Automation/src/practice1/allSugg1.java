package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allSugg1 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme");
Thread.sleep(3000);
List<WebElement> allSugg = driver.findElements(By.xpath("//div/div/div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
int count=allSugg.size();
System.out.println(count);
for (WebElement ele  : allSugg) {
	System.out.println(ele.getText());
	
}
allSugg.get(count-1).click();
Thread.sleep(3000);
driver.quit();
	}

}
