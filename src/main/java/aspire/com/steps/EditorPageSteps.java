package aspire.com.steps;

import java.awt.AWTException;
import java.io.IOException;


import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import aspire.com.pages.EditorPage;
import aspire.com.pages.PageFactory;

public class EditorPageSteps extends BaseSteps {
		public EditorPageSteps() {
			super();
		}

		public EditorPageSteps(PageFactory pageFactory) {
			super(pageFactory);
		}

	
	@When("I Select Associate Editor")
	public void selectAssociateEditor() throws IOException {
		getEditorPage().selectAssociateEditor();
		}
	
	@Then("Summary reports page should display")
	public void verifySummaryReportsPage() throws IOException {
		getEditorPage().verifySummaryReportsPage();
	 
}

	@Then("Detailed Report page should display")
	public void verifyDetailedReportPage() throws IOException {
		getEditorPage().verifyDetailedReportPage();
	 
}
	@Then("Editor Workload/Allocation Report should display")
	public void editorWorkloadAllocationReportDisplays() throws IOException{
		getEditorPage().editorWorkloadAllocationReportDisplays();
	}
	
	@Then("The Associate Editor Workload Report Should display")
	public void displayAssociateEditorDetailedReport() throws IOException {
		getEditorPage().displayAssociateEditorDetailedReport();
		}

	@Then("The Associate Editor Workload Sammary Report Should display")
	public void displayAssociateEditorSammaryReport() throws IOException {
		getEditorPage().displayAssociateEditorSammaryReport();
		}
	
	
	@When("I fill the person information")
	public void fillThePersonInformation() throws IOException {
	//	Editor.fillThePersonInformation();
		}

	@When("I Merge Person")
	public void MergePerson() throws IOException {
		getEditorPage().MergePerson();
		}
	

	
	
	@Then("Person should be added")
	public void addNewPerson() throws IOException {
		getEditorPage().addNewPerson();
		}
	@Then("Information page for $element should be empty")
	public void displayEmptyPage(@Named("element") String element) throws IOException {
		getEditorPage().displayEmptyPage(element);
		}
	
	@When("I click the $element with text $element")
	@Then("I click the $element with text $element")
	public void clickOnElementWithText(@Named("element") String Actual, @Named("element") String expected) throws IOException {
		getEditorPage().clickOnElementWithText(Actual,expected);
		}
	
	@When("I select an Editor for the manuscript")
	public void selectAnEditor() throws IOException {
		getEditorPage().selectAnEditor();
		}

	@When("I Assign Potential Reviewers")
	public void assignPotentialReviewers() throws IOException, AWTException {
		getEditorPage().assignPotentialReviewers();
		}

	
	
	@When("I Assign Associate Editor")
	public void assignAssociateEditor() throws IOException {
		getEditorPage().assignAssociateEditor();
		}
	
	@Then("I check For Duplicate Manuscripts")
	@When("I check For Duplicate Manuscripts")
	public void checkForDuplicateManuscripts() throws IOException {
		getEditorPage().checkForDuplicateManuscripts();
		}
	
	@Then("I check for Flagged Persons")

	public void checkForFlaggedPersons() throws IOException {
		getEditorPage().checkForFlaggedPersons();
		}
	
	@Then("I check for Duplicate Accounts")

	public void checkForDuplicateAccounts() throws IOException {
		getEditorPage().checkForDuplicateAccounts();
		}
	
	@Then("I check task of Duplicate Manuscripts")

	public void checkTaskOfDuplicateMS() throws IOException {
		getEditorPage().checkTaskOfDuplicateMS();
		}
	
	@When("I select Editor will assume the Associate Editor role")
	public void  selectEditorWillAssumeTheAssociateEditorRole() throws IOException, AWTException {
		getEditorPage().selectEditorWillAssumeTheAssociateEditorRole();
		}
	
	
	@Then("I Decision without Review")
	@When("I Decision without Review")
	public void decisionWithoutReview() throws IOException {
		getEditorPage().decisionWithoutReview();
		}
	


	
	@Then("Author Approval should be sent")
	public void sendAuthorApproval() throws IOException{
		getEditorPage().sendAuthorApproval();
	}
	@When("I select Editors from the list")
	public void selectEditorsFromTheList() throws IOException{
		getEditorPage().selectEditorsFromTheList();
	}
	
	@Then("I select decision ready for author")
	public void selectDecisionReadyForAuthor() throws IOException{
	//	Editor.selectDecisionReadyForAuthor();
	}
	@When("I select Associate Editor Decision")
	public void selectAssociateEditorDecision() throws IOException{
		getEditorPage().selectAssociateEditorDecision();
	}
	
}