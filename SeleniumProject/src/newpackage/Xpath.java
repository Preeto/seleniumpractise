package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Xpath {
	
	public static void main (String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\preeti\\Documents\\sel-java\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	String baseUrl = "http://demo.guru99.com/test/newtours/";
	driver.get(baseUrl);
	
	driver.findElement(By.linkText("Selenium")).click();
	List<WebElement> jj =driver.findElements(By.xpath("//ul[@class='dropdown-menu']"));
	
	 //java.util.Iterator<WebElement> program = jj.iterator();
	 //while (program.hasNext()) {
	 //String values = program.next().getText();
	//if(!values.equals("null"))
	         for (int i=0; i<=jj.size(); i++)
	         {
	        
	         if(jj.get(i).getText() != null)
	        {
	            System.out.println("Field should display all the Programs defined for the provider " +jj.get(i).getText());
	        }
	        else
	        {
	            System.out.println("Field is not display all the Programs defined for the provider ");
	        }
	         }

	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//WebElement sc = driver.findElement(By.linkText("REGISTER"));
	//(".//*[@contains,'Selenium']"));
	
	
	
    
    
}

