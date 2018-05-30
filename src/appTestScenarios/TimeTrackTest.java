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
import appWebPages.TimetrackPage;
import commonLib.BaseTest;
import utility.ConstantVariables;

public class TimeTrackTest {
	WebDriver driver;
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

	@Test(description="Adding Task to User")
	public void test1()
	{
		LoginPage loginpage = new LoginPage(driver);
		String result=loginpage.validLogin(ConstantVariables.username, ConstantVariables.password, ConstantVariables.Landingpagetitle);
		Assert.assertTrue(result.contains(ConstantVariables.Landingpagetitle),"fail to login");
		HomePage homepage = new HomePage(driver);
		homepage.timeTrackTab();
		TimetrackPage timetrack = new TimetrackPage(driver);
		timetrack.selectTimeTrackTask(ConstantVariables.taskusername);
		timetrack.selectDate(ConstantVariables.expMonth, ConstantVariables.expDate);
		timetrack.selectRecentTask(ConstantVariables.taskanme1, ConstantVariables.hrs);
		String msg=timetrack.submit();
		Assert.assertTrue(msg.contains("successfully"),"fail to save task");
		
	}
	
	@Test(description="Adding Task to User")
	public void test2()
	{
		LoginPage loginpage = new LoginPage(driver);
		String result=loginpage.validLogin(ConstantVariables.username, ConstantVariables.password, ConstantVariables.Landingpagetitle);
		Assert.assertTrue(result.contains(ConstantVariables.Landingpagetitle),"fail to login");
		HomePage homepage = new HomePage(driver);
		homepage.timeTrackTab();
		TimetrackPage timetrack = new TimetrackPage(driver);
		timetrack.selectTimeTrackTask(ConstantVariables.taskusername);
		timetrack.selectDate(ConstantVariables.expMonth, ConstantVariables.expDate);
		timetrack.selectRecentTask(ConstantVariables.taskanme2, ConstantVariables.hrs);
		String msg=timetrack.submit();
		Assert.assertTrue(msg.contains("successfully"),"fail to save task");
		
	}
	
	@Test(description="Adding Task to User",enabled=false)
	public void test3()
	{
		LoginPage loginpage = new LoginPage(driver);
		String result=loginpage.validLogin(ConstantVariables.username, ConstantVariables.password, ConstantVariables.Landingpagetitle);
		Assert.assertTrue(result.contains(ConstantVariables.Landingpagetitle),"fail to login");
		HomePage homepage = new HomePage(driver);
		homepage.timeTrackTab();
		TimetrackPage timetrack = new TimetrackPage(driver);
		timetrack.selectTimeTrackTask(ConstantVariables.taskusername);
		timetrack.selectDate(ConstantVariables.expMonth, ConstantVariables.expDate);
		//timetrack.selectRecentTask(ConstantVariables.taskanme3, ConstantVariables.hrs);
		String msg=timetrack.submit();
		Assert.assertTrue(msg.contains("successfully"),"fail to save task");
		
	}

	@Test(description="Adding Task to User")
	public void test4()
	{
		LoginPage loginpage = new LoginPage(driver);
		String result=loginpage.validLogin(ConstantVariables.username, ConstantVariables.password, ConstantVariables.Landingpagetitle);
		Assert.assertTrue(result.contains(ConstantVariables.Landingpagetitle),"fail to login");
		HomePage homepage = new HomePage(driver);
		homepage.timeTrackTab();
		TimetrackPage timetrack = new TimetrackPage(driver);
		timetrack.selectTimeTrackTask(ConstantVariables.taskusername1);
		timetrack.selectDate(ConstantVariables.expMonth, ConstantVariables.expDate);
		timetrack.selectRecentTask(ConstantVariables.taskanme1_1, ConstantVariables.hrs);
		String msg=timetrack.submit();
		Assert.assertTrue(msg.contains("successfully"),"fail to save task");
		
}}
