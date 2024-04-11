package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import utils.TestContextSetup;

public class iplHomePage {

	public WebDriver driver;
	public String URL1;
	TestContextSetup globalVariable;
	
public iplHomePage(TestContextSetup globalVariable) 
{
		this.globalVariable=globalVariable;
}

	@Given("User is on Google search page")
	public void user_is_on_google_search_page() {

		System.setProperty("webdriver.edge.driver", "C:/Users/vnkt5/Downloads/edgedriver_win64/msedgedriver.exe");
		globalVariable.driver = new EdgeDriver();
		globalVariable.driver.get("https://www.google.com");

	}

	@When("User searched with the ipl in the search box")
	public void user_searched_with_the_ipl_in_the_search_box() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		globalVariable.driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("ipl" + Keys.ENTER);
		// driver.maximize_window();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
		// js.executeScript("window.scrollBy(0,650)", "");

	}

	@When("Click on official website available in the search results and validate lands in home page")
	public void click_on_official_website_available_in_the_search_results_and_validate_lands_in_home_page()
			throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		globalVariable.driver.findElement(By.xpath("//h3[normalize-space()='Indian Premier League Official Website -2024']")).click();
		Thread.sleep(4000);
	}



}
