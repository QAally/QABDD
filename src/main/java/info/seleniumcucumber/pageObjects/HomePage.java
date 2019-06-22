package info.seleniumcucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import env.DriverUtil;


public class HomePage extends DriverUtil {

	// protected static WebDriver driver;
	protected static WebDriverWait wait;
	public static long DEFAULT_WAIT = 20;
	ContactsUsPage contactsUsPage;
	HomePage homePage;
	

	public HomePage() {
		super();

	} 

	public static HomePage navigatetohomepage() {
		driver = DriverUtil.getDefaultDriver();
		wait = new WebDriverWait(driver, 2);
		driver.get("http://ohgintapp01.ohg.local:9050/");
		return new HomePage();
	}
	

	public static HomePage homepage_navigateContactuspage() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//div[@class='gmail-nav__nav-links-wrap']/a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']"))
				.click();
		return new HomePage();
	}

}
