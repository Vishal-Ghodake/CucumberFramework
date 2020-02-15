package runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/functionalTests",
 glue= {"stepDefinations"},
 plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml"},
 monochrome = true
 )
public class TestRunner{
	
}