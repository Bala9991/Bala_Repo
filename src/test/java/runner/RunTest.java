package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/java/features/DeleteLead.feature",glue= {"steps","pages"},monochrome=true,plugin = { "pretty", "html:target/cucumber-reports" ,"rerun:target/rerun.txt"})
	
	public class RunTest {
}
