package StepDefinations1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//FeatureFiles/Login1.feature",glue= {"StepDefinations1"},
		monochrome= true
		
		)


public class testrun {

}
