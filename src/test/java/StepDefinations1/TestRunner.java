package StepDefinations1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//FeatureFiles/LoginDemo.feature",glue= {"StepDefinations1"},
		monochrome= true,
				plugin= {"pretty","json:target/JSONReports/report.json"}
		)




public class TestRunner {

	
	
	
}
