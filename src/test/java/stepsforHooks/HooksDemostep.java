package stepsforHooks;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemostep {
	
	WebDriver driver= null;
	
	@Before
	public void browsersetup()
	
	{
		System.out.println("i am inside browser setup");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	@After
	public void teardown()
	{
		System.out.println("i am inside teardown");
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public  void beforeSteps()
	{
		System.out.println("i am inside beforesteps");
	}
	
	
	@AfterStep
	public  void AfterSteps()
	{
		System.out.println("i am inside AfterSteps");
	}

	//@Given("user is on login page")
	//public void user_is_on_login_page() {
	//}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	}

	@When("user click on login page")
	public void user_click_on_login_page() {
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	}



}
