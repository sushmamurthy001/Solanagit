package locatorFactory;

import org.openqa.selenium.By;

public class LocatorRepository {
	public	By headerinfo = By.id("headerContainer");
	public	By username=By.id("username");
	public	By password=By.name("pwd");
	public	By checkbox=By.cssSelector("input[id='keepLoggedInCheckBox']");
	public	By loginbtn=By.xpath(".//*[@id='loginButton']");
	public	By errormsg=By.xpath(".//*[@id='ErrorsTable']/tbody/tr/td[2]/table/tbody/tr/td");
	public By loggout = By.id("logoutLink");
	
	// home page locators
	//public By tasklink=By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[3]/a");
	public By tasklink=By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[3]/a");
	public By timetracklink=By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[2]/a");
	public By reportlink=By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[4]/a");
	public By userlink=By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/a");
	
	// time track page locators
	//public By dropdownLink=By.xpath(".//*[@id='enterTTMainContent']/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td[3]/table/tbody/tr/td[2]/div/span");
	public By dropdownLink=By.xpath(".//*[@id='enterTTMainContent']/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td[3]/table/tbody/tr/td[2]");
	public By dropdownItems=By.cssSelector(".userName");
	
	

	public By calenderLink = By.xpath(".//*[@id='ext-gen23']");
	public By monthlabel=By.cssSelector(".x-date-middle");
	public By previousbtn=By.xpath("//a[@title='Previous Month (Control+Left)']");	
	public By calenderTable=By.xpath("//li/div[1]/table[starts-with(@id,'ext-gen')]");
		
	public By addrecentTask = By.xpath(".//*[@id='recentTasksControl']/tbody/tr/td/div[1]/span[1]");
	public By recenttaskitems=By.cssSelector(".taskName>span>span");
	public By savebtn=By.id("SubmitTTButton");
	public By msg = By.xpath(".//*[@id='SuccessMessages']/tbody/tr/td/span");
}

