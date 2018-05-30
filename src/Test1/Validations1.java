package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validations1 {
	By headerfield = By.id("headerContainer");
	//By loginbtn = By.partialLinkText("Login ");
	By loginbtn = By.id("loginButton");
	By checkbox = By.id("keepLoggedInCheckBox");

	public WebDriver driver;	
	public String baseUrl="http://localhost:8080/login.do";

	 @BeforeMethod(description="launch browser + pass url")
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}

	@Test(description="validate to verify Element is displayed/visible",enabled=true)
	public void Test1()
	{
		boolean flag=driver.findElement(headerfield).isDisplayed();
		//Assert.assertTrue(condition);
		Assert.assertTrue(flag,"element not displayed / found");
	}	

	@Test(description="validate to verify Element is enabled", enabled=true)
	public void Test2()
	{
		boolean flag=driver.findElement(loginbtn).isEnabled();
		Assert.assertTrue(flag,"element not enabled / found");
	}

	@Test(description="validate to verify Element is selected",enabled=true)
	public void Test3()
	{
		boolean flag=driver.findElement(checkbox).isSelected();
		if(!flag==true)
		{
			driver.findElement(checkbox).click();
			flag=driver.findElement(checkbox).isSelected();
		}
		Assert.assertTrue(flag,"element not selected");
	}

	@AfterMethod(description="exit the browser")
	public void tearDown() throws Exception
	{
		Thread.sleep(5000);		
		driver.quit();
	}


}
