package practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLInks2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[.='✕']")).click();
		 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count=allLinks.size();
		 System.out.println("links present in flipkart: "+count);
		 for (WebElement ele : allLinks) {
			System.out.println(ele.getText());
		}
		 driver.quit();
	}

}
