package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import io.cucumber.java.en.Then;
import utils.TestContextSetup;

public class selectOnFanPoll {
	
	TestContextSetup globalVariable;
	
public selectOnFanPoll(TestContextSetup globalVariable) 
{
		this.globalVariable=globalVariable;
}
	
	@Then("Select on fan poll page")
	public void select_on_fan_poll_page() {
		// Write code here that turns the phrase above into concrete actions

		globalVariable.driver.findElement(By.xpath("//img[@src=\"https://www.iplt20.com/assets/images/fan-poll.svg\"]")).click();
		String URL1 = globalVariable.driver.getCurrentUrl();
		System.out.println(URL1);

		globalVariable.driver.switchTo().newWindow(WindowType.TAB);
		globalVariable.driver.get("https://www.apple.com/in/");	
	}

}
