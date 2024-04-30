package StepsForbackground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundDemoStep {

	WebDriver driver;
	@Given("username is logged in")
    public void userIsLoggedIn(String username) {
        
        driver = new ChromeDriver();
   
    }

    @When("user clicks on welcome link")
    public void userClicksOnWelcomeLink() {
      
    }

    @Then("logout link is displayed")
    public void logoutLinkIsDisplayed() {
      
}
    
    @Given("username is also logged in")
    public void userIsAlsoLoggedIn(String username) {
        // Assuming ChromeDriver is used and its path is set properly
        
    }

    @When("user clicks on dashboard link")
    public void userClicksOnDashboardLink() {
    }

    @Then("quick launch toolbar is displayed")
    public void quickLaunchToolbarIsDisplayed() {
       
    }
}