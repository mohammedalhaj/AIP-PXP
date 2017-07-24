package aspire.com.steps;

import java.awt.AWTException;
import java.io.IOException;

import org.jbehave.core.annotations.Composite;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import aspire.com.pages.PageFactory;
import aspire.com.pages.StaffPage;

public class StaffPageSteps extends BaseSteps {
	public StaffPageSteps(){
		super();
	}
	public StaffPageSteps(PageFactory pageFactory) {
		super(pageFactory);
	}

	@Then("Staff Report page should display")
	public void displaysStaffReportsPage () throws IOException {
		getStaffPage().displaysStaffReportsPage();
	}

	@Then("Staff chasers page should display")
	public void displaysChasersReportsPage () throws IOException {
		getStaffPage().displaysChasersReportsPage();
	}
	@Then("Staff Manage Accounts page should display")
	public void displaysManageAccountPage () throws Exception {
		getStaffPage().displaysManageAccountPage();
	}
	@Then("advanced manuscript tasks page should display")
	public void displaysAdvancedManuscriptPage() throws IOException {
		getStaffPage().displaysAdvancedManuscriptPage();
	}
	
	@Then("I search for manuscript as staff")
	public void searchForManuscriptAsStaff() throws IOException {
		getStaffPage().searchForManuscriptAsStaff();
	}
	
	@Then("I search category for manuscript as staff")
	public void searchCategoryForManuscriptAsStaff() throws IOException {
		getStaffPage().searchCategoryForManuscriptAsStaff();
	}
	


	

	@Then("Staff Manuscript status page should display")
	@Composite(steps = { 
			 "Then The MS_name should display"
			,"Then The staff_author_name should display"
			,"Then The cont_author_name should display"
			,"Then The editor_list should display"
			,"Then The monitoring_editor_list should display"
			,"Then The ms_type should display"
			,"Then The reviewer should display"
			,"Then The sticky_note_color should display"
			,"Then The exclude should display"
			,"Then The Search should display"		
	})
	public void staffManuscriptStatusPageShouldDisplay() {
		
	}
	
	@Then("Verify the content of the check MS page")
	public void verifyCheckManuscriptStatusPage() throws IOException{
		getStaffPage().verifyCheckManuscriptStatusPage();
	}

	@Then("Verify the content of Find Person page")
	public void verifyTheContentOfFindPersonPage() throws IOException{
		getStaffPage().verifyTheContentOfFindPersonPage();
	}
	
	@Then("Verify the content of Workload Report page")
	public void verifyTheContentOfWorkloadReportPage() throws IOException{
		getStaffPage().verifyTheContentOfWorkloadReportPage();
	}
	
	@Then("Verify the content of Allocation Report page")
	public void verifyTheContentOfAllocationReportPage() throws IOException{
		getStaffPage().verifyTheContentOfAllocationReportPage();
	}
	
	
/*	@When("I select a manuscript")
	public void selectAManuscript() throws IOException{
		Staff.selectAManuscript();
	}*/
	

	
	@When("I search for the MS")
	@Composite(steps = { 
			"When I click on Return_Main_Page"
			,"When I click on Check_MS_Status"
			,"When I fill the MS ID"
			,"When I click on Search_btn"
			,"When I click on MS_Searched"
			,"When I switch tabs"
	})
	
	public void searchForTheMS() {		
	}
	
	@When("I Accept from the Reviewr user")
	public void acceptFromReviewrUser() throws IOException{
		getStaffPage().acceptFromReviewrUser();
	}
	
	@When("The Reviewr $element MS")
	public void rejectMS(@Named("element") String element) throws IOException, AWTException {
		getStaffPage().rejectMS(element);
		}
	
	@When("The Associate Editor Reject ManuScript")
	public void rejectMSFromAssociateEditor() throws IOException, AWTException {
		getStaffPage().rejectMSFromAssociateEditor();
		}
	
	@When("The Associate Editor select $element ManuScript with $secondElement")
	public void optionalRevisionMSFromAssociateEditor(@Named("element") String element,
			@Named("secondElement") String secondElement) throws IOException, AWTException {
		getStaffPage().optionalRevisionMSFromAssociateEditor(element,secondElement);
		}
	
	

	
	@When("The Associate Editor select the Recommend another journal Editor option")
	public void clickRecommendAnotherJournal() throws IOException{
		getStaffPage().clickRecommendAnotherJournal();
	}
	
	@When("I click the initial QC Manuscript")
	public void clickInitialQcManuscript() throws IOException{
		getStaffPage().clickInitialQcManuscript();
	}
	@When("I select Send All Emails")
	public void selectSendAllEmails() throws IOException{
		getStaffPage().selectSendAllEmails();
	}
	@Then("MS waiting for production should display")
	public void displaysMSWaitingForProduction() throws IOException{
		getStaffPage().displaysMSWaitingForProduction();
	}
	
	@Then("Partial manuscripts content should appear")
	public void displayPartialMSContent() throws IOException{
		getEditorPage().displayPartialMSContent();
	}
	
	@Then("Details page content should display")
	public void displayDetailsPageContent() throws IOException{
		getEditorPage().displayDetailsPageContent();
	}
	
	@Then("Initial QC content should appear")
	public void displayOfQcContent() throws IOException{
		getEditorPage().displayOfQcContent();
	}
	
	@Then("Initial QC content should funcion properly")
	public void functionOfQcContent() throws IOException{
		getEditorPage().functionOfQcContent();
	}
	
	@Then("ManuScript content page should appear properly")
	public void displayOfManuScriptContent() throws IOException{
		getEditorPage().displayOfManuScriptContent();
	}
	
	
	@Then("User page content should appear")
	public void displayUserPageContent() throws IOException{
		getEditorPage().displayUserPageContent();
	}
	
	@Then("Correction of the manuscript page should appear")
	public void displayCorrectionPageContent() throws IOException{
		getStaffPage().displayCorrectionPageContent();
	}
	
	@When("I select upload file under MS item")
	public void selectUploadFileUnderMSitem() throws IOException{
		getStaffPage().selectUploadFileUnderMSitem();
	}
	@Then("Advanced manuscript tasks page display")
	public void displayingAdvancedManuscriptPage() throws Exception{
		getStaffPage().displayingAdvancedManuscriptPage();
	}

}
