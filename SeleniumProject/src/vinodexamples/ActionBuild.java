package vinodexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionBuild {
	public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\d drive\\Drivers\\chromedriver.exe");
     	 WebDriver driver = new ChromeDriver();	
     	 String baseUrl = "http://demo.guru99.com/test/newtours/";
     	 driver.manage().window().maximize();
     	 
     	driver.get(baseUrl);  
     	WebElement link_Home = driver.findElement(By.linkText("Insurance Project"));
     	 
	Actions builder =new Actions(driver);
	
	Action mouseOverHome  = builder.moveToElement(link_Home).build();
	mouseOverHome.perform();
	
	WebElement textbox = driver.findElement(By.xpath("//input[@name='userName']"));

    Actions buildnew = new Actions(driver);
    
    Action seriesOfActions = buildnew.moveToElement(textbox).click().keyDown(textbox, Keys.SHIFT).sendKeys(textbox,"hello").keyUp(textbox, Keys.SHIFT).doubleClick(textbox).contextClick().build();
    
    seriesOfActions.perform();	
	}

}
