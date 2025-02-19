package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteContact 
{
	//@FindBy(xpath = "//input[@id='selectCurrentPageRec']")
	//private WebElement massselectcheckbox;
	
	@FindBy(xpath = "(//input[@name='selected_id'])[1]")
	private WebElement singleselect;
	
	@FindBy(xpath="(//input[@value='Delete'])[1]")
	private WebElement deleteButon;
	
	public DeleteContact(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	/**public WebElement getMassselectcheckbox() 
	{
		return massselectcheckbox;
	}**/

	public WebElement getDeleteButon() 
	{
		return deleteButon;
	}

	public WebElement getSingleselect() 
	{
		return singleselect;
	}
	

}
