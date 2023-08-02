package basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yaml.snakeyaml.introspector.Property;

public class HandlingPropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String UN = p.getProperty("username");
		String PWD = p.getProperty("password");
		System.out.println(url);
		System.out.println(UN);
		System.out.println(PWD);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(UN);
		driver.findElement(By.name("pwd")).sendKeys(PWD);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		String title = driver.getTitle();
		String title1 = "actiTIME - Enter Time-Track";
		if(title.equals(title1))
			System.out.println("login is succesful and pass");
		else 
			System.out.println("login is not successful and fail");
		System.out.println(title);
		System.out.println(title1);
		driver.close();
		

	}

}
