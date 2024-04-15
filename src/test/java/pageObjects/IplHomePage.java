package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class IplHomePage {
	public WebDriver driver;
	
		public IplHomePage(WebDriver driver)
		{
			this.driver=driver;
		}

		By search_google = By.xpath("//textarea[@id='APjFqb']");
		By select_ipl_page = By.xpath("//h3[normalize-space()='t IPL']");
		By select_fan_poll = By.xpath("//img[@src=\"https://www.iplt20.com/assets/images/fan-poll.svg\"]");
		
		public void searchUrl()
		{
			driver.findElement(search_google).sendKeys("ipl" + Keys.ENTER);

		}
		
		public void select_ipl_page()
		{
			driver.findElement(select_ipl_page).click();

		}
		
		public void select_fan_poll()
		{
			driver.findElement(select_fan_poll).click();
			
		}		
		
		public String getcurrentUrl()
		{
			return driver.getCurrentUrl();
		}
		
		public void hitURL(String secondurl)
		{
			driver.get(secondurl);
		}
		
}
