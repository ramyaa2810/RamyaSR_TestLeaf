package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	public EditLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCmpnyName;

	public EditLead updateCompanyName(String data) {
		type(eleCmpnyName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement eleUpdateButton;

	public ViewLead clickUpdateButton() {
		click(eleUpdateButton);
		return new ViewLead();
	}

}
