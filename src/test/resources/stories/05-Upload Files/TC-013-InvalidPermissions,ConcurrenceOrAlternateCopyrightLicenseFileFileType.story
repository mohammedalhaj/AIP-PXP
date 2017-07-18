Scenario: TC-013-Verify the "Permissions, Concurrence or Alternate Copyright License File" file type option file types validation
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I upload Audio.mp3 to : Browse
And I click on Upload_Files
And I select Type of Permission_option
And Fill Permission File to : File_Des_Text
Then I click on Save
Then The Invalid_Format_msg should be Invalid file format



