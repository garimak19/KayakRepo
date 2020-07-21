package Utility;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	public static void launch(String url) {
		WebDriverManager.chromedriver().setup();
		TestBase.driver=new ChromeDriver();
		
		TestBase.driver.get(url);
		TestBase.driver.manage().window().maximize();
		
		
	}

}
