package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization 
{
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createorganizationicon;
	
	public Organization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateorganizationicon() 
	{
		return createorganizationicon;
	}
	
}
