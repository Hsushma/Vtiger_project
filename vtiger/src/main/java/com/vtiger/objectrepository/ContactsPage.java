package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage 
{
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement cretatecontacticon;
	
	public ContactsPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCretatecontacticon() 
	{
		return cretatecontacticon;
	}	
}
