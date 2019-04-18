package vinodexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	
	public static void main(String[] args) {
        // 
    	
		System.setProperty("webdriver.chrome.driver","C:\\d drive\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        String tagName = "";

       
        driver.get(baseUrl);

        //driver.findElement(By.linkText("REGISTER")).click();
        //tagName = driver.findElement(By.name("userName")).getTagName();
        //System.out.println(tagName); 
        
        WebElement myelement = driver.findElement(By.name("userName"));
        myelement.sendKeys("Name");
        WebElement myelement1 = driver.findElement(By.name("password"));
        myelement1.sendKeys("Pwd");
        driver.findElement(By.name("submit")).click();  
        
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        
        //driver.close();
       
    } 


}
