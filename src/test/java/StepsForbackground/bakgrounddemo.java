package StepsForbackground;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= ".//BackgroundDemo/BackgroundDemo.feature", glue= {"StepsForbackground"},
//dryRun= false,
monochrome= true)
public class bakgrounddemo {

}
