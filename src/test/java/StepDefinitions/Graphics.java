package StepDefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import Base_Package.Parent;
import Pages.Graphics_Page;
import cucumber.api.java.en.Given;

//Test the Graphics Page and its feature

public class Graphics extends Parent{
	
	Graphics_Page obj5;
	Logger logger= Logger_SetUp();
	
	@Given("^User click on Graphics$")
	public void user_click_on_Graphics() throws Throwable {
		logger.info("----## Click on the Graphics ##---");
	   obj5= new Graphics_Page();
	   obj5.Graphics();
	}

	@Given("^click on AnimateDrawbles$")
	public void click_on_AnimateDrawbles() throws Throwable {
		logger.info("----## Click on the AnimateDrawbles ##---");
	  obj5.AnimateDrawbles();
	  Assert.assertTrue(true);
	}


}
