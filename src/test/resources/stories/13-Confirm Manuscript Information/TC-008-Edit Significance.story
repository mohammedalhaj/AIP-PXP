Scenario: TC-008-Edit Significance

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
And I write Manuscript title to : ManuScript_title
And I write ManuScript Abstract  to : ManuScript_Abstract
And I Fill 1 to : Word_Count_Estimate
And I click on Next
And I click on Contributing_Author_Agreement
And I click on Next
And I click on Area_option
And I Fill Auto to : keywords 
And I click on Next
And I click on conflict_interest
And I click on Dual_Submission
And I click on Next
And I click on open_access_no
And I click on Next
And I click on Next
And I Complete uploading pdf file
And I click on Next
And I click on Edit_Significance
Then The title_Page should be Title/Abstract



















 