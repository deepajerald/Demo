package SeleniumTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import org.apache.logging.log4j.core.util.FileUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InitialiseDriver{
	Properties prop;
	static WebDriver driver ;
	public WebDriver callDriver() throws IOException {
		
		String url = System.getProperty("user.dir") + "\\data.properties";
		System.out.println( " "+ url );
		prop = new Properties();
		System.out.println("inside driver methhod");
		FileInputStream f = new FileInputStream(url);
		
		prop.load(f);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		if(browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
			ChromeOptions cp = new ChromeOptions();
			if(browser.contains("headless")) {
				cp.addArguments("--headless");
			}
			driver = new ChromeDriver(cp);
		}
		
		else {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\resources\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
		}

	return driver;
}
	public void takeScreenShot(String result) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("G:\\SeleniumTutorialDocs\\Screenshots\\"+result+"screenshot.png"));
	}

}
