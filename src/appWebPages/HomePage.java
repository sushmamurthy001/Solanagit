package appWebPages;

import org.openqa.selenium.WebDriver;

import commonLib.ReuseableMethods;
import locatorFactory.LocatorRepository;

public class HomePage {


	WebDriver driver;
	ReuseableMethods obj;
	LocatorRepository lib;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		obj= new ReuseableMethods(driver);
		lib= new LocatorRepository();
	}
	
	
	public void timeTrackTab()
	{
		if(!obj.getPagetitle().contains("Enter"))
		{
			obj.clickElement(lib.timetracklink);
		}
	}
	
	public void taskTab()
	{
		if(!obj.getPagetitle().contains("Open"))
		{
			obj.clickElement(lib.tasklink);
		}
	}
	
	
	public void reportstab()
	{
		if(!obj.getPagetitle().contains("Reports"))
		{
			obj.clickElement(lib.reportlink);
		}
	}
	
	
	public void usertab()
	{
		if(!obj.getPagetitle().contains("User"))
		{
			obj.clickElement(lib.userlink);
		}
	}
	
	public void logout()
	{
		if(!obj.getPagetitle().contains("Login"))
		{
			obj.clickElement(lib.loggout);
		}
		obj.explicitWaitTitle("Login");
	}

}
