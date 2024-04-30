package StepDefinations1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps1 {
	
	

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside step user is on login page");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    System.out.println("Inside step- user enter username and password");
	}

	@When("click on login button")
	public void click_on_login_button() {
		 System.out.println("Inside step- user click on login page");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside step- user is navigated to homepage");
	}

	

}
