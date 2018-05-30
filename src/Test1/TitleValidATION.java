package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleValidATION {
	public WebDriver driver;
	
	@Test(description="launch browser + pass url",priority=1)
	public void setUp()

	{

System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
driver = new FirefoxDriver();


driver.get("http://facebook.com");
	}
	
	@Test(description="validate application with Title",priority=2,enabled=true)
	public void Test1()
	{
		String expectedTitle="Facebook - Log In or Sign Up";
		// to get title to of the application
		String actualTitle=driver.getTitle(); 
		System.out.println("title is " + actualTitle);
		// validate result
		Assert.assertEquals(actualTitle,expectedTitle,"fail to load application");
		

	
	


}

	@Test(description="exit the browser",priority=3)
	public void tearDown()
	{
		driver.quit();
	}
	

}
