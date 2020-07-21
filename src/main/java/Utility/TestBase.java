package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	

		public static WebDriver driver;
		public static BrowserUtility br;

		public static WebDriverWait wait;
		@BeforeSuite
		public static void launch(String url) {
			//wait=new WebDriverWait(driver, 30);
			br=new BrowserUtility();
			br.launch(url);
			
			
		}
		@AfterSuite
		public static void quit() {
			driver.close();
			
			
		}


}
