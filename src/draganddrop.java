import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddrop {

	@Test
	public void main(){
		//actions class then perform method should be used.
		System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demos111.mootools.net/DragDrop");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		/*Actions act=new Actions(driver);
		
		WebElement a=driver.findElement(By.xpath(".//*[@id='draggables']/div[10]"));
		WebElement b=driver.findElement(By.xpath(".//*[@id='droppables']/div[1]"));
		act.dragAndDrop(a, b).perform();*/
		
String s=driver.findElement(By.partialLinkText("DragDrop")).getText();
		System.out.println(s);
	}}
