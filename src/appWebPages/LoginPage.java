package appWebPages;

import org.openqa.selenium.WebDriver;

import commonLib.ReuseableMethods;
import locatorFactory.LocatorRepository;

public class LoginPage {
	public WebDriver driver;
	ReuseableMethods obj;
	LocatorRepository lib;

	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		obj= new ReuseableMethods(driver);
		lib= new LocatorRepository();
	}

	private void setUsername(String data)
	{
		obj.typedata(lib.username, data);
	}

	private void setpassword(String data)
	{
		obj.typedata(lib.password, data);
	}

	private void checkBox()
	{
		if(!obj.checkelementselected(lib.checkbox))
		{
			obj.clickElement(lib.checkbox);
		}
	}

	private void loginbutton()
	{
		if(obj.checkelementenabled(lib.loginbtn))
		{
			obj.clickElement(lib.loginbtn);
		}
	}

	public String validLogin(String username, String password, String title)
	{
		if(obj.verifyPageLoad(lib.headerinfo))
		{
			setUsername(username);
			setpassword(password);
			checkBox();
			loginbutton();	
			obj.explicitWaitTitle(title);
		}
		return obj.getPagetitle();		
	}
	
	public String inValidLogin(String username, String password)
	{
		if(obj.verifyPageLoad(lib.headerinfo))
		{
			setUsername(username);
			setpassword(password);
			checkBox();
			loginbutton();
			obj.explicitWaitLocator(lib.errormsg);
			
		}
		return obj.getTextElement(lib.errormsg);
	}



}
