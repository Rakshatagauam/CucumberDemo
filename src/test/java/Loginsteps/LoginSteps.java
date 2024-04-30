package Loginsteps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {


		WebDriver driver;
		@Given("user is on nocommerce login page")
		public void user_is_on_nocommerce_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			driver= new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		}

		@When("user enter \\(username: {string}, password: {string})")
		public void user_enter_username_password(String username, String password) {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		}

		@When("user click on login button")
		public void user_click_on_login_button() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		}

		@Then("user to be directed to Myaccount page")
		public void user_to_be_directed_to_myaccount_page() {
		    // Write code here that turns the phrase above into concrete actions
			boolean status=driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
			Assert.assertEquals(status, true);
		}

		@Then("user should see welcome message")
		public void user_should_see_welcome_message() {
		    // Write code here that turns the phrase above into concrete actions
			boolean welcom=driver.findElement(By.xpath("//h2[normalize-space()='Welcome to our store']")).isDisplayed();
			Assert.assertEquals(welcom, true);
			driver.quit();
		}



	}

	

