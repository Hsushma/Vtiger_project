package com.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username_textfield;
	
	@FindBy(name = "user_password")
	private WebElement userpasswordTextfield;
	
	@FindBy(id ="submitButton")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername_textfield() 
	{
		return username_textfield;
	}

	public WebElement getUserpasswordTextfield() 
	{
		return userpasswordTextfield;
	}

	public WebElement getLoginButton() 
	{
		return loginButton;
	}
	
}
