package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElement {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.get("chrome://settings/appearance");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 SearchContext p1 = driver.findElement(By.tagName("settings-ui")).getShadowRoot();
 SearchContext p2 = p1.findElement(By.cssSelector(" settings-main[id='main']")).getShadowRoot();
 SearchContext p3 = p2.findElement(By.cssSelector("settings-basic-page[role='main']")).getShadowRoot();
 SearchContext p4 = p3.findElement(By.cssSelector(" settings-section[page-title='Appearance']")).getShadowRoot();
 SearchContext p5 = p4.findElement(By.tagName("settings-appearance-page")).getShadowRoot();
 SearchContext p6 = p5.findElement(By.cssSelector("settings-animated-pages[id='pages']")).getShadowRoot();
 SearchContext p7 = p6.findElement(By.cssSelector("settings-toggle-button[elide-label='Show home button']")).getShadowRoot();
   p7.findElement(By.cssSelector("cr-toggle[id='knob']")).click();
 
	}

}
