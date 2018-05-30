package appTestScenarios;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appWebPages.LoginPage;
import commonLib.BaseTest;
import utility.ConstantVariables;

public class LoginFeature {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		driver = new FirefoxDriver();
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
	
	@Test(description="validate login with valid credentials")
	public void test1()
	{
	LoginPage loginpage = new LoginPage(driver);
	String result=loginpage.validLogin(ConstantVariables.username, ConstantVariables.password, ConstantVariables.Landingpagetitle);
	Assert.assertTrue(result.contains(ConstantVariables.Landingpagetitle),"fail to login");
	}
	
	@Test(description="validate login with Invalid credentials")
	public void test2()
	{
	LoginPage loginpage = new LoginPage(driver);
	String result=loginpage.inValidLogin(ConstantVariables.wrongusername, ConstantVariables.wrongpassword);
	Assert.assertTrue(result.contains("Please try again"),"error in page");
	}

}
