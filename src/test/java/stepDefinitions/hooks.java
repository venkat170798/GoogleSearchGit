package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import utils.TestContextSetup;

public class hooks {
	
	TestContextSetup globalVarialble;
	private TestContextSetup globalVariable;
	
	public hooks(TestContextSetup globalVariable) 
	{
		this.globalVariable=globalVariable;
	}
	
	@After
	public void Afterscenario() throws IOException
	{
		globalVariable.testBase.WebDriverManager().quit();;
		//driver.quit();
	}

}
