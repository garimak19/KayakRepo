package StepDefinition;

import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.Login;

import Utility.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepclass  extends TestBase{

	public Login login;
	
	@Given("^pass url as \"([^\"]*)\"$")
	public void pass_url_as(String arg1) throws Throwable {
	    
		launch(arg1);
		wait=new WebDriverWait(driver, 30);
		
		login=new Login(driver, wait);
	}

	@When("^Click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
		
	    login.Click_Flight();
	  
		
	}
	
	@Then("^pass  Destination Airport \"([^\"]*)\"$")
	public void pass_Destination_Airport(String arg1) throws Throwable {
	    login.enterDestination(arg1);
	}

	
	@Then("^enter deptDate and returnDate$")
	public void enter_deptDate_and_returnDate() throws Throwable {
	    login.enterDates();
	}

	@Then("^click on search$")
	public void click_on_search() throws Throwable {
	    
		login.Click_search();
		
		login.validate();
		Thread.sleep(3000);
		driver.close();
	}


}
