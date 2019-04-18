package newpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CountLinks {
	
	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\preeti\\Documents\\sel-java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
          driver.get("https://google.com");
          
          List<WebElement> links = driver.findElements(By.xpath("//a")); //Identify the number of Link on webpage and assign into Webelement List 
          
          int linkCount = links.size();     // Count the total Link list on Web Page
          
          System.out.println("Total Number of link count on webpage = "  + linkCount);   //Print the total count of links on webpage
          
          List<WebElement> allElements = driver.findElements(By.xpath("//*")); //Identify all the elements on web page
          
          int elementsCount = allElements.size();     //Count the total all element on web page
          
          System.out.println("Total Number of All Element on webpage = "  + elementsCount);  //Print the total count of all element on webpage
          
                   
    }


}
