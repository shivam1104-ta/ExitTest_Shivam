package Pages;

import org.openqa.selenium.By;



//Check the Media Page and its feature


public class Media_Page extends Graphics_Page{
	

	public void Media() throws InterruptedException
	{


		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[7]\r\n"
				+ "")).click();
		Thread.sleep(2000);

	}
	public void VideoView()
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[4]")).click();

	}
	public void ClickScreen() throws InterruptedException
	{
		wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout\r\n"
				+ "")).click();
		Thread.sleep(2000);
	}
	public void ClickPlay() throws InterruptedException
	{
		wd.findElement(By.id("android:id/pause")).click();
		Thread.sleep(8000);
		wd.navigate().back();
		wd.navigate().back();
	}

}
