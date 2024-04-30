package Steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= ".//hooksDemo/hooksDemo.feature", 
// glue= {"stepsforHooks"},
//dryRun= false,
monochrome= true)
public class stepsforHooks {

}
