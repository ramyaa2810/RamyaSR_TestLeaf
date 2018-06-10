package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleLeadName;
	@Then("Verify Lead created successfully (.*)")
	public ViewLead verifyLeadName(String data) {
		verifyExactText(eleLeadName, data);
		return this;
	}

	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyName;

	public ViewLead verifyCompanyName(String data) {
		verifyPartialText(eleCompanyName, data);
		return this;
	}

	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditButton;

	public EditLead clickEditButton() {
		click(eleEditButton);
		return new EditLead();
	}

	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateButton;

	public DuplicateLead clickDuplicateButton() {
		click(eleDuplicateButton);
		return new DuplicateLead();
	}

	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleDeleteButton;

	public MyLeads clickDeleteButton() {
		click(eleDeleteButton);
		return new MyLeads();
	}

}
