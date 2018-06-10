package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods{

	public MergeLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromleadImg;

	public FindLeadsNewWindow clickFromLeadImg() {
		click(eleFromleadImg);
		switchToWindow(2);
		return new FindLeadsNewWindow();
	}

	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToleadImg;

	public FindLeadsNewWindow clickToLeadImg() {
		click(eleToleadImg);
		switchToWindow(2);
		return new FindLeadsNewWindow();
	}

	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMergeButton;

	public ViewLead clickMergeButton() {
		click(eleMergeButton);
		acceptAlert();
		return new ViewLead();
	}

}
