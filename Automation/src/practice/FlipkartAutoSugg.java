package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSugg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("realme");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//li/div/a/div[2]/span[contains(text(),'realme')]"));
		List<WebElement> allsugg1 = driver.findElements(By.xpath("//li/div/a/div[2]/span[contains(text(),'realme')]/.."));
		int count=allSugg.size();
		System.out.println(count);
		for ( int i=0;i<count;i++) {
			String text=allSugg.get(i).getText();
			System.out.println(text+" "+allsugg1.get(i).getText());


		}
		allSugg.get(3).click();
		Thread.sleep(3000);
		driver.close();
	}

}
