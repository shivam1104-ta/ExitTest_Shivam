package Base_Package;



import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

/**
 * 
 * 
 * @author shivamtayal
 *
 */


public class Parent {



   public static AppiumDriver<MobileElement> wd=null;
    public static AppiumDriverLocalService service;
public static Logger loger;
    
/**
 *  Set Up methods
 */

    public void Setup() {
        
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.touchboarder.android.api.demos");
        capabilities.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");
        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("app","C:\\Users\\shivamtayal\\eclipse-workspace\\Shivam_ExitTest\\Applications\\API Demos for Android_1.9.0_Apkpure.apk" );
        capabilities.setCapability("isHeadless", true);
        try {
            wd = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
            wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
	// Permission Method   
    public void Permissions() throws InterruptedException {
		  wd.findElement(By.id("com.touchboarder.android.api.demos:id/buttonDefaultPositive")).click();
		  
		  Thread.sleep(2000);
		}
		public void ApiDemos() throws InterruptedException
		{
			wd.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[2]")).click();
			Thread.sleep(2000);
		}
		public Logger Logger_SetUp()
		{
		 return loger =Logger.getLogger("Shivam_ExitTest");	
		}
		
		// Driver Close
    public void DriverClose()
    {
        wd.quit();
    }


}