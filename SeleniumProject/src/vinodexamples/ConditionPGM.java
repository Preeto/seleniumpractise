package vinodexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionPGM {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\d drive\\Drivers\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
    	
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		WebElement el = driver.findElement(By.name("userName"));
				if(el.isEnabled())
				{
					el.sendKeys("Vinod");
				}
		do
		{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		while (driver.findElement(By.name("password")).isDisplayed());
	}
}


