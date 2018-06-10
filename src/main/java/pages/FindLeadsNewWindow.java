package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsNewWindow extends ProjectMethods{
	
	public FindLeadsNewWindow() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.NAME, using="firstName")
	private WebElement eleFirstName;
	
	public FindLeadsNewWindow enterFirstNameSearch(String data) {
		type(eleFirstName, data);
		return this;
	}
		
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	
	public FindLeadsNewWindow clickFindLeadsButton() {
		click(eleFindLeads);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleFirstLead;
	
	public MergeLeads clickFirstLead() {
		clickWithNoSnap(eleFirstLead);
		switchToWindow(0);
		return new MergeLeads();
	}

	@FindBy(how=How.XPATH, using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")
	private WebElement eleSecondLead;
	
	public MergeLeads clickSecondLead() {
		clickWithNoSnap(eleSecondLead);
		switchToWindow(0);
		return new MergeLeads();
	}
}
