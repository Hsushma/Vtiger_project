package com.vtiger.contactpage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.vtiger.genericutility.BaseClass;
import com.vtiger.genericutility.ListnerUtility;
import com.vtiger.objectrepository.ContactsPage;
import com.vtiger.objectrepository.HomePage;

@Listeners(ListnerUtility.class)
public class TC_VT_001_Test extends BaseClass
{
	@Test
	public void clickOnContact() throws EncryptedDocumentException, IOException
	{
		hp=new HomePage(driver);
		hp.getContactLink().click();
		
		String actTitle = driver.getTitle();
		String extTitle=eUtil.getStringDataFromExcel("createcontact", 1, 3);
		
		Assert.assertEquals(actTitle, extTitle,"contact page is not displayed");
		test.log(Status.PASS, "conatct page is displayed");
		
		cp=new ContactsPage(driver);
		cp.getDeletebutton().click();
		
		
	}

}
