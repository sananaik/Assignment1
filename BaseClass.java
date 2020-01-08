
package com.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.page.object.AmazonObjects;
import com.page.object.FlipKartObjects;

public class BaseClass {

public static WebDriver driver = null;
public static FlipKartObjects flpkart = null;
public static AmazonObjects amzn = null;
public static int priceAmzn;
public static int priceFlp;
	
	public static void initialization() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Library\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		amzn = new AmazonObjects(driver);
		flpkart= new FlipKartObjects(driver);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
}
