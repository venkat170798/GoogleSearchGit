package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OpenUdemy {
	public WebDriver driver;
	
	public OpenUdemy(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By selectUdemyUrl = By.xpath("(//div[@class='yuRUbf'])[1]");
	By selectLoginbutton = By.xpath("//a[@class=\"ud-btn ud-btn-medium ud-btn-secondary ud-heading-sm\"]");
	/*By search_google = By.xpath("//textarea[@id='APjFqb']");
	By select_ipl_page = By.xpath("//h3[normalize-space()='Indian Premier League Official Website -2024']");
	By select_fan_poll = By.xpath("//img[@src=\"https://www.iplt20.com/assets/images/fan-poll.svg\"]");*/
	
	public void selectLoginbutton()
	{
		driver.findElement(selectLoginbutton).click();;

	}
	
	

}
