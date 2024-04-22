package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public IplHomePage iplhomepage;
	public OpenUdemy openudemy;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public IplHomePage getIplHomePage()
	{
		iplhomepage=new IplHomePage(driver);
		return iplhomepage;
	}
	
	public OpenUdemy openUdemy()
	{
		openudemy=new OpenUdemy(driver);
		return openudemy;
	}

}
