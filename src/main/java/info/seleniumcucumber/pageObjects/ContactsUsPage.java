package info.seleniumcucumber.pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class ContactsUsPage extends HomePage {
	
Scenario scenario;
	
	@Before
	public void before(Scenario scenario) {
	    this.scenario = scenario;
	   
	}
	
	 public ContactsUsPage() {
	    super();	// TODO Auto-generated constructor stub
	}
	 
	

	public static ContactsUsPage enter_gmail_username() throws InterruptedException {
		Thread.sleep(5000);
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(
				By.xpath("//div[@class='Xb9hP']/input [@type='email']"))
				.click();
		driver.findElement(
				By.xpath("//div[@class='Xb9hP']/input [@type='email']"))
				.sendKeys("allyatieahhotmail.com");
		
		return new ContactsUsPage();
	};

//	@Given("^I click on the next button$")
	public static ContactsUsPage click_next_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		driver.findElement(By
				.xpath("//span[text()='Next']")).click();;
		return new ContactsUsPage();
	}

	
	public static ContactsUsPage validate_invalidlogin_message(String text) throws InterruptedException {
		{
			// Write code here that turns the phrase above into concrete actions

          //  text = "Couldn't find your Google Account";
			////div[text()="Couldn't find your Google Account"]

			Thread.sleep(5000);
			String bodyText = driver.findElement(By.tagName("div")).getText();
			Assert.assertTrue("Text not found!", bodyText.contains(text));
			return new ContactsUsPage();

		}	
	}
	

	public static ContactsUsPage validate_contactuspage_landingpage() throws InterruptedException {
		{
			// Write code here that turns the phrase above into concrete actions

          //  text = "Couldn't find your Google Account";

			Thread.sleep(5000);
			List<WebElement> list = driver.findElements(By
					.xpath("//*[contains(text(), 'Sign in')]"));
			Assert.assertTrue("Text not found!", list.size() > 0);
			
			return new ContactsUsPage();

			//*[contains(text(), 'QMS_CLR_Testing')]" 
		}		
	/*	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'YourTextHere')]")));
	    assertNotNull(driver.findElement(By.xpath("//*[contains(text(), 'YourTextHere')]")));
	    String yourButtonName=driver.findElement(By.xpath("//*[contains(text(), 'YourTextHere')]")).getAttribute("innerText");
	    assertTrue(yourButtonName.equalsIgnoreCase("YourTextHere"));*/

	}

}
