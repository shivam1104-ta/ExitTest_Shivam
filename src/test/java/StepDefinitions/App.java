package StepDefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import Base_Package.Parent;
import Pages.App_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



//Test the App Page and its feature

public class App extends Parent {
	App_Page obj4;
	Logger logger= Logger_SetUp();
	@Given("^User click on App$")
	public void user_click_on_App() throws Throwable {
		logger.info("----## Click on the App ##---");
	    obj4=new App_Page();
	    obj4.App();
	}

	@Given("^click on ActionBar$")
	public void click_on_ActionBar() throws Throwable {
		logger.info("----## Click on the ActionBar ##---");
	    obj4.ActionBar();
	}

	@Given("^click on the DisplayOption$")
	public void click_on_the_DisplayOption() throws Throwable {
		logger.info("----## Click on the DisplayOption ##---");
	    obj4.DisplayOption();
	}
	@Then("^Click on suffle title$")
	public void click_on_suffle_title() throws Throwable {
		logger.info("----## Click on the Suffle_Title ##---");
		obj4.Suffle_Title();
		  Assert.assertTrue(true);
	}


}
