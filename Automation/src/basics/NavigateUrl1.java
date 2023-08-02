package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUrl1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://accounts.google.com"))
			System.out.println("url is navigated sucessfully and pass");
		else
			System.out.println("url is not navigated sucessfully and fail");
	}

}

