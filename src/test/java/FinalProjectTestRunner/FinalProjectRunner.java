package FinalProjectTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import FinalProjectUtility.FinalProject2Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/FinalProjectFolder"},
plugin = {"json:target/cucumber.json"},
glue = "FinalProjectStepDefinition")//tags = {"@Sanity"})

public class FinalProjectRunner extends AbstractTestNGCucumberTests {
	@BeforeTest
	public void FinalProject2OpenURL () {
		FinalProject2Base test = new FinalProject2Base ();
		test.FinalProject2Browser();
		
	}
	@AfterTest
	public void FinalProject2CloseURL () {
		FinalProject2Base test = new FinalProject2Base ();
		test.driver.quit();
		
	}
	

}
