package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public IplHomePage iplhomepage;
	public OpenNewTab opennewtab;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public IplHomePage getIplHomePage()
	{
		iplhomepage=new IplHomePage(driver);
		return iplhomepage;
	}
	
	public OpenNewTab openNewTab()
	{
		opennewtab=new OpenNewTab(driver);
		return opennewtab;
	}

}
