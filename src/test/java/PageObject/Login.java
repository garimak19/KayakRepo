package PageObject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Login {

	public WebDriver driver;
	WebDriverWait lwait;
	public Login(WebDriver ldriver,WebDriverWait wait) {
		
		driver=ldriver;
		lwait=wait;
		PageFactory.initElements(ldriver, this);
	}
	
	
	@FindBy(xpath="//a[@aria-label='Flights']")
	WebElement filght;
	
	public void Click_Flight() {
		
		lwait.until(ExpectedConditions.elementToBeClickable(filght));
		filght.click();
		
		
		
	}
	
	
	
	@FindBy(xpath="//div[@data-placeholder='To?' and @aria-label='Flight destination input']")
	WebElement dest;
	
	
	@FindBy(xpath="//div[contains(text(),\"Can't decide where to go?\")]")
	WebElement anywhere;
	public void enterDestination(String od) throws Exception {
		
		lwait.until(ExpectedConditions.elementToBeClickable(dest));
		Thread.sleep(3000);
		
		dest.click();
		
	lwait.until(ExpectedConditions.elementToBeClickable(anywhere));
	anywhere.click();
	}
	
	
	
	
	
	@FindBy(xpath="//button[contains(@id,'-dateRangeInput-start-inc') and @class='_irF _irG _iGL _j0K _j0L _ioE _iNT _irH _im4 _ir9 _iNU _iaL _ifs'and @aria-label='Increment date by one day']//*[local-name()='svg']")
	WebElement dDate;
	

	@FindBy(xpath="//button[contains(@id,'-dateRangeInput-end-inc') and @class='_irF _irG _iGL _j0K _j0L _ioE _iNT _irH _im4 _ir9 _iNU _iaL _ifs']//*[local-name()='svg']")
	WebElement rDate;
	
	
	public void enterDates() throws Exception {
		
		lwait.until(ExpectedConditions.elementToBeClickable(dDate));
		Thread.sleep(3000);
		
		dDate.click();
		
		
		lwait.until(ExpectedConditions.elementToBeClickable(rDate));
		Thread.sleep(3000);
		
		rDate.click();
	}
	
	
	
	@FindBy(xpath="//span[contains(@class,'v-c-p centre')]//span[contains(@class,'icon')]//*[local-name()='svg']")
	WebElement search;
	
	public void Click_search() throws Exception {
		Thread.sleep(3000);
		//lwait.until(ExpectedConditions.visibilityOf(search));
		search.click();
		
		
		}

	
	@FindBy(xpath="//div[contains(@id,'-origin-display-inner')]")
	WebElement origin;
	
	
	@FindBy(xpath="//div[contains(@id,'-destination-display-inner')]")
	WebElement destination;
	
	public void validate() throws Exception {
		
		Thread.sleep(3000);
		String text=origin.getText();
		Assert.assertEquals(text, "San Francisco (SFO)");
		if(text.equalsIgnoreCase("San Francisco (SFO)")) {
			System.out.println("passed");
		}
		
		
		String dest=destination.getText();
		Assert.assertEquals(dest, "Anywhere");
		if(dest.equalsIgnoreCase("Anywhere")) {
			System.out.println("passed");
		}
		
		
	}

}
