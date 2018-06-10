package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateLeadSteps {
	
	public RemoteWebDriver driver;
	@Given("Invoke LeafTap app")
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@And("1Enter UserName as (.*)")
	public void enterUseName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	
	@And("1Enter Password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@And("1 Enter Click Login")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@And("1Click CRMSFA")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("1Click Leads Tab")
	public void clickLeadsTab() {
		driver.findElementByLinkText("Leads").click();
	}
	
	@And("1Click Create Lead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("1Enter Company Name as (.*)")
	public void enterCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	
	@And("1Enter First Name as (.*)")
	public void enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	
	@And("1Enter Last Name as (.*)")
	public void enterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	@And("1Click Create lead button")
	public void clickCreateLeadButton() {
		driver.findElementByName("submitButton").click();
	}
	
	@Then("Verify Lead created successfully")
	public void verifyLeadcreated() {
		String leadname = driver.findElementById("viewLead_firstName_sp").getText();
		if (leadname.contentEquals("Ramya")) {
			System.out.println("Lead Created Successfully");
		}else {
			System.out.println("Lead Not created");
		}
	}
	
}
