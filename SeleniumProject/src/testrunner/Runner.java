package testrunner;

    import org.junit.runner.RunWith;		
	import cucumber.api.CucumberOptions;		
	import cucumber.api.junit.Cucumber;		

	@RunWith(Cucumber.class)				
	@CucumberOptions(features="test.feature",glue={"stepdefinitions"})						
	
	public class Runner {

}
