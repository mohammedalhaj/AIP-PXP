Scenario: TC-003- Upload file-Verify clicking on cancel button on related "Figure Number" field of "Figure" file type
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I upload Figure.jpg to : Browse
And I click on Upload_Files
And I select Type of Figure_option
And Fill 2 to : Figure_Number
Then I click on Cancel_After_upload
