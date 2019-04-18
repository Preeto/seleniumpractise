package vinodexamples;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class testnew {
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
    	
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://demoqa.com/frames-and-windows/");
		//driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		//driver.close();
	}
}