package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

///import org.openqa.selenium.By;	

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		//this.dri=driver;
		PageFactory.initElements(driver, this); //to initialize page factory elements.
		}
	
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
        //throw new PendingException();
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\preeti\\Documents\\sel-java\\chromedriver_win32\\chromedriver.exe");					
    	
    	driver = new ChromeDriver();					
        driver.manage().window().maximize();			
        driver.get("http://demo.guru99.com/v4");	
    }

}
