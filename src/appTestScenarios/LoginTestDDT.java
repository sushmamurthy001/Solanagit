package appTestScenarios;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appWebPages.HomePage;
import appWebPages.LoginPage;
import commonLib.BaseTest;
import commonLib.ExcelLib;
import utility.ConstantVariables;

public class LoginTestDDT {
	WebDriver driver;
	ExcelLib lib;
	@BeforeMethod
	public void setup()
	{
		BaseTest basetest = new BaseTest();
		driver=basetest.selectBrowser(ConstantVariables.browsername, ConstantVariables.baseurl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void teardown()
	{
		driver.manage().deleteAllCookies();
		driver.close();
	}	

	@Test(description="validate login with Invalid credentials with DDT")
	public void test1()
	{
		LoginPage loginpage = new LoginPage(driver);
		lib = new ExcelLib();
		int rc=lib.getRowCount(ConstantVariables.filepath, ConstantVariables.sheetname);
		for(int i=1; i<=rc;i++)
		{
			String username=lib.readexceldata(ConstantVariables.filepath, ConstantVariables.sheetname, i, 0);
			String password=lib.readexceldata(ConstantVariables.filepath, ConstantVariables.sheetname, i, 1);
			try
			{
				String result=loginpage.inValidLogin(username, password);
				Assert.assertTrue(result.contains("Please try again"),"error in page");
			}
			catch (Exception e) 
			{
				HomePage homepage = new HomePage(driver);
				homepage.logout();				
			}
		}

	}

}
