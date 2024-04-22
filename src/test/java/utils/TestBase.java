package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public String secondURL() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL2 = prop.getProperty("URL2");
		return URL2;
	}
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("GoogleURL");
		String URL2 = prop.getProperty("URL2");
		String Udemy = prop.getProperty("UdemyUrl");
		
		if(driver== null)
		{
		System.setProperty("webdriver.edge.driver", "C:/Users/vnkt5/Downloads/edgedriver_win64/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get(URL);
		driver.get(Udemy);
		}
		return driver;
		
	
		

		
	}

}
