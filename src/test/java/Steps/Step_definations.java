package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_definations {

	 ChromeDriver driver;
	
	@Given("I click on ebay page")
	public void i_click_on_ebay_page() {
	   
	     driver= new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	}

	@When("I click on advance link")
	public void i_click_on_advance_link() {
	    
		
	  driver.findElement(By.linkText("Advanced")).click();
	}

	@Then("I navigate to advance search page")
	public void i_navigate_to_advance_search_page() {
	    
	boolean finditem=	driver.findElement(By.xpath("//div[@class='adv-form__title large-section-title']")).isDisplayed();
	Assert.assertEquals(finditem, true);
	
	}
	@When("I search for {string}")
	public void i_search_for_iphone(String str) throws InterruptedException {
	    
		driver.findElement(By.id("gh-ac")).sendKeys(str);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		Thread.sleep(1000);
	}

	@When("I search for Iphone {int}")
	public void i_search_for_iphone(Integer int1) {
	  String itemcount= driver.findElement(By.cssSelector("//h1[@class='srp-controls__count-heading']span.BOLD:first-child")).getText().trim();
	  String itemcount2= itemcount.replace(",", "");
	  int itemcountInt= Integer.parseInt(itemcount2);
	  if(itemcountInt<=int1)
	  Assert.assertEquals(itemcountInt, true);
	}
	
}



