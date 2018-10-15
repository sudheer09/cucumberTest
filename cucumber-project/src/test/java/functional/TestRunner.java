package functional;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/testResults.json", monochrome=true, features = "src/test/java/features/", strict=true)
public class TestRunner {

	
}
