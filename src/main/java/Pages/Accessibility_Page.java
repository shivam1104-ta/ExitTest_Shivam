package Pages;

import org.openqa.selenium.By;


import Base_Package.Parent;


// Check the Accessibility Page and its feature

public class Accessibility_Page extends Parent{
	
	public String i1;
	public void Assescibility() throws InterruptedException {

		
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]\r\n"
				+ "")).click();
		Thread.sleep(2000);
		
	}
	public void CustomView() throws InterruptedException
	{ 
		i1 = wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[3]")).getText();
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[3]")).click();
		Thread.sleep(2000);
		wd.navigate().back();
		wd.navigate().back();
		Thread.sleep(2000);
	}
}
