package vinodexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ExampleNoDriver {

	
	@Test
	public void testCase1() {

		System.out.println("This is the Test Case 1");
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://fsstest.servicepower.com/FSS7/LoginUserAction.do");
		
		System.out.println(driver.getTitle());
	}
}
