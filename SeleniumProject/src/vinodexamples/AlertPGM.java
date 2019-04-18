package vinodexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPGM {
	

	    public static void main(String[] args)  {
	    	  System.setProperty("webdriver.gecko.driver","C:\\d drive\\Drivers\\geckodriver.exe");
	    	WebDriver  driver = new FirefoxDriver();	
	        String alertMessage = "";

	        driver.get("http://evryindia360.com");
	     //   driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	        //Enter user name by ctrl-v
	        
	        //create robot for keyboard operations
         /*   Robot rb = new Robot();
            StringSelection username = new StringSelection("username");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);            
            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);
            rb.keyRelease(KeyEvent.VK_V);
            rb.keyRelease(KeyEvent.VK_CONTROL);

            //tab to password entry field
            rb.keyPress(KeyEvent.VK_TAB);
            rb.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(2000);

            //Enter password by ctrl-v
            StringSelection pwd = new StringSelection("password");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);
            rb.keyRelease(KeyEvent.VK_V);
            rb.keyRelease(KeyEvent.VK_CONTROL);

            //press enter
            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);

            //wait
            Thread.sleep(5000);*/
        } 
	     
	       // driver.quit();
	    
        /*WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
        IAlert alert = wait.Until(ExpectedConditions.AlertIsPresent());
        alert.SetAuthenticationCredentials("username", "password")*/

	       
	    }
	


