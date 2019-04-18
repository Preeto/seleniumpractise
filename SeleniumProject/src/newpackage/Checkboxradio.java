package newpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkboxradio {
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\preeti\\Documents\\sel-java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
		 driver.get("http://toolsqa.com/automation-practice-form");
		 
		 List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
		 
		 boolean bValue; 
		 //= false;
		 
		 // This statement will return True, in case of first Radio button is selected
		 bValue = rdBtn_Sex.get(0).isSelected();
		 
		 // This will check that if the bValue is True means if the first radio button is selected
		 if(bValue == true){
		 // This will select Second radio button, if the first radio button is selected by default
		 rdBtn_Sex.get(1).click();
		 System.out.println("Field should display all the Programs defined for the provider " +rdBtn_Sex.get(1).getText());
		 
		 }else{
		 // If the first radio button is not selected by default, the first will be selected
		 rdBtn_Sex.get(0).click();
		 //System.out.println("Field should display all the Programs defined for the provider " +rdBtn_Sex.get(0).getText());
		 }
		 
		
		 //Step 4: Select the Third radio button for category 'Years of Exp' (Use Id attribute to select Radio button)
		 WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
		 rdBtn_Exp.click();
		 
		 // STep 5: Check the Check Box 'Automation Tester' for category 'Profession'( Use Value attribute to match the selection)
		 // Find the Check Box or radio button element by Name
		 List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
		 
		 // This will tell you the number of Check Boxes are present
		 int iSize = chkBx_Profession.size();
		 
		 // Start the loop from first Check Box to last Check Boxe
		 for(int i=0; i < iSize ; i++ ){
		 // Store the Check Box name to the string variable, using 'Value' attribute
		 String sValue = chkBx_Profession.get(i).getAttribute("value");
		 
		 // Select the Check Box it the value of the Check Box is same what you are looking for
		 if (sValue.equalsIgnoreCase("Automation Tester")){
		 chkBx_Profession.get(i).click();
		 
		 // This will take the execution out of for loop
		 break;
		 }
		 }
		 // Step 6: Check the Check Box 'Selenium IDE' for category 'Automation Tool' (Use cssSelector)
		 WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		 oCheckBox.click();
		 
		 // Kill the browser
		 //driver.quit();
	}
}