package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Def {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/download/");
	}

}
