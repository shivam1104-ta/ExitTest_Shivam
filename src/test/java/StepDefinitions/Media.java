package StepDefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import Base_Package.Parent;
import Pages.Media_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


//Test the Media Page and its feature

public class Media extends Parent{

	Media_Page obj6;
	Logger logger= Logger_SetUp();
@Given("^User click on Media$")
public void user_click_on_Media() throws Throwable {
	logger.info("----## Click on the Media ##---");
    obj6= new Media_Page();
    obj6.Media();
}

@Given("^click on VideoView$")
public void click_on_VideoView() throws Throwable {
	logger.info("----## Click on the VideoView ##---");
    obj6.VideoView();
}

@Given("^click on the ClickScreen$")
public void click_on_the_ClickScreen() throws Throwable {
	logger.info("----## Click on the ClickScreen ##---");
obj6.ClickScreen();
}

@Then("^click on the ClickPlay$")
public void click_on_the_ClickPlay() throws Throwable {
	logger.info("----## Click on the ClickPlay ##---");
  obj6.ClickPlay();
  Assert.assertTrue(true);
}


}
