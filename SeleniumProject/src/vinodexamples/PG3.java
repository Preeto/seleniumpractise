package vinodexamples;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class PG3 {
	    public static void main(String[] args) {
	    	//System.setProperty("webdriver.chrome.driver","C:\\d drive\\Drivers\\chromedriver.exe");
	     	//WebDriver driver = new ChromeDriver();    
	     	
	     	System.setProperty("webdriver.ie.driver","C:\\d drive\\Drivers\\IEDriverServer.exe");
	     	DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
	     	caps.setCapability("ignoreZoomSetting", true);
	     //	WebDriver ieDriver = new InternetExplorerDriver(caps);
	     	@SuppressWarnings("deprecation")
			WebDriver driver = new InternetExplorerDriver(caps); 
	     	
	     	
	     	driver.get("http://www.popuptest.com/popuptest2.html");
	       // driver.quit();  // using QUIT all windows will close
	        
	        
	        
	     //   driver.manage().window().maximize();
	      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        
	        
	     //   WebDriverWait mywait =new WebDriverWait(driver, 10);
	        
	        //mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).getAttribute(arg0)
	        
	    }
	}

