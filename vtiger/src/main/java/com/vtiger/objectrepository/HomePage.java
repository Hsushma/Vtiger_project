package com.vtiger.objectrepository;

import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(linkText = "Contacts")
	private WebElement contactLink;
	
	@FindBy(linkText="Leads")
	private WebElement leadslink;
	
	@FindBy(linkText = "Products")
	private WebElement productlink;
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationlink;
	
	@FindBy(xpath="//img[contains(@src,'user')]")
	private WebElement profileicon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutlink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getContactLink() 
	{
		return contactLink;
	}
	
	public WebElement getLeadslink() 
	{
		return leadslink;
	}
	
	public WebElement getOrganizationlink() 
	{
		return organizationlink;
	}

	public WebElement getProductlink() 
	{
		return productlink;
	}

	public WebElement getProfileicon() 
	{
		return profileicon;
	}

	public WebElement getSignoutlink() 
	{
		return signoutlink;
	}
	
}
