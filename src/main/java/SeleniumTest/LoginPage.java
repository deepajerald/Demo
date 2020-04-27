package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	By email = By.id("ap_email");
	By continueBtn =By.xpath("//input[@id='continue']");
	By password = By.name("password");
	By login = By.id("signInSubmit");
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getContinueBtn() {
		return driver.findElement(continueBtn);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLogin() {
		return driver.findElement(login);
	}

}
