package stepDefinitions;

import utils.TestContextSetup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.IplHomePage;

public class openNewTab {
	
	TestContextSetup globalVariable;
	public IplHomePage iplhomepage;
	
public openNewTab(TestContextSetup globalVariable) 
{
		this.globalVariable=globalVariable;
}
	
	@Given("I want to open new tab")
	public void i_want_to_open_new_tab() throws IOException {
		
	/*	globalVariable.driver.switchTo().newWindow(WindowType.TAB);
		globalVariable.driver.get("https://www.apple.com/in/"); 
		String URL2 = globalVariable.driver.getTitle();
		System.out.println(URL2);*/
		
		globalVariable.genericUtils.openNewTab();
		
		iplhomepage.hitURL(globalVariable.testBase.secondURL());
		String URL2 = iplhomepage.getcurrentUrl();
		System.out.println(URL2);
		
	}
	@When("search for Apple and click on the website")
	public void search_for_apple_and_click_on_the_website() {

	}
	@Then("Validate Apple home page is lauched")
	public void validate_apple_home_page_is_lauched() {

	}
	@And("Verify the old and new url is same")
	public void Verify_the_old_and_new_url_is_same() {
		
	}
}
