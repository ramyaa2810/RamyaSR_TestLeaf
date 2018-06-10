package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{

	public DuplicateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//input[@value='Create Lead']")
	private WebElement eleCreateLeadButton;

	public ViewLead clickCreateButton() {
		click(eleCreateLeadButton);
		return new ViewLead();
	}

}
