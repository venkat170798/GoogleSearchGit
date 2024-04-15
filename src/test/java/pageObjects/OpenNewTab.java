package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OpenNewTab {
	public WebDriver driver;
	
	public OpenNewTab(WebDriver driver)
	{
		this.driver=driver;
	}

	By search_google = By.xpath("//textarea[@id='APjFqb']");
	By select_ipl_page = By.xpath("//h3[normalize-space()='Indian Premier League Official Website -2024']");
	By select_fan_poll = By.xpath("//img[@src=\"https://www.iplt20.com/assets/images/fan-poll.svg\"]");
	
	public void searchUrl()
	{
		driver.findElement(search_google).sendKeys("ipl" + Keys.ENTER);

	}
	
	public void select_ipl_page()
	{
		driver.findElement(select_ipl_page).click();

	}
	
	public String select_fan_poll()
	{
		driver.findElement(select_fan_poll).click();
		return driver.getCurrentUrl();

	}	

}
