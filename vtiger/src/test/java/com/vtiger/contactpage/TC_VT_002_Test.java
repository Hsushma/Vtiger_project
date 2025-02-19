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
import com.vtiger.objectrepository.CreateContactPage;
import com.vtiger.objectrepository.HomePage;

@Listeners(ListnerUtility.class)

public class TC_VT_002_Test extends BaseClass
{
	@Test
	public void createContact() throws EncryptedDocumentException, IOException
	{
		hp = new HomePage(driver);
		hp.getContactLink().click();
		
		ContactsPage cp = new ContactsPage(driver);
		cp.getCretatecontacticon().click();
		
		CreateContactPage ccp = new CreateContactPage(driver);
		ccp.getFirstnameTextfield().sendKeys(eUtil.getStringDataFromExcel("createcontact", 1, 0));
		ccp.getLastnametextField().sendKeys(eUtil.getStringDataFromExcel("createcontact", 1, 1));
		ccp.getEmailtextField().sendKeys(eUtil.getStringDataFromExcel("createcontact", 1, 2));
		
		/**ccp.getBirthdatecalender().click();
		while(true) 
		{
			try {
				driver.findElement(By.xpath("//td[text()='June, 2025']/../../..//td[text()='13']")).click();
				break;
				
			} catch (Exception e) 
			{
//				wUtil.mousehover(driver.findElement(By.xpath("(//td[text()='›'])[3]")));
				driver.findElement(By.xpath("(//td[text()='›'])[3]")).click();
			}
		}**/
		wUtil.selectDropdownByVisibletext(ccp.getLeadSourceDropdown(), eUtil.getStringDataFromExcel("createcontact", 1, 4));
		ccp.getSavebtn().click();
		
		String actText=ccp.getLastnamefield().getText();
		String extText = eUtil.getStringDataFromExcel("createcontact", 1, 1);
		
		Assert.assertEquals(actText, extText,"contact with the last name is not created");
		test.log(Status.PASS, "contact with latsname is created");
		
		
		
	}
	

}
