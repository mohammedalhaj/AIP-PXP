package aspire.com.steps;

import java.awt.AWTException;
import java.io.IOException;

import org.jbehave.core.annotations.Composite;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import aspire.com.pages.AuthorPage;
import aspire.com.pages.PageFactory;
import aspire.com.pages.StepsPage;

public class AuthorPageSteps extends BaseSteps {
	public AuthorPageSteps() {
		super();
	}
	public AuthorPageSteps(PageFactory pageFactory) {
		super(pageFactory);
	}



	@Then("ManuScript should be submitted")
	@Composite(steps = { 
			"Then The submission_msg should be Your manuscript has been submitted. Your manuscript tracking number is:"
			,"Then The Return_Home_btn should display"
			,"Then The Go_to_Manuscript_btn should display"})
	
	public void submitManuScript()  {
		
	}

	@Then("content of Correspondence page appears")
	@Composite(steps = { 
			"Then The From should display"
			,"Then The Recipient should display"
			,"Then The To should display"
			,"Then The Cc should display"
			,"Then The Bcc should display"
			,"Then The Subject should display"
			,"Then The Attachment should display"
			,"Then The Send_Return_Manuscript should display"
			,"Then The Cancel should display"
			,"Then The Send_Return_home should display"
	})
	public void loadTheCorrespondencePageContent () {	
	}

	@Then("I accept The Popup")
	@When("I accept The Popup")
	public void acceptThePopup() throws AWTException {

			getAuthorPage().acceptThePopup();
	}
	
	@Then("I accept Dialog")
	@When("I accept Dialog")
	public void acceptDialog() throws AWTException {

			getAuthorPage().acceptTheDialog();
	}
	
	@Then("I dismiss Dialog")
	@When("I dismiss Dialog")
	public void dismissDialog() throws AWTException {

		getAuthorPage().dismissTheDialog();
	}
	
	
	
	
	@Then("I select Type of $element")
	@When("I select Type of $element")
	public void TypeOfFirstFile(@Named("element") String element) throws IOException {
		getAuthorPage().clickOnAnElement(element);
	}
	
	@When("I select Type Second of $element")
	public void TypeOfSecondFile(@Named("element") String element) throws IOException {

		getAuthorPage().clickOnTheSecondArticalBtns(element);
	}
	
	@When("I Complete uploading pdf file")
	public void completeUploading() throws IOException {
		getAuthorPage().completeUploading();
	}
	
	@When("I Fill Author information")
	@Composite(steps = { 
			"When Fill empty to : Author_Email"
			,"When Fill mnajjar@aspire-infotech.net to :  Author_Email"
			,"When Fill test to : Contributing_Author_Notification"
			,"When Fill test to : Contrib_Auth_First_Name"
			,"When Fill test to : Contrib_Auth_last_Name"
			,"When Fill test12@testing.com to : Contrib_Auth_email"
			,"When I click on auth_country_option"
			,"When Fill Institution test to : Contrib_Auth_org"
			,"When I click on tvs_next"
	 })
	 public void addNewAuthor() {
	 }
	

	
	
	@When("I Fill the Keywords")
	@Composite(steps = { 
			"When Fill test1 to : keyword_1"
			,"When Fill test2 to : keyword_2"
			,"When Fill test3 to : keyword_3"
			,"When Fill test4 to : keyword_4"
	 })
	 public void fillTheKeywords() {
	 }
	

	
	@When("I Fill Color options")
	@Composite(steps = { 
			"When I click on conflict"
			,"When I click on open_access"
			,"When I click on dual_pub"
			,"When I click on file_permissions"
	 })
	 public void fillColorOptions() {
	 }
	
	
	@When("I Fill All Color options")
	@Composite(steps = { 
			"When I click on conflict"
			,"When I click on open_access"
			,"When I click on dual_pub"
			,"When I click on file_permissions"		
			,"When Fill American Society for Gastrointestinal Endoscopy to : funder_1"
			,"When Fill 1 to : grant_ref_num_1"
			,"When Fill Alzheimer Society to : funder_2"
			,"When Fill 2 to : grant_ref_num_2"
			,"When Fill Test funding sources to : funding_sources"
			,"When Fill Test Manuscript_Comment to : Manuscript_Comment"
		
	 })
	 public void fillAllColorOptions() {
	 }
	
	@When("I Fill Author Review Suggestions")
	@Composite(steps = { 
			"When Fill Y to : Last_Name"
			,"When I click on Find_Person_btn"
			,"When I click on Person"
			,"When I click on Select_Person_btn"		
			,"When I click on peer_country"
			,"When Fill N to : Reviewers_Exclude"
			,"When I click on Find_Person_Exclude_btn"
			,"When I click on Person_Exclude"
			,"When I click on Select_Person_Exclude_btn"
			,"When I click on peer_NO_country"
			,"When Fill Test Reason Exclude to : Reason_Exclude"
			
		
	 })
	public void fillAuthorReviewSuggestions() {
	}
	
	@Then("Check ManuScript Date To Cleare Partial Submission List")
	public void CheckPartialSubmissionAndDelete() throws IOException, AWTException {
		getAuthorPage().CheckPartialSubmissionAndDelete();
		 
	 }
	
	

}
