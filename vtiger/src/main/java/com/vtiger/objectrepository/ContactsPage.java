package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage 
{
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement cretatecontacticon;
	
	@FindBy(xpath = "(//input[@value='Delete'])[1]")
	private WebElement deletebutton;
	
	public ContactsPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCretatecontacticon() 
	{
		return cretatecontacticon;
	}

	public WebElement getDeletebutton() 
	{
		return deletebutton;
	}
	
}
