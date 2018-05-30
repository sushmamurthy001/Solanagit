import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {
public static void main(String args[]) {
	//System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	
	//System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.edge.driver","drivers//MicrosoftWebDriver.exe");
	WebDriver driver = new EdgeDriver();
	
	driver.get("http://solanatest.com/");
}
}
