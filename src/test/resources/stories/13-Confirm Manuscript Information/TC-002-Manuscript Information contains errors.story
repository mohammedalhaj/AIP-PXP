Scenario: TC-002-Manuscript Information contains errors

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Confirm_Information_Tab
Then The Confirm_Info_Title should be Confirm Manuscript Information
And The Confirm_Info_Message should be This manuscript contains errors. Please correct these errors before submitting the manuscript.
