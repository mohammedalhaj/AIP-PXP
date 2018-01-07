Scenario: TC-005- Upload file-Verify uploading and invalid files for "Manuscript" type
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I upload Figure.jpg to : Browse
And I click on Upload_Files
And I select Type of Manuscript_File
Then The Invalid_Format_msg should be Invalid file format