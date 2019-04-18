package stepdefinations;

    //import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
	import org.openqa.selenium.WebDriver;
	//import org.openqa.selenium.chrome.ChromeDriver;
    //import org.openqa.selenium.By;	
     import pages.Loginpage;
     import org.junit.runner.RunWith;
     

	public class Test {
		
		WebDriver driver;
		@RunWith(Cucumber.class)	
		
	public class MyStepDefinitions {

	    @Given("^I want to write a step with precondition$")
	    public void i_want_to_write_a_step_with_precondition() throws Throwable {
	    	
	    	Loginpage login = new Loginpage(driver);
	    	login.i_want_to_write_a_step_with_precondition();
	    	
	  
	    }

	    @When("^I complete action$")
	    public void i_complete_action() throws Throwable {
	        //throw new PendingException();
	    }

	    @Then("^I validate the outcomes$")
	    public void i_validate_the_outcomes() throws Throwable {
	        //throw new PendingException();
	    }

	    @And("^some other precondition$")
	    public void some_other_precondition() throws Throwable {
	        //throw new PendingException();
	    }

	    @And("^some other action$")
	    public void some_other_action() throws Throwable {
	        ///throw new PendingException();
	    }

	    @And("^yet another action$")
	    public void yet_another_action() throws Throwable {
	       // throw new PendingException();
	    }

	    @And("^check more outcomes$")
	    public void check_more_outcomes() throws Throwable {
	       // throw new PendingException();
	    }

	}

}
