package SeleniumTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.apache.logging.log4j.*;

public class Test1 extends  InitialiseDriver{
	Logger log =  LogManager.getLogger(Test1.class.getName());
	LandingPage l;
	WebDriver driver;
	@BeforeTest
	public WebDriver callDriver1() throws IOException {
	 driver = callDriver();
	 log.info("driver Initialised");
		return driver;
		
	}
   @AfterTest
	public void closeDriver() {
		driver.close();
	}
	@Test(dataProvider="getData")
	
	public void getAmason(String username,String password) throws IOException, InterruptedException {
		//InitialiseDriver d = new InitialiseDriver();
		 
		driver.get(prop.getProperty("url"));
		 l = new LandingPage(driver);
		log.info("browser launched");
		System.out.println("Inside Test1");
		System.out.println("Inside Test2");
		//Actions a = new Actions(driver);
		//a.moveToElement(l.getSigninLink()).click();
		AssertJUnit.assertTrue(l.getNavBar().isDisplayed());
		l.getSigninLink().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getContinueBtn().click();
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
		
		
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[2][2];
		data[0][0] = "deepsdamini@gmail.com";
		data[0][1] = "1*DeepA$";
		//data[1][0] = "deepsdaminiii@gmail.com";
		//data[1][1] = "1*DeepA$";
		//data[1][0]="hi";
		
		return data;
	}
	
}
