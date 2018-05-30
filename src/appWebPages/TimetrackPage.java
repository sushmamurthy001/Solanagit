package appWebPages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TimetrackPage extends HomePage{


	public TimetrackPage(WebDriver driver) 
	{
		super(driver);
	}

	public void selectTimeTrackTask(String username)
	{
		obj.dropdown(lib.dropdownLink, lib.dropdownItems, username);
	}

	public void selectDate(String month, String date)
	{
		obj.clickElement(lib.calenderLink);		
		for(int a=0; a<6;a++)
		{
			String label=obj.getTextElement(lib.monthlabel);
			if(!label.contains(month))
			{
				obj.clickElement(lib.previousbtn);
			}
		}	

		int count=0;
		while (count<3)
		{
			try
			{
				Thread.sleep(2000);		
				WebElement table= driver.findElement(lib.calenderTable);
				List<WebElement> list1=table.findElements(By.tagName("tr"));
				for(int i=0; i<list1.size();i++)
				{
					List<WebElement> list2=list1.get(i).findElements(By.tagName("td"));
					for(int j=0; j<list2.size();j++)
					{
						if(list2.get(j).getText().equals(date))
						{
							System.out.println(list2.get(j).getText());
							list2.get(j).click(); 
							count =count+4;
							break;
						}
					}					
				}
			}catch (Exception e) 
			{
				System.out.println("Exception occured in callender");
				count =count+1; continue;			
			}
		}
	}

	public void selectRecentTask(String taskname, String hr)
	{
		obj.dropdown(lib.addrecentTask, lib.recenttaskitems, taskname);
		obj.typeESCbtn();
		int count=0;
		while (count<3)
		{
			try
			{
				Thread.sleep(5000);
				By hrfield = By.xpath("//span[text()='"+taskname+"']/following::input[@class='text inputTT']");
				System.out.println(hrfield);
				List<WebElement> list1 = driver.findElements(hrfield);
				for(int i=0; i<5;i++)
				{
					list1.get(i).clear();
					list1.get(i).sendKeys(hr);
				}
				count=count+4;
			}catch (Exception e) 
			{
				System.out.println("Exception occured in hr field");
				count =count+1; continue;			
			}
		}
	}

	public String submit()
	{
		obj.clickElement(lib.savebtn);
		obj.explicitWaitLocator(lib.savebtn);
		return obj.getTextElement(lib.msg);
	}
}
