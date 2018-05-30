package commonLib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReuseableMethods {
	

	public WebDriver driver;
	WebDriverWait wait;
	public ReuseableMethods(WebDriver driver)
	{
		this.driver=driver;
		wait = new WebDriverWait(driver,30);
	}

	public void typedata(By locator, String data)
	{
		driver.findElement(locator).sendKeys(data);
	}

	public void clickElement(By locator)
	{
		driver.findElement(locator).click();
	}

	public void clearElement(By locator)
	{
		driver.findElement(locator).clear();
	}

	public String getTextElement(By locator)
	{
		String flag=null;
		if(driver.findElement(locator).isDisplayed())
		{
			return driver.findElement(locator).getText();
		}
		else 
		{
			return flag;	
		}
		
	}

	public String getPagetitle()
	{
		return driver.getTitle();
	}

	public String getPageurl()
	{
		return driver.getCurrentUrl();
	}

	public void explicitWaitLocator(By locator)
	{
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void explicitWaitTitle(String title)
	{
		wait.until(ExpectedConditions.titleContains(title));
	}

	public void explicitWaitText(String text, By locator)
	{
		wait.until(ExpectedConditions.textToBe(locator, text));
	}

	public String dropdown(By locator,By commonlocator,String value)
	{
		explicitWaitLocator(locator);
		driver.findElement(locator).click();
		List<WebElement> list1= driver.findElements(commonlocator);
		for (WebElement var : list1) 
		{
			if(var.getText().contains(value))
			{
				var.click(); break;
			}
		}
		explicitWaitLocator(locator);
		return getTextElement(locator);		
	}

	public boolean checkelementselected(By locator)
	{
		return driver.findElement(locator).isSelected();
	}

	public boolean checkelementdisplyed(By locator)
	{
		return driver.findElement(locator).isDisplayed();
	}

	public boolean checkelementenabled(By locator)
	{
		return driver.findElement(locator).isEnabled();
	}

	public boolean verifyPageLoad(By locator)
	{
		if(checkelementdisplyed(locator))
		{
			System.out.println("Page loadded");
			return true;
		}
		else
		{
			System.out.println("page not loadded");
			return false;
		}		
	}

	public void typeESCbtn()
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ESCAPE).perform();
	}

}
