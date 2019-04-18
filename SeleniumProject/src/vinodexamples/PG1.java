package vinodexamples;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


//comment the above line and uncomment below line to use Chrome


public class PG1 {

	 static WebDriver driver;
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	
    	//System.setProperty("webdriver.gecko.driver","C:\\d drive\\Drivers\\geckodriver.exe");
		
      	//WebDriver driver = new FirefoxDriver();
		
    	
    	//comment the above 2 lines and uncomment below 2 lines to use Chrome
		
      // System.setProperty("webdriver.chrome.driver","C:\\d drive\\Drivers\\chromedriver.exe");
     //	WebDriver driver = new ChromeDriver();
    	
    	  System.setProperty("webdriver.ie.driver","C:\\d drive\\Drivers\\IEDriverServer.exe");

    	 //  driver = new InternetExplorerDriver();
    	  DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
    	  caps.setCapability("ignoreZoomSetting", true);
    	  driver = new InternetExplorerDriver(caps);
    	  driver.manage().window().maximize();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        driver.manage().window().maximize();
        //close Fire fox
        driver.close();
       
        
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Name");
        driver.findElement(By.xpath("//[input[@name='password']")).sendKeys("Pwd");
       // driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
        //driver.findElement(By.xpath("//input[@value='Google Search']")).click();
    }

}