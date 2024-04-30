package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class Ebayadvancedsearch_step {

	WebDriver driver;
	@Given("I am ebay advnace search page")
	public void i_am_ebay_advnace_search_page() {
	
		 driver= new ChromeDriver();
		 driver.get("https://www.ebay.com/sch/ebayadvsearch");
		 
	}

	@When("I click on ebay logo")
	public void i_click_on_ebay_logo() {
	    
		driver.findElement(By.xpath("//a[@id='gh-la']")).click();
	}

	@Then("I am navigated to ebay home page")
	public void i_am_navigated_to_ebay_home_page() {
	   Boolean ebaypa= driver.findElement(By.xpath("//a[normalize-space()='My eBay']")).isDisplayed();
	  Assert.assertEquals(ebaypa, true);
	  driver.quit();
	}
}
