package com.vtiger.organizationpage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.vtiger.genericutility.BaseClass;
import com.vtiger.genericutility.ListnerUtility;
import com.vtiger.objectrepository.HomePage;

@Listeners(ListnerUtility.class)
public class TC_VT_001_Test extends BaseClass
{
	@Test
	public void clickonOrganization() throws EncryptedDocumentException, IOException
	{
		hp=new HomePage(driver);
		hp.getOrganizationlink().click();
		
		String actTitle =driver.getTitle(); 
		String extTitle = eUtil.getStringDataFromExcel("organization", 1, 5);
		
		Assert.assertEquals(actTitle, extTitle,"organization page is not displayed");
		test.log(Status.PASS, "organization page is displayed");
		
	}
	

}
