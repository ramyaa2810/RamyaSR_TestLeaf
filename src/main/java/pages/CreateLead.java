package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCmpnyName;
	@And("Enter Company Name as (.*)")
	public CreateLead enterCompanyName(String data) {
		type(eleCmpnyName, data);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	@And("Enter First Name as (.*)")
	public CreateLead enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}


	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	@And("Enter Last Name as (.*)")
	public CreateLead enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}

	/*@FindBy(how=How.ID,using="createLeadForm_industryEnumId")
	private WebElement eleIndustry;

	public CreateLead selectIndustry(String data) {
		selectDropDownUsingText(eleIndustry, data);
		return this;
	}
*/	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	@And("Enter Email as (.*)")
	public CreateLead enterEmail(String data) {
		type(eleEmail, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhone;
	@And("Enter PhoneNumber as (.*)")
	public CreateLead enterPhone(String data) {
		type(elePhone, data);
		return this;
	}

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadButton;
	@And("Click Create lead button")
	public ViewLead clickCreateLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLead();
	}
}
