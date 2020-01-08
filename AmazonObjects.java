
package com.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonObjects {

	public AmazonObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	public WebElement obj_search;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement obj_clk;
	
	@FindBy(xpath = "//span[@class='a-price-whole']")
	public WebElement obj_price;
	
}
