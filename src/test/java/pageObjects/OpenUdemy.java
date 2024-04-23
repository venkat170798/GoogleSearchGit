package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.TestBase;

public class OpenUdemy {
	public WebDriver driver;
	//public TestBase testBase;
	
	public OpenUdemy(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By selectUdemyUrl = By.xpath("(//div[@class='yuRUbf'])[1]");
	By selectLoginbutton = By.xpath("//a[@class=\"ud-btn ud-btn-medium ud-btn-secondary ud-heading-sm\"]");
	/*By search_google = By.xpath("//textarea[@id='APjFqb']");
	By select_ipl_page = By.xpath("//h3[normalize-space()='Indian Premier League Official Website -2024']");
	By select_fan_poll = By.xpath("//img[@src=\"https://www.iplt20.com/assets/images/fan-poll.svg\"]");*/
	By selectSearch = By.xpath("(//input[@type=\"text\"])[1]");
	By selectDropdown = By.xpath("//div[contains(text(),'cucumber software')]");
	
	public void selectLoginbutton()
	{
		driver.findElement(selectLoginbutton).click();

	}
	
	public void searchUdemy()
	{
		
	}
	
	public void selectSearch()
	{
		driver.findElement(selectSearch).sendKeys("Cucumber",(Keys.ENTER));
	}
	
	public void selectDropdown()
	{
		//return driver.findElement(selectDropdown).click();
		
		Select objSelect =new Select(driver.findElement(selectDropdown));
		objSelect.selectByVisibleText("Cucumber");
	}

}
