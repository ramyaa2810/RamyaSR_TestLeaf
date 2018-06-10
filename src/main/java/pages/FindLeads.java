package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
	
	public FindLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH, using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	
	public FindLeads enterFirstNameSearch(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how=How.NAME, using="id")
	private WebElement eleleadid;
	
	public FindLeads enterLeadIDSearch(String data) {
		type(eleleadid, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elePhoneTab;
	
	public FindLeads clickPhoneTab() {
		click(elePhoneTab);
		return this;
	}
	
	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement elePhoneNum;
	
	public FindLeads enterPhoneNumSearch(String data) {
		type(elePhoneNum, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmailTab;
	
	public FindLeads clickEmailTab() {
		click(eleEmailTab);
		return this;
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEmailAdd;
	
	public FindLeads enterEmailAddSearch(String data) {
		type(eleEmailAdd, data);
		return this;
	}
		
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	
	public FindLeads clickFindLeadsButton() {
		click(eleFindLeads);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="(//a[@class='linktext'])[4]")
	private WebElement eleFirstLead;
	
	public ViewLead clickFirstLead() {
		click(eleFirstLead);
		return new ViewLead();
	}

}
