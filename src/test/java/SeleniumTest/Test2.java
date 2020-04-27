package SeleniumTest;

import java.io.IOException;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

public class Test2 extends  InitialiseDriver{
	Logger log =  LogManager.getLogger(Test1.class.getName());
	@Test
	
	public void getGmail() throws IOException, InterruptedException {
		//InitialiseDriver d = new InitialiseDriver();
		 WebDriver driver = callDriver();
		driver.get(prop.getProperty("Gmailurl"));
		GmailLandingPage l = new GmailLandingPage(driver);
		
		l.getSignin().click();
		
		
	}
	
}
