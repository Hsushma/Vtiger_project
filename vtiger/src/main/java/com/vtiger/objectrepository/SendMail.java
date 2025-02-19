package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMail 
{
	@FindBy(xpath = "(//input[@value='Send Mail'])[1]")
	private WebElement sendmailbtn;
	
	@FindBy(xpath = "(//input[@name='selected_id'])[1]")
	private WebElement singleselect;
	
	@FindBy(name="Select")
	private WebElement selectbtn;
	
	@FindBy(id="subject")
	private WebElement subject;
	
	@FindBy(xpath = "(//td[@class='mailSubHeader']/..//input[@value=' Send '])[1]")
	private WebElement sendbutton;
	
	public SendMail (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSendmailbtn() 
	{
		return sendmailbtn;
	}

	public WebElement getSingleselect() 
	{
		return singleselect;
	}

	public WebElement getSelectbtn() 
	{
		return selectbtn;
	}

	public WebElement getSubject() 
	{
		return subject;
	}

	public WebElement getSendbutton() 
	{
		return sendbutton;
	}
	
	
}
