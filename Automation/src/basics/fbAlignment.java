package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fbAlignment {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
//driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
Thread.sleep(3000);
WebElement female = driver.findElement(By.xpath("//span/span/input[@type='radio'][1]"));
int y1 = female.getLocation().getY();
WebElement male = driver.findElement(By.xpath("//span/span/input[@type='radio'][2]"));
int y2=male.getLocation().getY();
WebElement cust = driver.findElement(By.xpath("//span/span/input[@type='radio'][3]"));
int y3=cust.getLocation().getY();
if(y1==y2&&y2==y3)
	System.out.println("radio buttons are properly aligned");
else
	System.out.println("radio buttons are not properly aligned");
driver.close();
	}

}
