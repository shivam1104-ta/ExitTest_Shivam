package StepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import Base_Package.Parent;
import Pages.Accessibility_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



//Test the Accessibility Page and its feature
public class Accessibility extends Parent {

	Accessibility_Page obj2;

	Logger logger= Logger_SetUp();
	
	@Given("^User click on Accessiblity$")
	public void user_click_on_Accessiblity() throws Throwable {
		logger.info("----## Click on the Assescibility ##---");
		obj2= new Accessibility_Page();
		   obj2.Assescibility();
	}

	@Then("^click on CustomViewer$")
	public void click_on_CustomViewer() throws Throwable {
		logger.info("----## Click on the Custom Viewer ##---");
		obj2.CustomView();
		Assert.assertTrue(true);
	}
	



}
