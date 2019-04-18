package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
import org.testng.Assert;
 
import org.testng.annotations.Test;
 

public class Asserts {
	
	//private static WebDriver driver;
	 
	  @Test
	 
	  public void f() {
		  //public static void main(String[] args) {
	 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\preeti\\Documents\\sel-java\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("http://demo.guru99.com/test/guru99home/");
	 
	      // Here driver will try to find out My Account link on the application
	 
	      WebElement myAccount = driver.findElement(By.xpath("//h2[contains(text(),'A few of our most popular courses')]"));
	 
	      //Test will only continue, if the below statement is true
	      //This is to check whether the link is displayed or not
	 
	      //Assert.assertFalse(myAccount.isDisplayed());
	      //myAccount.click();
	      
	   		
	        if (myAccount.isDisplayed()) {		
	        	Assert.assertTrue(myAccount.isDisplayed());
	            System.out.println("Test Passed");	
	            

	        } else {			
	            System.out.println("Test Failed");					
	        }
	 
	  }

}
