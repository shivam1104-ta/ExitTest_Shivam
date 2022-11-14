package Pages;

import org.openqa.selenium.By;



//Check the Graphics Page and its feature

public class Graphics_Page extends App_Page {

	public void  Graphics() throws InterruptedException
	{

		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[5]\r\n"
				+ "")).click();
		Thread.sleep(2000);
		
	}
	public void AnimateDrawbles() throws InterruptedException
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]")).click();
		Thread.sleep(2000);
		wd.navigate().back();
		wd.navigate().back();
		Thread.sleep(2000);
	}
}
