package com.vtiger.organizationpage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		String extTitle = eUtil.getStringDataFromExcel("organization", 1, 3);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(extTitle));
		
		Assert.assertEquals(actTitle.contains(extTitle),true,"organizatio0 page is not displayed");
		test.log(Status.PASS, "organization page is displayed");
	}
	
	

}
