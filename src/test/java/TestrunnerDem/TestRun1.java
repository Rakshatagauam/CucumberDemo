package TestrunnerDem;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Feature/LoginDemo/Nocommerence.feature"},
             glue= "Loginsteps"
             
		)
public class TestRun1 {

}
