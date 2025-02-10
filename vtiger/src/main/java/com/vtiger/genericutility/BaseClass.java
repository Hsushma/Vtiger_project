package com.vtiger.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.vtiger.genericutility.WebDriverUtility;
import com.vtiger.genericutility.*;

import com.vtiger.objectrepository.HomePage;
import com.vtiger.objectrepository.LoginPage;

public class BaseClass 
{
	public static ExtentReports extReport;
	public static WebDriver driver;
	public static ExtentTest test;
	
	public JavaUtility jUtil = new JavaUtility();
	public FileUtility fUtil = new FileUtility();
	public ExcelUtility eUtil = new ExcelUtility();
	public static WebDriverUtility wUtil;
	
	public LoginPage lp;
	public HomePage hp;
	
	
	@BeforeSuite
	public void configReport()
	{
		ExtentSparkReporter spr = new ExtentSparkReporter("./HTML_Reports/"+jUtil.getSystemdateTime()+".html");
		extReport= new ExtentReports();
		extReport.attachReporter(spr);
	}
	@Parameters("Browser")
	@BeforeClass
	public void openBrowser(@Optional("chrome") String browserName) throws IOException
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		wUtil=new WebDriverUtility(driver);
		wUtil.implicitWait();
		
		driver.get(fUtil.getDataFromProperty("url"));
		
	}
	@BeforeMethod
	public void login() throws IOException
	{
		lp = new LoginPage(driver);//initialization
		lp.getUsername_textfield().sendKeys(fUtil.getDataFromProperty("username"));
		lp.getUserpasswordTextfield().sendKeys(fUtil.getDataFromProperty("password"));
		lp.getLoginButton().click();
	}
	@AfterMethod
	public void logout()
	{
		hp = new HomePage(driver);
		wUtil.mousehover(hp.getProfileicon());
		hp.getSignoutlink().click();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	@AfterSuite
	public void reportBackup()
	{
		extReport.flush();
	}


}
