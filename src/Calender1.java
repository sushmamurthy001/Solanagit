import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calender1 {
	By headerfield = By.id("headerContainer");
	By loginbtn = By.id("loginButton");
	By checkbox = By.id("keepLoggedInCheckBox");
	By usernamefield = By.id("username");
	By passwordfield = By.name("pwd");
	By errormsg = By.xpath(".//*[@id='ErrorsTable']/tbody/tr/td[2]/table/tbody/tr/td/span");
	By logoutlink = By.id("logoutLink");
	By calenderbtn = By.xpath(".//*[@id='ext-gen23']");
	By monthlabel = By.xpath("//table[@id='ext-comp-1005']/tbody/tr[1]/td[2]");
	By nextbutn= By.xpath("//a[@title='Next Month (Control+Right)']");
	By tablecalender= By.xpath("//table[starts-with(@id,'ext-gen')]");
	
	String emonth="April 2018";
	String edate="28";
	public WebDriver driver;	
	public String baseUrl="http://localhost:8080/login.do";
	WebDriverWait wait ;

	@BeforeMethod(description="launch browser + pass url")
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(description="calender popup")
	public void test1() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(usernamefield).sendKeys("admin");
		driver.findElement(passwordfield).sendKeys("manager");
		if(!driver.findElement(checkbox).isSelected())
		{
			driver.findElement(checkbox).click();
		}
		driver.findElement(loginbtn).click();
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(logoutlink));
		WebElement ele=driver.findElement(logoutlink);
		wait.until(ExpectedConditions.visibilityOf(ele));
		Assert.assertTrue(driver.getTitle().contains("Enter Time"),"fail to login");
		selectMonth(emonth,edate);
	}

	private void selectMonth(String month,String date) throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(calenderbtn).click();
		System.out.println("label " +driver.findElement(monthlabel).getText());
		for(int i=0; i<25;i++)
		{
			if(!driver.findElement(monthlabel).getText().equals(month))
			{
				driver.findElement(nextbutn).click();
			}
			else {break;}			
		}
		WebElement tbl= driver.findElement(tablecalender);
		
		List<WebElement> rows= tbl.findElements(By.tagName("tr"));
		System.out.println("row count " + rows.size());
		for(int i=0; i<rows.size(); i++)
		{
			List<WebElement> column=rows.get(i).findElements(By.tagName("td"));
			System.out.println("column count " + column.size());
			for(int j=0;j<column.size();j++)
			{
				System.out.println(column.get(j).getText());
				if (column.get(j).getText().equals(date))
				{
					column.get(j).click(); break;
				}
			}
		}
		

	}


	//@AfterMethod(description="exit the browser")
	public void tearDown() throws Exception
	{
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
