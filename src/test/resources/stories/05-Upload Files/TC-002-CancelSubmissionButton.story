Scenario: TC-002-Verify clicking on "Cancel submission" button
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And The Cancel_Submission should display
And I click on Cancel_Submission
And I accept Dialog
Then The Message_Saved_data should be Halted manuscript deleted.