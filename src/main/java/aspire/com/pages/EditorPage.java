package aspire.com.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

import org.hamcrest.Matchers;
import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import jo.aspire.automation.logger.EnvirommentManager;


public class EditorPage extends StepsPage {
	

	public EditorPage(WebDriverProvider webDriverProvider) {
		super(webDriverProvider);
	}
	public static String z;
	public String EditorName = "";

	public void verifySummaryReportsPage() {
	
		Iterator<WebElement> elements = findElements(By.cssSelector("div.pagecontainer tbody tr th")).iterator();
		WebElement item;

		while (elements.hasNext()) {
			item = elements.next();

			theList.add(item.getText());
		}

		String[] Tablelist = {"Manuscript #","Associate Editor","Manuscript Title","Corresponding Author","Current Stage","Editor","Reviewers"};
		for (int i = 0; i < Tablelist.length; i++) {
			 
			Assert.assertEquals(theList.get(i), Tablelist[i]);
		}

	}

	public void verifyDetailedReportPage() throws IOException {
        String array[]={"Orlando Auciello","Manuscript #","Current Revision #","Other Versions","Current Stage","Title","Running Title","Manuscript Type","Keywords","Corresponding Author","Contributing Author","Abstract","Associate Editor","Editor","Reviewers","Submission Date"};
        waitPresenceOfElement("div.pagecontainer tbody tr th");
		for (int i = 0; i < array.length; i++) {
			String Message = findElements(By.cssSelector("div.pagecontainer tbody tr th")).get(i).getText();
			org.junit.Assert.assertEquals(array[i] , Message);
	}
		
			  
	}
	
	public void editorWorkloadAllocationReportDisplays() throws IOException {

		displaysElement("Title_of_EditorWorkload_Report");
        String Editor_Name_Title = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Name_Of_Editor"))).getText();	
		org.junit.Assert.assertTrue(EditorName.contains(Editor_Name_Title));

	}

