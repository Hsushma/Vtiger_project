package com.vtiger.contactpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.genericutility.BaseClass;
import com.vtiger.genericutility.ListnerUtility;
import com.vtiger.objectrepository.HomePage;
import com.vtiger.objectrepository.SendMail;

@Listeners(ListnerUtility.class)
public class TC_VT_005_Mail_Test extends BaseClass
{
	@Test
	public void sendmail()
	{
		hp=new HomePage(driver);
		hp.getContactLink().click();
		
		sm=new SendMail(driver);
		sm.getSingleselect().click();
		sm.getSendmailbtn().click();
		sm.getSelectbtn().click();
		wUtil.switchtoWindow("Emails&action");
		sm.getSubject().sendKeys("insurance");
		sm.getSendbutton().click();
		driver.switchTo().alert().accept();
		
	}

}
