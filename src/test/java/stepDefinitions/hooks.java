package stepDefinitions;

import io.cucumber.java.After;
import utils.TestContextSetup;

public class hooks {
	
	TestContextSetup globalVarialble;
	
	public hooks(TestContextSetup globalVariable) 
	{
//		/this.globalVariable=globalVariable;
	}
	
	@After
	public void Afterscenario()
	{
		//driver.quit();
	}

}
