package StepDefinations1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoHRM {

	ChromeDriver driver;
	@Given("user open HRM website")
	public void user_open_hrm_website() {
	    
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}	
		@When("user enter valid {string} and {string}")
		public void user_enter_valid_and(String username, String password) {
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
			
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		}

	}

	@Then("enter main page")
	public void enter_main_page() {
		driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
		driver.quit();
		
	}
}
