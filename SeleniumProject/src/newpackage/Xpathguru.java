package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class Xpathguru {
	public static void main (String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\preeti\\Documents\\sel-java\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	String baseUrl = "http://demo.guru99.com/test/guru99home/";
	driver.get(baseUrl);
	//List <WebElement> dateBox = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));

	// <WebElement> dateBox = driver.findElements(By.xpath("//div[.//a[text()='SELENIUM']]/ancestor::div[@class='rt-grid-2 rt-omega']/following-sibling::div"));
	
	List <WebElement> dateBox = driver.findElements(By.xpath("//ancestor::div[@class='rt-grid-2 rt-omega']/following-sibling::div"));

    //Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
    for (WebElement webElement : dateBox) {
        System.out.println(webElement.getText());
    }     

    driver.close();

}
}
