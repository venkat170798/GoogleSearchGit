package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WindowType;

import io.cucumber.java.en.Then;
import pageObjects.IplHomePage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class selectOnFanPoll {
	
	TestContextSetup globalVariable;
	PageObjectManager pageObjectManager;
	public IplHomePage iplhomepage;
	
	
public selectOnFanPoll(TestContextSetup globalVariable) 
{
		this.globalVariable=globalVariable;
}
	
	@Then("Select on fan poll page")
	public void select_on_fan_poll_page() throws IOException {
		// Write code here that turns the phrase above into concrete actions

		//globalVariable.driver.findElement(By.xpath("//img[@src=\"https://www.iplt20.com/assets/images/fan-poll.svg\"]")).click();
		IplHomePage iplhomepage = globalVariable.pabeObjectManager.getIplHomePage();
		iplhomepage.select_fan_poll();
	//	String URL1 = globalVariable.driver.getCurrentUrl();
		String URL1 = iplhomepage.getcurrentUrl();
		System.out.println(URL1);

		//globalVariable.driver.switchTo().newWindow(WindowType.TAB);
		globalVariable.genericUtils.openNewTab();
		//globalVariable.driver.get("https://www.apple.com/in/");
		//globalVariable.testBase.secondURL();
		iplhomepage.hitURL(globalVariable.testBase.secondURL());
		String URL2 = iplhomepage.getcurrentUrl();
		System.out.println(URL2);
		if(URL1 == URL2)
		{
			System.out.println("Test case failed");
		}
		else
		{
			System.out.println("Test case passed");
		}
		}

}
