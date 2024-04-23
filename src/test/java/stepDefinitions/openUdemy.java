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
import pageObjects.OpenUdemy;

import org.openqa.selenium.support.ui.Select;

public class openUdemy {

	TestContextSetup globalVariable;
	public IplHomePage iplhomepage;
	public OpenUdemy openudemy;

	public openUdemy(TestContextSetup globalVariable) {
		this.globalVariable = globalVariable;
	}

	@Given("User open the Udemy home page")
	public void user_open_the_udemy_home_page() throws InterruptedException {
		Thread.sleep(3000);
	}

	@When("When user is on the home page")
	public void when_user_is_on_the_home_page() {

		IplHomePage iplhomepage = globalVariable.pabeObjectManager.getIplHomePage();
		String udemyURL = iplhomepage.getcurrentUrl();
		System.out.println(udemyURL);

	}

	@When("User selects Search button and search for course")
	public void user_selects_login_button_and_search_for_course() throws InterruptedException {

		OpenUdemy openudemy = globalVariable.pabeObjectManager.openUdemy();
		openudemy.selectSearch();
		//openudemy.selectLoginbutton();
		Thread.sleep(3000);
		
		//openudemy.selectDropdown();
		
		//Select course = new Select(openudemy.selectDropdown());

	}
	
	@When("User selects course and get the fee for that course")
	public void user_selects_course_and_get_the_fee_for_that_course() {
	    // Write code here that turns the phrase above into concrete actions

	}
}
