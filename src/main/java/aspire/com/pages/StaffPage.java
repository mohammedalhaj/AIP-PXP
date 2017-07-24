package aspire.com.pages;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jbehave.web.selenium.WebDriverProvider;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import jo.aspire.automation.logger.EnvirommentManager;


public class StaffPage extends StepsPage {

	public StaffPage(WebDriverProvider webDriverProvider) {
		super(webDriverProvider);
	}

	String Title = "";
	public static String z;

	public void displaysStaffReportsPage() {
       
		String Title = findElement(By.cssSelector(".dt_heading_row td font")).getText();
		org.junit.Assert.assertTrue(Title.equals("Reports"));

	}

	public void displaysChasersReportsPage() throws IOException {
		waitPresenceOfElement("Title_Msg");
		String Title = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Title_Msg"))).getText();
        org.junit.Assert.assertTrue(Title.equals("One or more workflow actions below are possible or appropriate. Please consider proceeding by using a link next to an arrow"));
		findElements(By.cssSelector("td table tr th"));

		String ChasersList[] = { "Chase Editors", "Chase Associate Editors",
				"Chase Authors", "Chase Reviewers" };

		for (int i = 0; i < 4; i++) {
			String List = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("List"))).get(i).getText();
			org.junit.Assert.assertTrue(List.contains(ChasersList[i]));

		}

	}

	public void displaysManageAccountPage() throws Exception {
		waitPresenceOfElement("Staff_Manage_Accounts_Title");
		String Title = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Staff_Manage_Accounts_Title"))).getText();
		org.junit.Assert.assertTrue(Title.equals("Manage Accounts"));
		String ChasersList[] = { "Add Person", "Merge Person", "Change User / Profile / Password / Security / Salutation",
				"Manage Editor Assignment by Top Subject Area","Manage Associate Editor Assignment by Top Subject Area"};
		for (int i = 0; i < 4; i++) {
			String List = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("List"))).get(i).getText();
			org.junit.Assert.assertTrue(List.contains(ChasersList[i]));

		}
	}

	public void displaysAdvancedManuscriptPage() throws IOException {
		waitPresenceOfElement("Advanced_Manuscript_Tasks_Title");
		String Title = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(
						"Advanced_Manuscript_Tasks_Title"))).getText();
		org.junit.Assert.assertTrue(Title.equals("Manuscript #:"));
		displaysElement("AMT_FAQ");
		

	}




	public void searchForManuscriptAsStaff() throws IOException {
	
		clickOnElement("Staff_Editor_option");
		clickOnElement("Staff_Manuscript_Type");
		clickOnElement("Search");

		Title = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Title_Msg"))).getText();
		try {
			org.junit.Assert.assertTrue(Title.equals("Search Results"));
		} catch (Exception e) {
			org.junit.Assert.assertTrue(Title.equals("No manuscripts found."));
		}

	}

	public void searchCategoryForManuscriptAsStaff() throws IOException  {
		clickOnElement("Category_Search");
		waitPresenceOfElement("Title_Msg");
		Title = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Title_Msg"))).getText();
		org.junit.Assert.assertTrue(Title.equals("Search Results"));

	}

	/*public void selectAManuscript() {
		z = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Manuscript_Tracking"))).getText();
		
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Manuscript_Tracking"))).click();

	}
	*/
	public void acceptFromReviewrUser() throws IOException {
	 
	waitPresenceOfElement("ReviewersList");
	Iterator<WebElement> links = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("ReviewersList"))).iterator();
	WebElement item;
	while (links.hasNext()) {
			item = links.next();
			if (item.getText().toString().equalsIgnoreCase("K. V. Adarsh #1")) {
				item.click();                             
				break;
			}
		}
		
		
		browserTabs = new ArrayList<String>(getWindowHandles());
		switchTo().window(browserTabs.get(2));
		clickOnElement("Change_User");
		
		waitPresenceOfElement("MS_Reviewer_Tasks");
		Iterator<WebElement> links1 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("MS_Reviewer_Tasks")))
				.iterator();
		WebElement item1;
		while (links1.hasNext()) {
				item1 = links1.next();
				if (item1.getText().toString().contains(z)) {
					item1.click();
					break;
				}
			}
        
		try {
			WaitDOMToBeReady();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		waitPresenceOfElement("Review_MS_link");
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Review_MS_link"))).click();
	
		try {
			clickOnElement("Submit_Review");
			
		} catch (Exception e) {
			
		}
		clickOnElement("Publish_as_is");
		clickOnElement("Finalize_Review_btn");
		clickOnElement("Confirm_Submit_Review_btn");
		clickOnElement("Revert_Original_Login");
	
	

	}

	public void clickInitialQcManuscript() throws IOException {
		waitPresenceOfElement("Initial_QC_First_MS");
		
		z = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Initial_QC_First_MS"))).getText();
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Initial_QC_First_MS"))).click();
		clickOnAnElement("Task_tab");
		
	}

	public void selectSendAllEmails() throws IOException {

		waitPresenceOfElement("Emails_Auth");
		for (int i = 0; i < 20;) {
			String element = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Emails_Auth"))).get(i).getText();
			if (element.equalsIgnoreCase("Send All Emails to Authors")) {
				findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Emails_Auth"))).get(i).click();
				i = 22;
			} else {
				i++;
			}
		}

	}

	public void displaysMSWaitingForProduction() {

		String Message4 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Production_msg"))).get(3).getText();
		org.junit.Assert.assertEquals(Message4, "Submitted");
		
		String Message5 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Production_msg"))).get(4).getText();
		org.junit.Assert.assertEquals(Message5, "Revised");
		
		String Message6 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Production_msg"))).get(5).getText();
		org.junit.Assert.assertEquals(Message6, "Accepted");

	}
	
	
	public void rejectMS(String element) throws IOException {
	
	waitPresenceOfElement("table.dump_ms_details tr td a");
	Iterator<WebElement> links = findElements(By.cssSelector("table.dump_ms_details tr td a")).iterator();
	WebElement item;
	while (links.hasNext()) {
			item = links.next();
			if (item.getText().toString().equalsIgnoreCase("K. V. Adarsh #1")) {
				item.click();
				break;
			}
		}
	 SleepTime(5000);
		browserTabs = new ArrayList<String>(getWindowHandles());
	    switchTo().window(browserTabs.get(2));
	    clickOnElement("Change_User");
	
	    try {
			WaitDOMToBeReady();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    waitPresenceOfElement("MS_Reviewer_Tasks");
		Iterator<WebElement> links1 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("MS_Reviewer_Tasks"))).iterator();
		WebElement item1;
		while (links1.hasNext()) {
				item1 = links1.next();
				if (item1.getText().toString().contains(z)) {
					item1.click();
					break;
				}
			}
		 try {
				WaitDOMToBeReady();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    waitPresenceOfElement("Review_MS_link");
		    findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Review_MS_link"))).click();
		    try {
				WaitDOMToBeReady();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    waitPresenceOfElement("Submit_Review");
		try {
			clickOnElement("Submit_Review");
		
		} catch (Exception e) {}
		
		clickOnElement(element);
		waitPresenceOfElement("Finalize_Review_btn");
		clickOnElement("Finalize_Review_btn");
	    clickOnElement("Confirm_Submit_Review_btn");
	    clickOnElement("Revert_Original_Login");
		

		
	}

	public void rejectMSFromAssociateEditor() throws IOException {
		 try {
				WaitDOMToBeReady();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		waitPresenceOfElement("table tbody tr:nth-child(3) td:nth-child(2) font a");
		findElements(By.cssSelector("table tbody tr:nth-child(3) td:nth-child(2) font a")).get(1).click();
		waitPresenceOfElement("Reject");
		clickOnElement("Reject");
        clickOnElement("decision_reject");
        clickOnElement("Submit_Dec");
		
	}
	
	
	public void optionalRevisionMSFromAssociateEditor(String element, String secondElement) throws IOException {
		waitPresenceOfElement("table tbody tr:nth-child(3) td:nth-child(2) font a");
		findElements(By.cssSelector("table tbody tr:nth-child(3) td:nth-child(2) font a")).get(1).click();
		waitPresenceOfElement(element);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).click();
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(secondElement))).click();
		clickOnElement("Submit_Dec");
		
	
		
	}



  public void clickRecommendAnotherJournal () throws IOException {
	  waitPresenceOfElement("table tbody tr:nth-child(3) td:nth-child(2) font a");
	  findElements(By.cssSelector("table tbody tr:nth-child(3) td:nth-child(2) font a")).get(1).click();
	  waitPresenceOfElement("Recommend_another_journal_Editor");
	  clickOnElement("Recommend_another_journal_Editor");
	  clickOnElement("Recommend_another_journal_Editor_Reason");
	  findElement(By.cssSelector("#suggested_journal_for_referral_transfer option:nth-child(2)")).click();
      clickOnElement("Submit_Dec");

		
	}

 public void verifyCheckManuscriptStatusPage() throws IOException {
	
	  
	    String[] Tablelist = {"Manuscript #","Manuscript Title *","Corresponding Author Name","Contributing Author Name","Editor","Associate Editor","Manuscript Type:","Reviewer Name","Decision","Sticky Note Color"};
	
	    for (int i = 0; i < Tablelist.length; i++) {
	    
	   if(findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Manuscript_Status_Content"))).get(i).getTagName().toLowerCase().equals("tr"))
	    {
    	String List = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Manuscript_Status_Content"))).get(i).getText();

        org.junit.Assert.assertEquals(List,Tablelist[i]);
		}
	   
	   
		displaysElement("exclude");
		displaysElement("Search_btn");
		displaysElement("select_list");
		displaysElement("Category_Search");
}
	
}

public void verifyTheContentOfFindPersonPage() throws IOException {
	 try {
		WaitDOMToBeReady();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 waitPresenceOfElement("find_person_content");
	 String[] Tablelist = {"First Name","Last Name","ORCID ID","User Login","Address","City","State/Province","Zip/Postal Code","Country","Institution","Telephone Number","Email","Role","Area of Expertise","Person Tags","Show Inactive Accounts in Search?","Show Merged Accounts in Search?","Show Deceased Accounts in Search?"};
	 for (int i = 0; i < Tablelist.length; i++) {
		
     String List = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("find_person_content"))).get(i).getText();
		        org.junit.Assert.assertEquals(List,Tablelist[i]);
				}

		displaysElement("Find_Person_btn");
		displaysElement("Merge_Person_btn");
		displaysElement("Add_Person_btn");
		displaysElement("Clear_Form_btn");

	
}

