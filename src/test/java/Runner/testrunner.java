package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".//Feature/Ebayhome.feature"},
		//features= {".//Feature"},
		//features= {".//Feature/ebayasearch.feature"},
		glue= {"Steps"},
	//	plugin= {"pretty","html:reports/myreport.html"}
				//plugin= {"pretty","json:reports1"}
				plugin= {"pretty","junit:reports2"},
				dryRun= false,
		monochrome= true,
		tags= "@P2"
		//name= {"logo"}
		
		
	)

public class testrunner {

}
