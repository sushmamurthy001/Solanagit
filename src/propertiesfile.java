import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class propertiesfile {

	
	public WebDriver driver;	
	public String baseUrl="http://localhost:8080/login.do";
	@Test (description = "propertiesfile")
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		File file = new File("C:\\ForSeleniumTraining\\Project1\\forproperties.properties");
		  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		WebDriver driver = new FirefoxDriver();

		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys(prop.getProperty("pwd"));
		driver.findElement(By.id("loginButton")).click();
		
	}
}
