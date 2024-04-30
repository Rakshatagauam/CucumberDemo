package StepDefinations1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMdemo {

	ChromeDriver driver;
	
	@Given("user open website")
	public void user_open_website() {
	    
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("user enter valid \\(Username: {string}, Password: {string})")
	public void user_enter_valid_username_and_password(String username, String password) {
	   
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}

	@When("user click on login")
	public void user_click_on_login() {
	    
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	
	

	@Then("enter homepage")
	public void enter_homepage() {
	   
		driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
		driver.quit();
	}



}
