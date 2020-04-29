package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLandingPage {
	WebDriver driver;
By signIn = By.cssSelector("div[class='h-c-header__cta'] ul:nth-child(1) li:nth-child(2)");
public GmailLandingPage(WebDriver driver) {
	this.driver = driver;
}

public WebElement getSignin() {
	System.out.println("GmailLandingPage");
	return driver.findElement(signIn);
}
}
