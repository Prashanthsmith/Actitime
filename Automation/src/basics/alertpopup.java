package basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.alertIsPresent());
Alert a = driver.switchTo().alert();
System.out.println(a.getText());
Thread.sleep(3000);
a.accept();
driver.close();
	}

}
