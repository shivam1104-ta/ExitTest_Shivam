package Pages;

import org.openqa.selenium.By;




//Check the App Page and its feature

public class App_Page extends Animation_Page {
	
	public void App() throws InterruptedException
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[3]\r\n"
				+ "")).click();
		Thread.sleep(2000);

	}
	public void ActionBar() throws InterruptedException
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]\r\n"
				+ "")).click();
		Thread.sleep(2000);
	}
	public void DisplayOption() throws InterruptedException
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[6]")).click();
		Thread.sleep(2000);
	}

	public void Suffle_Title() throws InterruptedException {
		wd.findElement(By.id("com.touchboarder.android.api.demos:id/toggle_show_title")).click();
		Thread.sleep(2000);
		wd.navigate().back();
		wd.navigate().back();
		wd.navigate().back();
		Thread.sleep(2000);

	}
}
