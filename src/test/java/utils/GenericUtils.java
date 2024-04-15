package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void openNewTab()
	{
		driver.switchTo().newWindow(WindowType.TAB);
	}

}
