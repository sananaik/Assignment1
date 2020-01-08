
package com.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmzonDemo extends BaseClass{

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void takeiPhonePricefromAmzn()
	{
		//Assert.assertEquals(false, true); // its get failed
		
		try {
			Object driver = null;
			((WebDriver) driver).navigate().to("https://www.amazon.in/");
			((WebDriver) driver).manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			amzn.obj_search.sendKeys("iPhone XR (64GB) - Yellow"); 
			amzn.obj_clk.click();
			((WebDriver) driver).manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println(amzn.obj_price.getText());
			int priceAmzn = Integer.parseInt(amzn.obj_price.getText());
			System.out.println(priceAmzn);			

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void takeiPhonePricefromFlpkrt()
	{
		try {
			driver.navigate().to("https://www.flipkart.com/");
			flpkart.obj_flp_search.sendKeys("iPhone XR (64GB) - Yellow");
			flpkart.obj_flp_clk_search.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println(flpkart.obj_flp_price.getText());
			int priceFlp = Integer.parseInt(flpkart.obj_flp_price.getText());
			System.out.println(priceFlp);
			
			if(priceFlp>priceAmzn)
			{
				System.out.println("FlipKart iPhone price is greater "+priceFlp);
			}else
			{
				System.out.println("Amozon iPhone price is greater "+priceAmzn);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	
}
