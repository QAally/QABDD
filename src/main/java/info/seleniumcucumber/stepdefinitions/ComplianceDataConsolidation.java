package info.seleniumcucumber.stepdefinitions;

import info.seleniumcucumber.methods.DataHelper;
import info.seleniumcucumber.pageObjects.ContactsUsPage;
import info.seleniumcucumber.pageObjects.HomePage;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import env.DriverUtil;

public class ComplianceDataConsolidation extends DriverUtil {
	public WebDriver driver;
	HomePage homePage;
	List<HashMap<String, String>> datamap;

	public ComplianceDataConsolidation() {

		driver = DriverUtil.driver;
		datamap = DataHelper.data(System.getProperty("user.dir")
				+ "//src//test//resources/username.xlsx", "DataSheet1");
	}
	
	@Given("^I click on the Risk Assessments link$")
	public void clickonRiskAssessmentLink() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//li[@class='list-group-item card-list-clickable']"))
				.click();
		
		
		/*
	    WebElement element = driver.findElement(By.xpath("//*[@class='mat-option-text']"));
	    
		Select select = new Select(element);
        select.deselectAll();
        select.selectByVisibleText("ABERDA002700");

		*/
		
		//Select drpCountry = new Select(driver.findElement(By.xpath("//*[@id='mat-option-4']/span")));
		//drpCountry.selectByVisibleText("ABERDA002700");

	}
	
	@Given("^I enter the property reference \"([^\"]*)\"$")
	public void selectAssessment (String text) throws InterruptedException {
		  Thread.sleep(3000);
			
		  driver.findElement(By.cssSelector("#mat-input-0")).sendKeys(text);
	}

	
	
	@Given("^I confirm the selection of property reference$")
	public void ConfirmAssessmentSelection() throws InterruptedException {
		
        Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#mat-option-0 > span")).click();
	}
	
	


	@Given("^I click on the Uploads$")
	public void clickonuploadsButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(
				By.cssSelector("body > app-root > mat-sidenav-container > mat-sidenav > ul:nth-child(2) > li:nth-child(1)"))
				.click();

	}

	@Given("^I click on RiskActions upload$")
	public void clickonRiskActionsUpload() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("#fileUpload")).click();

	}

	@Given("^I choose to upload a file$")
	     public void clickuploadfileButton() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.cssSelector("#fileUpload")).click();
		//Runtime.getRuntime().exec("C:\\fireactionsupload.exe");
		WebElement element = driver.findElement(By.id("fileUpload"));
		element.sendKeys("C:\\Users\\aatieah\\FireRiskAction.csv");
		driver.findElement(By.cssSelector("#up-dlg-actions > mat-dialog-actions > button.mat-raised-button.mat-primary")).click();
	}
	
	@Given("^I choose to upload a valid file$")
	public void choosetouploadValidFile(){
	    // Write code here that turns the phrase above into concrete actions
	    //driver.findElement(By.cssSelector("#up-dlg-actions > mat-dialog-actions > button.mat-raised-button.mat-primary")).click();
		driver.findElement(By.xpath("//*[@id='mat-select-0']/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='mat-option-0']/span")).click();
		WebElement element = driver.findElement(By.id("fileUpload"));
		element.sendKeys("C:\\Users\\aatieah\\FireRiskActionValid.csv");
		
		
		//Select assessmentType = new Select(driver.findElement(By.xpath("//*[@id='mat-option-0']/span")));
		//assessmentType.selectByVisibleText("Fire Actions");
	    
		////*[@id="up-dlg-actions"]/mat-dialog-actions/button[2]
	}
	
	@Given("^I click on the upload button$")
	public void clickOnUploadButton() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//*[@id='up-dlg-actions']/mat-dialog-actions/button[2]")).click();
	}

	@Given("^I choose to upload a valid Action update Assessment file$")
	public void uploadActionUpdateAssessment() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='mat-select-0']/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='mat-option-1']/span")).click();
		WebElement element = driver.findElement(By.id("fileUpload"));
		element.sendKeys("C:\\Users\\aatieah\\FireRiskActionsUpdateTemplate.csv");
	}
	
	@Given("^I choose to upload a duplicate Action update Assessment file$") 
	    public void duplicateLiftAssessment() throws InterruptedException{
			Thread.sleep(10000);
	    	driver.findElement(By.xpath("//*[@id='mat-select-0']/div/div[1]")).click();
			driver.findElement(By.cssSelector("#mat-option-1 > span")).click();
			WebElement element = driver.findElement(By.id("fileUpload"));
			element.sendKeys("C:\\Users\\aatieah\\FireRiskActionsUpdateTemplate.csv");
	    
			
			//lifts upload template_12092018.csv
	    }

	
	@Then("^the message \"([^\"]*)\"$")
	public void validateInvalidMessage(String text) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		String bodyText = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText.contains(text));
		
		//List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
		//Assert.assertTrue("Text not found!", list.size() > 0);
	}
	
	

		@Then("^the message \"([^\"]*)\" should be displayed$")
		public void validateValidMessage(String text) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
			Thread.sleep(10000);
			String bodyText = driver.findElement(By.tagName("body")).getText();
			Assert.assertTrue("Text not found!", bodyText.contains(text));
        }
	
		
		@Given("^I choose to upload a valid Lift Assessment file$")
		public void uploadLiftAssessment() throws InterruptedException{
		    // Write code here that turns the phrase above into concrete actions
			//Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='mat-select-0']/div/div[1]")).click();
			driver.findElement(By.cssSelector("#mat-option-2 > span")).click();
			//driver.findElement(By.cssSelector("#fileUpload")).click();
			//driver.findElement(By.xpath("//*[@id='mat-option-1']/span")).click();
			WebElement element = driver.findElement(By.id("fileUpload"));
			element.sendKeys("C:\\Users\\aatieah\\lifts upload template_12092018.csv");
		}
		
		@Given("^I choose to upload a duplicate Lift Assessment file$")
		public void uploadDuplicateLiftAssessment() throws InterruptedException{
		    // Write code here that turns the phrase above into concrete actions
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='mat-select-0']/div/div[1]")).click();
			driver.findElement(By.cssSelector("#mat-option-2 > span")).click();
			//driver.findElement(By.cssSelector("#fileUpload")).click();
			//driver.findElement(By.xpath("//*[@id='mat-option-1']/span")).click();
			WebElement element = driver.findElement(By.id("fileUpload"));
			element.sendKeys("C:\\Users\\aatieah\\lifts upload template_12092018.csv");
		}
	
	/*
	 * @Given("^I close the alert$") public void closeAlert() throws
	 * IOException{ Runtime.getRuntime().exec("C:\\winauthlogin.exe");
	 * WebDriverWait wait = new WebDriverWait(driver, 30); Alert alertPopUp =
	 * wait.until(ExpectedConditions.alertIsPresent());
	 * alertPopUp.authenticateUsing(new UserAndPassword("aatieah",
	 * "International1")); }
	 */

	@Then("^the page title should be \"([^\"]*)\"$")
	public void ValidateCDCpagetitle(String arg1) throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertTrue(driver.getTitle().contains(arg1));

	}

	@Given("^I search for a property with the reference \"([^\"]*)\"$")
	public void searchforProperty(String arg1) {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^the region \"([^\"]*)\" should be displayed$")
	public void validateRegion(String arg1) {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^I enter \"([^\"]*)\" in the msn search field$")
	public void searchMsn(String arg1) {
		// Write code here that turns the phrase above into concrete actions
		int index = Integer.parseInt(arg1) - 1;
		System.out.println("Printing current data set...");
		for (HashMap h : datamap) {
			System.out.println(h.keySet());
			System.out.println(h.values());
		}
		// Select subjectHeading = new
		// Select(driver.findElement(By.id("id_contact")));
		driver.findElement(By.cssSelector("#q")).sendKeys(
				datamap.get(index).get("Password"));
	}

	@Given("^I navigate to the http://www\\.gmail\\.com$")
	public void navigate_homepage() {
		// Write code here that turns the phrase above into concrete actions
		HomePage.navigatetohomepage();
	}

	@Given("^I click on the sign on link$")
	public void clickonsignonlink() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		HomePage.homepage_navigateContactuspage();
	}

	@Then("^I should be navigated to the sign on screen Sign in$")
	// Write code here that turns the phrase above into concrete actions
	public void validatepage() throws InterruptedException {

		ContactsUsPage.validate_contactuspage_landingpage();
	}

	@Given("^I enter an invalid email address$")
	public void enter_email_address() throws InterruptedException {
		ContactsUsPage.enter_gmail_username();
	}

	@Given("^I click on the next button$")
	public void click_next_button() throws InterruptedException {
		ContactsUsPage.click_next_button();
	}

	@Then("^a message \"([^\"]*)\" should be displayed$")
	public void validate_invalidlogin_message(String text)
			throws InterruptedException {
		ContactsUsPage.validate_invalidlogin_message(text);

	}

}

/*
 * List<WebElement> list = driver.findElements(By .xpath("//*[contains(text(),'"
 * + "arg1" + "')]")); Assert.assertTrue("Text not found!", list.size() > 0);
 * driver.get(arg0);
 */
/*
 * 
 * //Write code here that turns the phrase above into concrete actions
 * WebDriverWait wait = new WebDriverWait(driver, 30); Alert alertPopUp =
 * wait.until(ExpectedConditions.alertIsPresent());
 * alertPopUp.authenticateUsing(new UserAndPassword("aatieah",
 * "International1"));
 */