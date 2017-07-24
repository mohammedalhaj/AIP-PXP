package aspire.com.steps;

import java.awt.AWTException;
import java.io.IOException;



import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import aspire.com.pages.EditorPage;
import aspire.com.pages.PageFactory;
import aspire.com.pages.StaffPage;
import aspire.com.pages.StepsPage;
import jo.aspire.automation.logger.EnvirommentManager;

public class GlobalSteps extends BaseSteps {
	public GlobalSteps(){
		super();
	}
	public GlobalSteps(PageFactory pageFactory) {
		super(pageFactory);
	}


	@When("I Fill $Val to : $ele")
	public void fillDynamicVal(@Named("Val")String dataEntry,@Named("ele")String element) throws IOException{
		getStepsPage().enterDynamicValueToTextBox(element,dataEntry);
	}
	@When("Fill $Val to : $ele")
	@Then("Fill $Val to : $ele")
	public void fillVal(@Named("Val")String dataEntry,@Named("ele")String element) throws IOException{
		getStepsPage().enterValueToTextBox(element,dataEntry);
	}
	
	@When("I Enter $Val to : $ele Email")
	@Then("I Enter $Val to : $ele Email")
	public void EnterVal(@Named("Val")String dataEntry,@Named("ele")String element) throws IOException{
		getStepsPage().enterDynamicEmail(element,dataEntry);
	}
	
	
	
	@When("I fill the MS ID")
	public void fillMSID() throws IOException
	{
		getStaffPage().fillMSID();
	}
	
	@Then("I upload $file to : $Choose")
	@When("I upload $file to : $Choose")
	public void uploadFileTo(@Named("file")String Thefile,@Named("Choose")String Choose) throws IOException, AWTException {
		getStepsPage().uploadFileTo(Thefile,Choose);
	}
	
	@When("I scroll to $element")
	public void scrollToElement(@Named("element")String element) throws IOException {
		getStepsPage().scrollToElement(element);
	}
	
	@Then("I switch tabs")
	@When("I switch tabs")
	public void switchTabs() throws IOException {
		getStepsPage().switchTabs();
		}
	
	@Then("I switch to second tab")
	@When("I switch to second tab")
	public void switchToSecondTab() throws IOException {
		getStepsPage().switchToSecondTab();
		}
	
	@Then("I switch tabs back")
	@When("I switch tabs back")
	public void switchTabsBack() throws IOException {
		getStepsPage().switchTabsBack();
		}
	
	
	@When("I select the $element")
	public void getText(@Named("element")String element) throws IOException {
		getStepsPage().getText(element);
	}
	
	@When("The $element should display")
	@Then("The $element should display")
	public void displayElement(@Named("element") String element) throws IOException {
		getStepsPage().displaysElement(element);
	}
	
	@When("The $element should Not display")
	@Then("The $element should Not display")
	public void CheckElementNotDisplays(@Named("element") String element) throws IOException {
		getStepsPage().CheckElementNotDisplays(element);
	}
	
	
	@When("The $Actual should be $Expected")
	@Then("The $Actual should be $Expected")
	public void Assert(@Named("Actual") String Actual, @Named("Expected") String Expected) throws IOException {
		getStepsPage().assertResult(Actual,Expected);
	}
	
	
	@When("I click on $element")
	@Then("I click on $element")
	public void clickOnElement(@Named("element") String element) throws IOException{
		getStepsPage().clickOnAnElement(element);
	}
	@When("Click on $element and accept the Alert")
	@Then("Click on $element and accept the Alert")
	public void clickOnAnElementAndAcceptAlert(@Named("element") String element) throws IOException, AWTException{
		getStepsPage().clickOnAnElementAndAcceptAlert(element);
	}
	@Given("I Click On $element")
	@When("I Click On $element")
	@Then("I Click On $element")
	public void clickOnElementUsingJS(@Named("element") String element) throws IOException{
		getStepsPage().clickOnElementUsingJS(element);
	}
	
	@When("I click On Second Artical $element")
	@Then("I click On Second Artical $element")
	public void clickOnSecondElement(@Named("element") String element) throws IOException{
		getStepsPage().clickOnTheSecondArticalBtns(element);
	}
	
	@When("I navigate to the active $element")
	@Then("I navigate to the active $element")
	public void clickOnActiveElement(@Named("element") String IframeSelector) throws IOException, Exception{
		getStepsPage().SwitchToIframe(IframeSelector);
		
		
	}
	
	
	
	
	@When("I write $Value to : $selector")
	public void writeIntoIframe(@Named("Value")String dataEntry,@Named("selector")String element) throws IOException,  AWTException{
		String area = "title_iframe";
		getStepsPage().waitPresenceOfElement("title_iframe");
		if (element.equals("ManuScript_Abstract")){area = "abstract_ifrrame";}
		getStepsPage().SwitchToIframe(area);
		if(dataEntry.contains("251_words")){dataEntry = EnvirommentManager.getInstance().getProperty("251_words");}
		getStepsPage().enterDynamicValueToTextBox(element,dataEntry);
		getStepsPage().SwitchBackFromIframe();
	}

	@When("I select an editor")
	@Then("I select an editor")
	public void SelectEditor() throws IOException{
		getEditorPage().SelectEditor();
	}
	
	@When("I Move The Artical")
	@Then("I Move The Artical")
	public void moveArtival() throws IOException,  AWTException{
		getStepsPage().DragAndDrop("MoveFirstArtical", "MoveSecondArtical");
	}
	@When("The $elemnt Textbox sould be empty")
	@Then("The $elemnt Textbox sould be empty")
	public void CheckTextBoxIsEmpty(String element) throws IOException{
		getStepsPage().CheckTextBoxIsEmpty(element);
	}
	@When("value of $ele and $page should be changed to $NewValue")
	@Then("value of $ele and $page should be changed to $NewValue")
      public void assertValue(@Named("ele") String ele,@Named("page") String page, @Named("NewValue") String NewValue) throws IOException {
		getStepsPage().assertValue(ele,page,NewValue);
	
	}
	

	
}
