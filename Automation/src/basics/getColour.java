package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getColour {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
String colour = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
System.out.println(colour);
	}

}
