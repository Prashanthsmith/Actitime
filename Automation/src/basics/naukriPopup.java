package basics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukriPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		File f=new File("./data/resume.docx");
		String abspath=f.getAbsolutePath();
		driver.findElement(By.id("resumeUpload")).sendKeys(abspath);
		

	}

}
