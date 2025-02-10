package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage 
{
	@FindBy(name = "firstname")
	private WebElement firstnameTextfield;
	
	@FindBy(name = "lastname")
	private WebElement lastnametextField;
	
	@FindBy(xpath="//span[@id='dtlview_Last Name']")
	private WebElement lastnamefield;

	@FindBy(id = "email")
	private WebElement emailtextField;
	
	@FindBy(name = "button")
	private WebElement savebtn;
	
	public CreateContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstnameTextfield() 
	{
		return firstnameTextfield;
	}
	
	public WebElement getLastnametextField() 
	{
		return lastnametextField;
	}

	public WebElement getLastnamefield() 
	{
		return lastnamefield;
	}
	public WebElement getEmailtextField() 
	{
		return emailtextField;
	}

	public WebElement getSavebtn() 
	{
		return savebtn;
	}
	
	
	
}
