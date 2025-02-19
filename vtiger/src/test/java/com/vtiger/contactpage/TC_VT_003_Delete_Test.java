package com.vtiger.contactpage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.genericutility.BaseClass;
import com.vtiger.genericutility.ListnerUtility;
import com.vtiger.objectrepository.DeleteContact;
import com.vtiger.objectrepository.HomePage;

@Listeners(ListnerUtility.class)
public class TC_VT_003_Delete_Test extends BaseClass
{
	@Test
	
	public void singleselect()
	{
		hp=new HomePage(driver);
		hp.getContactLink().click();
		
		dc=new DeleteContact(driver);
		dc.getSingleselect().click();
		dc.getDeleteButon().click();
		driver.switchTo().alert().accept();

	}
	/**public void selectAll()
	{
		hp=new HomePage(driver);
		hp.getContactLink().click();
		
		dc=new DeleteContact(driver);
		//sdc.getMassselectcheckbox().click();
		dc.getDeleteButon().click();
		
		driver.switchTo().alert().accept();
	}**/

}
