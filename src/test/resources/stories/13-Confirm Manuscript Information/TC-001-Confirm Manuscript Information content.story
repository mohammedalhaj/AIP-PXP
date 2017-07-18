Scenario: TC-001-Confirm Manuscript Information content

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I upload Test.docx to : Browse
And I click on Upload_Files
And I click on Manuscript_File
And I click on Next
And The green_accept should display
And I write Manuscript title to : ManuScript_title
And I write ManuScript Abstract  to : ManuScript_Abstract
And I Fill 1 to : Word_Count_Estimate
And I click on Next
And The Title/Abstract_green_accept should display
And I click on Contributing_Author_Agreement
And I click on Next
And The authorinfo_green_accept should display
And I click on Area_option
And I Fill Auto to : keywords 
And I click on Next
And The classifications_green_accept should display
And I click on conflict_interest
And I click on Dual_Submission
And I click on Next
And The Publishing_Permissions_green_accept should display
And I click on open_access_no
And I click on Next
And The Publication_Charges_green_accept should display
And I click on Next
And The Reviewers_green_accept should display
And I Complete uploading pdf file
And I click on Next
Then The Confirm_Info_Title should be Confirm Manuscript Information
And The Confirm_Info_Message should be Please review the manuscript information below. If everything looks correct, please click "Next" to finalize your submissions.
And The Info_Title should display
And The Info_Abstract should display
And The Info_WordCount should display
And The Info_Significance should display
And The Info_RelatedManuscript should display
And The Info_Author should display
And The Info_Contributing should display
And The Info_Subject should display
And The Info_Keywords should display
And The Info_conflict should display
And The Info_Access should display
And The separators should display
And The Next should display
And The Previous should display