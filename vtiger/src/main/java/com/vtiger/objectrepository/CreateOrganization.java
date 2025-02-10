package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganization 
{
	@FindBy(name = "accountname")
	private WebElement organizationnameTextfield;
	
	@FindBy(name = "industry")
	private WebElement industrydropdown;
	
	@FindBy(name = "accounttype")
	private WebElement typedropdown;
	
	//radiobuton
	@FindBy(xpath = "//input[@onclick='toggleAssignType(this.value)'][1]")
	private WebElement assigendto;
	
	@FindBy(name = "button")
	private WebElement savebtn;
	
	public CreateOrganization(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrganizationnameTextfield() 
	{
		return organizationnameTextfield;
	}

	public WebElement getIndustrydropdown()
	{
		return industrydropdown;
	}
	
	public WebElement getAssigendto() 
	{
		return assigendto;
	}

	public WebElement getTypedropdown() 
	{
		return typedropdown;
	}

	public WebElement getSavebtn() 
	{
		return savebtn;
	}
	
}