	public void selectAssociateEditor() throws IOException {
		try {
			waitPresenceOfElement("The_Editor_name");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  EditorName= findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("The_Editor_name"))).getText();
	 // findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("The_Editor"))).click();
	  clickOnAnElement("The_Editor");
	
	}
	
	public void selectEditorsFromTheList() throws IOException {

		  EditorName= findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Editor_name"))).getText();
		  findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Editor"))).click();
		  clickOnAnElement("View_Workloads_Allocations_btn");
		}

	public void displayAssociateEditorSammaryReport() {
		try {
			String Message = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Editor_name"))).get(0).getText();
		 	org.junit.Assert.assertEquals(Message,"Manuscript #");
	    	
	    	 String Message2 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Editor_name"))).get(1).getText();
	     	org.junit.Assert.assertEquals(Message2,"Days In System");
	     	
	     	String Message3 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Editor_name"))).get(2).getText();
	     	org.junit.Assert.assertEquals(Message3,"Manuscript Title");
	     	
	     	String Message4 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Editor_name"))).get(5).getText();
	     	org.junit.Assert.assertEquals(Message4,"Reviewers");
		}
	     	catch (Exception e) {
				String Message = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Detailed_NO_Report_Page"))).getText();
				org.junit.Assert.assertEquals(Message,"There are no manuscripts in the scope of this report.");
			}
		
	}

	
    public void displayAssociateEditorDetailedReport() {
    	try {
    		
        String Message = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Detailed_Report_Options"))).get(0).getText();
        org.junit.Assert.assertEquals(Message,"Manuscript #");
    	
    	 String Message2 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Detailed_Report_Options"))).get(1).getText();
     	org.junit.Assert.assertEquals(Message2,"Current Revision #");
     	
     	String Message3 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Detailed_Report_Options"))).get(2).getText();
     	org.junit.Assert.assertEquals(Message3,"Other Version");
     	
     	String Message4 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Detailed_Report_Options"))).get(13).getText();
     	org.junit.Assert.assertEquals(Message4,"Submission Date");
    	}
     	catch (Exception e) {
			String Message = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Detailed_NO_Report_Page"))).getText();
			org.junit.Assert.assertEquals(Message,"There are no manuscripts in the scope of this report.");
		}
		
	
	}
	
	

	public void addNewPerson() {
		String Message = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Person_added_Msg"))).getText();
		org.junit.Assert.assertTrue(Message.contains("Person added"));
		
	}

	public void displayEmptyPage(String element) {
		String Message = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).getText();
		org.junit.Assert.assertEquals(Message,"");
		
	}


	public void clickOnElementWithText(String Actual, String expected) {
		WebElement TextElement = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(Actual)));
		String Message = TextElement.getText();
		
		if (Message.equals(expected)){
			TextElement.click();
		}else{
			Assert.assertEquals(Message,expected);
		}
						
	}
	

	public void contactPotentialReviewers() {
	findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Dec_without_Reviewer"))).get(1).click();
		
	}

	public void checkForDuplicateManuscripts() throws IOException {
	
		browserTabs = new ArrayList<String>(getWindowHandles());
         switchTo().window(browserTabs.get(1));
         waitPresenceOfElement("check_For_Duplicate");
     	clickOnAnElement("check_For_Duplicate");
     	browserTabs = new ArrayList<String>(getWindowHandles());
     	 switchTo().window(browserTabs.get(2));
     	waitPresenceOfElement("table tr td p b:nth-child(6)");
        String Message = findElement(By.cssSelector("table tr td p b:nth-child(6)")).getText();
        Assert.assertTrue(Message.contains("Duplicate Manuscripts Check"));
		waitPresenceOfElement("input[value='Close Window']");
        findElement(By.cssSelector("input[value='Close Window']")).click();
	
	}

	public void selectAnEditor() throws IOException {
	
		clickOnAnElement("Editor_Assign");
		clickOnAnElement("Assign_Editor_btn");
        String Message = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Editor_assigned_message"))).getText();
		org.junit.Assert.assertTrue(Message.contains("Editor assigned"));
		clickOnElement("MS_link_Editor");

		
	}
	
	public void assignAssociateEditor() throws IOException {
	try {
		WaitDOMToBeReady();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	waitPresenceOfElement("#content_2 table tbody tr a");
	
	for(int i = 0 ; i <5 ; )
		{
		String element = findElements(By.cssSelector("#content_2 table tbody tr a")).get(i).getText();
		if (element.equalsIgnoreCase("Assign Associate Editor"))
		{
			findElements(By.cssSelector("#content_2 table tbody tr a")).get(i).click();
		i=6;
		}
		else {
			i++;
			}
		}

		waitPresenceOfElement("#AE1 option:nth-child(7)");
  findElement(By.cssSelector("#AE1 option:nth-child(7)")).click();

   findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Assign_Associate_Editor_btn"))).click();

    String AssociateEditor_Msg = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Associate_Editor_Msg"))).getText();
    org.junit.Assert.assertTrue(AssociateEditor_Msg.contains("Editor assigned to"));


    clickOnElement("Associate_Editor_Msg_num");
    clickOnElement("Task_tab");
   
		
	}
	
	public void assignPotentialReviewers() throws AWTException, IOException{
		
		for(int i = 0 ; i <5 ; )
		{
		String element = findElements(By.cssSelector("#content_2 table tbody tr a")).get(i).getText();
		if (element.equalsIgnoreCase("Assign Potential Reviewers"))
		{
			findElements(By.cssSelector("#content_2 table tbody tr a")).get(i).click();
		i=6;
		}
		else {
			i++;
			}
		}
		
		waitPresenceOfElement("Potential_Reviewer_Name");
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Potential_Reviewer_Name"))).sendKeys("Adarsh");
		clickOnAnElement("Search_btn_Potential_Reviewer");
		clickOnAnElement("Potential_Reviewer_Check_box");

		try {
			acceptTheDialog();
		} catch (Exception e) {
			
		}
		clickOnAnElement("Assign_Potential_Reviewer_btn");
		clickOnAnElement("done_finished_btn");
		clickOnAnElement("Accept_Reviewer");
		clickOnAnElement("Send_btn");
		clickOnAnElement("Process_current_Accepted_Reviewers");
	
	
       
		
	}
	public void decisionWithoutReview() throws IOException{
	
		for(int i = 0 ; i <5 ; )
		{
		String element = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Dec_without_Reviewer"))).get(i).getText();
		if (element.equalsIgnoreCase("Decision without Review"))
		{
			findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Dec_without_Reviewer"))).get(i).click();
		i=6;
		}
		else {
			i++;
			}
		}
		
	
		
		     clickOnAnElement("Editor_Publish_as_is");
		     clickOnElement("accept_original");
		 	///////new changes and fixes/////
			clickOnAnElement("Press_Release_Yes");
			clickOnAnElement("Feature_Article_Yes");
			clickOnAnElement("Editors_Pick_Yes");
			///////new changes and fixes/////
		     clickOnElement("Submit_Dec");
	  
		
	}
	


	public void sendAuthorApproval() throws IOException {

		clickOnAnElement("Send_Author_Approve_btn");
		String Message = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Title_Message"))).getText();
		org.junit.Assert.assertEquals(Message,"Manuscript Sent back to Author Approval");
		
	}

 
        public void MergePerson() throws IOException {
        	
        waitPresenceOfElement("Mearge_two_persons");
        findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Mearge_two_persons"))).click();
        clickOnAnElement("Person_To_Merged");
        clickOnAnElement("Keep_checkbox");
        clickOnAnElement("Merge_checkbox");
        clickOnAnElement("Merge_Persons_button");
       
	}


	public void selectEditorWillAssumeTheAssociateEditorRole() throws AWTException, IOException {
		try {
			WaitDOMToBeReady();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		waitPresenceOfElement("#content_2 table tbody tr a");
		for(int i = 0 ; i <5 ; )
		{
		String element = findElements(By.cssSelector("#content_2 table tbody tr a")).get(i).getText();
		if (element.equalsIgnoreCase("Editor will assume the Associate Editor role."))
		{
			findElements(By.cssSelector("#content_2 table tbody tr a")).get(i).click();
		i=6;
		}
		else {
			i++;
			}
		}
		
		waitPresenceOfElement("Potential_Reviewer_Name");
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Potential_Reviewer_Name"))).sendKeys("Adarsh");
		clickOnAnElement("Search_btn_Potential_Reviewer");
		clickOnAnElement("Potential_Reviewer_Check_box");
		
		
		try {
			acceptTheDialog();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		clickOnAnElement("Assign_Potential_Reviewer_btn");
		clickOnAnElement("done_finished_btn");
		clickOnAnElement("Accept_Reviewer");
		clickOnAnElement("Send_btn");
		clickOnAnElement("Process_current_Accepted_Reviewers");
	

	} 


	public void selectAssociateEditorDecision() throws IOException {
       
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitPresenceOfElement("#content_2 table:nth-child(4) tr:nth-child(3) td:nth-child(2) font a");
		findElement(By.cssSelector("#content_2 table:nth-child(4) tr:nth-child(3) td:nth-child(2) font a")).click();
		clickOnAnElement("Editor_Publish_as_is");
		
		
		clickOnAnElement("accept_original");
		///////new changes and fixes/////
		clickOnAnElement("Press_Release_Yes");
		clickOnAnElement("Feature_Article_Yes");
		clickOnAnElement("Editors_Pick_Yes");
		///////new changes and fixes/////
		clickOnElement("Submit_Dec");
		
		
	}

	public void SelectEditor() throws IOException {
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitPresenceOfElement("First_Editor");
		clickOnAnElement("First_Editor");
		clickOnAnElement("Assign_Editor_Btn");
		clickOnElement("Associate_Editor_Msg_num");
		clickOnElement("Task_tab");
		
	}

	public void displayPartialMSContent() throws IOException {
		SleepTime(5000);
		String array[]={"Manuscript #","Journal","Current Revision #","Submission Date","Current Stage","Title","Manuscript Type","Corresponding Author","Contributing Author","Abstract","Associate Editor","Subject Area","Applicable Funding Sources"};
		waitPresenceOfElement(".dump_ms_details th");
			for (int i = 0; i < array.length; i++) {
				String Message = findElements(By.cssSelector(".dump_ms_details th")).get(i).getText();
				org.junit.Assert.assertEquals(array[i],Message);
		}
		
			displaysElement("ManuscriptItems");
			//displaysElement("workflow_message");
			
			displaysElement("Continue_Partial_Submission");
			displaysElement("Delete_Partial_Submission");
			displaysElement("Send_Manuscript_Correspondence");
			displaysElement("Check_Status");
			
			
			
	}

	public void checkForFlaggedPersons() throws IOException {
		
		waitPresenceOfElement("Initial_QC_First_MS");
		z = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Initial_QC_First_MS"))).getText();
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Initial_QC_First_MS"))).click();
		
		
		waitPresenceOfElement("#content_0 td:nth-child(3) table:nth-child(3) tr td font a");
		
		for(int i = 0 ; i <3 ;)
		{
		String element = findElements(By.cssSelector("#content_0 td:nth-child(3)  table:nth-child(3) tr td font a")).get(i).getText();
		System.out.println(element);
		if (element.equalsIgnoreCase("Check for Flagged Persons"))
		{
			findElements(By.cssSelector("#content_0 td:nth-child(3) table:nth-child(3) tr td font a")).get(i).click();
		i=4;
		}
		else {
			i++;
			}
		}
		
		
	} 
	
	
	
	public void checkForDuplicateAccounts() throws IOException {
		
		waitPresenceOfElement("Initial_QC_First_MS");
		z = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Initial_QC_First_MS"))).getText();
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Initial_QC_First_MS"))).click();
		
		
		waitPresenceOfElement("#content_0 td:nth-child(3)  table:nth-child(3) tr td font a");
		for(int i = 0 ; i <3 ;)
		{
		String element = findElements(By.cssSelector("#content_0 td:nth-child(3)  table:nth-child(3) tr td font a")).get(i).getText();
		System.out.println(element);
		if (element.equalsIgnoreCase("Check for Duplicate Accounts"))
		{
			findElements(By.cssSelector("#content_0 td:nth-child(3) table:nth-child(3) tr td font a")).get(i).click();
		i=4;
		}
		else {
			i++;
			}
		}
		
	}


public void checkTaskOfDuplicateMS() throws IOException {
		
		waitPresenceOfElement("Initial_QC_First_MS");
		z = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Initial_QC_First_MS"))).getText();
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Initial_QC_First_MS"))).click();
		
		
		waitPresenceOfElement("#content_0 td:nth-child(3) table:nth-child(3) tr td font a");
		for(int i = 0 ; i <3 ;)
		{
		String element = findElements(By.cssSelector("#content_0 td:nth-child(3)  table:nth-child(3) tr td font a")).get(i).getText();
		System.out.println(element);
		if (element.equalsIgnoreCase("Check for Duplicate Manuscripts"))
		{
			findElements(By.cssSelector("#content_0 td:nth-child(3) table:nth-child(3) tr td font a")).get(i).click();
		i=4;
		}
		else {
			i++;
			}
		}
		
	}

public void displayDetailsPageContent() {
    SleepTime(5000);
	Iterator<WebElement> elements = findElements(By.cssSelector("table.even_odd th")).iterator();
	WebElement item;

	while (elements.hasNext()) {
		item = elements.next();

		theList.add(item.getText());
		System.out.println(item.getText());
	}

	String[] Tablelist = {"Manuscript #","Journal","Current Revision #","Submission Date","Current Stage","Title","Manuscript Type","Corresponding Author","Contributing Author","Abstract","Associate Editor","Editor","Potential Reviewers (assigned)",
			"Reviewers","Author Suggested Reviewers to Include","Author Suggested Reviewers to Exclude","Keywords","Subject Area","Conflict of Interest","Open Access","Applicable Funding Sources","Supplemental Material","Word Count Estimate","Author ORCID Status","CrossCheck Manuscript","AIP Thesaurus Terms"};
	for (int i = 0; i < Tablelist.length; i++) {
		 
		Assert.assertEquals(theList.get(i), Tablelist[i]);
	}

	
}

public void displayOfQcContent() {
	
	SleepTime(5000);
	Iterator<WebElement> elements = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("QC_Table"))).iterator();
	WebElement item;

	while (elements.hasNext()) {
		item = elements.next();

		theList.add(item.getText());
	}

	String[] Tablelist = {" ","Tracking #","Title","Type","Corresponding Author","Associate Editor","Days in Folder","Previous Decision"};
	for (int i = 0; i < Tablelist.length; i++) {
		 
		Assert.assertEquals(theList.get(i), Tablelist[i]);
	}
	
}

public void functionOfQcContent() throws IOException {
	
	SleepTime(5000);
	
	findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("QC_Table"))).get(1).click();
	displaysElement("QC_table_arrows");
	findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("QC_Table"))).get(2).click();
	displaysElement("QC_table_arrows");
	findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("QC_Table"))).get(3).click();
	displaysElement("QC_table_arrows");
	findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("QC_Table"))).get(4).click();
	displaysElement("QC_table_arrows");
	findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("QC_Table"))).get(5).click();
	displaysElement("QC_table_arrows");
}

public void displayOfManuScriptContent() throws IOException {
	
	SleepTime(5000);
	displaysElement("Manuscript_Header");
	
	Iterator<WebElement> elements = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Manuscript_Tabs"))).iterator();
	WebElement item;

	while (elements.hasNext()) {
		item = elements.next();

		theList.add(item.getText());
	}

	String[] Tablelist = {"Details","Files","Tasks","History"};
	for (int i = 0; i < Tablelist.length; i++) {
		 
		Assert.assertEquals(theList.get(i), Tablelist[i]);
	}
	
	
	
}

public void displayUserPageContent() {
	SleepTime(5000);
	
	String[] Tablelist = {"General","Address","Permissions","Person","Pending/Completed","Reviews","Notes","Keywords","Dates","Merge Person"};

	for (int i = 0; i < 4; i++) {
	
		String General = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Change_User_table"))).get(i).getText();
		Assert.assertTrue(General.contains(Tablelist[i]));
	
	
	}

	
}


	
	
	
} 