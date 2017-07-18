Scenario: TC-004-Verify uploading and invalid "Figure" file type
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I upload Test.docx to : Browse
And I click on Upload_Files
And I select Type of Figure_option
And Fill 2 to : Figure_Number
And I click on Save
Then The Invalid_Format_msg should be Invalid file format