package vinodexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\d drive\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/ajax.html");

        // Find the radio button for "No" using its ID and click on it
        Boolean ss= driver.findElement(By.id("yes")).isSelected();
        
        if(ss != true)
        {
        	
        driver.findElement(By.id("yes")).click();
        }
        else
        {
        	System.out.println("Already Selected");
        	
        }

    }


}
