package practice1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeWithOutQuit {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/");
driver.findElement(By.id("login-google-button")).click();
driver.findElement(By.id("login-facebook-button")).click();
//Thread.sleep(3000);
 Set<String> allwh = driver.getWindowHandles();
for (String wh : allwh) {
	driver.switchTo().window(wh);
	driver.close();
	
}
	}
	

}
