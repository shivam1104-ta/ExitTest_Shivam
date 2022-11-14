package StepDefinitions;


import org.apache.log4j.Logger;
import org.testng.Assert;

import Base_Package.Parent;
import Pages.Animation_Page;
import Utilities.ScreenShot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



//Test the Animation Page and its feature
public class Animation extends Parent {
	Animation_Page obj3;
	ScreenShot Obj = new ScreenShot();
	Logger logger= Logger_SetUp();
	@Given("^User click on Animation$")
	public void user_click_on_Animation() throws Throwable {
		logger.info("----## Click on the Animation ##---");
	    obj3=new Animation_Page();
	    obj3.Animation();
	}

	@Given("^click on CustomEvaluator$")
	public void click_on_CustomEvaluator() throws Throwable {
		logger.info("----## Click on the CustomEvaluator  ##---");
	    obj3.CustomEvaluator();
	}

	@Then("^click on the CheckCustom$")
	public void click_on_the_CheckCustom() throws Throwable {
		logger.info("----## Click on the CheckCustom  ##---");
    
    String i = wd.findElementById("com.touchboarder.android.api.demos:id/startButton").getText();
    obj3.CheckCustom();

  	System.out.println(i);
  	if(i.equals("NOPLAY"))
  	{
  		Assert.assertTrue(true);
  	}
  	else
  	{
  		Obj.takeScreenShot(wd,"Animation");
  		Assert.assertTrue(false);
  		
  	}
	}

}
