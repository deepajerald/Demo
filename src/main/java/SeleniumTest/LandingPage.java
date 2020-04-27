package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;
	By sigInLink = By.id("nav-link-accountList");
	By navBar = By.id("nav-main");
	By covid=By.xpath("//div[@id='navSwmHoliday']/a/img");
	By contact =By.xpath("//a[@id='navBackToTop']/div");
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement getSigninLink() {
		return driver.findElement(sigInLink);
	}
	public WebElement getNavBar() {
		return driver.findElement(navBar);
	}
	public WebElement getCovidText() {
		return driver.findElement(covid);
	}
	public WebElement getContact() {
		return driver.findElement(contact);
	}

}
