package StepDefinations1;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	 // features=".//FeatureFiles/OrangeHRM.feature",
		features=".//FeatureFiles/DemoHRM.feature",
			//  features= ".//FeatureFiles/EbayHome.feature",
		
		glue= {"StepDefinations1"},
				//glue= {"Runner"},
		plugin= {"pretty", "junit:Report3"},
		dryRun= false
		)
public class Runnner {

}