public void verifyTheContentOfWorkloadReportPage() throws IOException {
	
	 try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 waitPresenceOfElement("Workload_Report_content");
	 String[] Tablelist = {"Report Type","Manuscript Range","Sort by","Associate Editor"};
	 for (int i = 0; i < Tablelist.length; i++) {
		
    String List = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Workload_Report_content"))).get(i).getText(); 
		        org.junit.Assert.assertEquals(List,Tablelist[i]);
				}

		displaysElement("Summary_Report");
		displaysElement("Detailed_Report");
		displaysElement("Active_Manuscripts");
		displaysElement("awaiting_rev");
		
		displaysElement("MS_Associate_Editor");
		displaysElement("MS_stage");
		displaysElement("MS_Tracking_btn");
		displaysElement("View_Workload_btn");
		
		
}

public void verifyTheContentOfAllocationReportPage() throws IOException {
	
	String Message = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("select_Editors_Msg"))).getText();
 	org.junit.Assert.assertEquals(Message,"Please select Editors from the list below.");

	displaysElement("Editor_table");
	displaysElement("View_Workloads_Allocations_btn");
	
}

public void fillMSID() throws IOException {
	waitPresenceOfElement("MS_ID");
	findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("MS_ID"))).sendKeys(z);
}

 public void displayCorrectionPageContent() throws IOException {
	Iterator<WebElement> elements = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Correction_table"))).iterator();
	WebElement item;

	while (elements.hasNext()) {
		item = elements.next();

		theList.add(item.getText());
	}

	String[] Tablelist = {"Object","Object Type","Source File name","Converted File Name","Document Type","Convsersion Status","Request Date","Start Date","End Date","Reconversion Application"};
	
	for (int i = 0; i < Tablelist.length; i++) {
	
		Assert.assertTrue(theList.get(i).contains(Tablelist[i]));
	}
	
	displaysElement("Conversion_History");
	
}

public void selectUploadFileUnderMSitem() {
	findElement(By.cssSelector(("a[href*='cgi-bin/main.plex?form_type=upload_pdf_file']"))).click();

	
}

public void displayingAdvancedManuscriptPage() throws Exception {
	
	Iterator<WebElement> elements = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Advanced_Table"))).iterator();
	WebElement item;

	while (elements.hasNext()) {
		item = elements.next();

		theList.add(item.getText());
		System.out.println(theList);
		
	}

	String[] Tablelist = {"Manuscript #","Journal","Current Stage","Title","Keywords","Corresponding Author","Contributing Author","Abstract","Manuscript Type","Submission Date"};
	                    
                
	
	for (int i = 0; i < Tablelist.length; i++) {
	
		Assert.assertTrue(theList.get(i).contains(Tablelist[i]));
	}
	
	displaysElement("amt_links_table");
	
	
	
	
}

       public boolean elementDoesnNotDisplay(String element){
    	   boolean x=true;
    	    x =  findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).isDisplayed();
    	
    	   if(!x){
    		   
    		  
    	   }
    	   return true;  
       }

}