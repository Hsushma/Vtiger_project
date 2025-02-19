package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditContact 
{
	@FindBy(xpath = "(//input[@name='selected_id'])[1]")
	private WebElement singleselect;
	
	@FindBy(xpath = "(//input[@class='crmbutton small edit'])[1]")
	private WebElement massedit;
	
	public EditContact(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getSingleselect() 
	{
		return singleselect;
	}

	public WebElement getMassedit() 
	{
		return massedit;
	}
	
}
