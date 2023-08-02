package basics;

import org.openqa.selenium.WebDriver;

public class Upcasting {
	static void testA1(WebDriver driver)
	{
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

	public static void testA(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
