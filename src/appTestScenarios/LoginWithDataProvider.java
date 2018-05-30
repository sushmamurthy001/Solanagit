package appTestScenarios;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import appWebPages.LoginPage;
import commonLib.BaseTest;
import commonLib.ExcelLib;
import utility.ConstantVariables;

public class LoginWithDataProvider {
	WebDriver driver;
	ExcelLib lib;
	@BeforeTest
	public void setup()
	{
		BaseTest basetest = new BaseTest();
		driver=basetest.selectBrowser(ConstantVariables.browsername, ConstantVariables.baseurl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	public void teardown()
	{
		driver.manage().deleteAllCookies();
		driver.close();
	}	

	@Test(dataProvider="loginData",description="validate login with Invalid credentials with DDT")
	public void test1(String username, String password)
	{
		LoginPage loginpage = new LoginPage(driver);		
		String result=loginpage.inValidLogin(username, password);
		Assert.assertTrue(result.contains("Please try again"),"error in page");
	}
	
	@DataProvider(name="loginData")
	public Object[][] data()
	{
		 return new Object[][] { {"first", "sdfkjhf"}, {"second", "sdfdsf"}};
	}
	@DataProvider(name="loginData1")
	public Object[][] data1()
	{
		 return new Object[][] { {"first, sdfkjhf"}, {"second, sdfdsf"}};
	}

}
