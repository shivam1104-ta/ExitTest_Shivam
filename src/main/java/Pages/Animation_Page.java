package Pages;


import org.openqa.selenium.By;



//Check the Animation Page and its feature




public class Animation_Page extends Accessibility_Page {
	public String i;
	public  void Animation() throws InterruptedException
	{
		

		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]")).click();
		Thread.sleep(2000);
	} 
	
		public void CustomEvaluator() throws InterruptedException
		{
			wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[4]")).click();

			Thread.sleep(2000);	
		}
		public void CheckCustom() throws InterruptedException
		{
			i=wd.findElement(By.id("com.touchboarder.android.api.demos:id/startButton")).getText();
			wd.findElement(By.id("com.touchboarder.android.api.demos:id/startButton")).click();
			
		    


		wd.navigate().back();
		wd.navigate().back();
		Thread.sleep(2000);
		}
	}

