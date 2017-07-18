Scenario: TC-002 - Verify the existence of "Please enter the information" Sentence

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on MS_Classification_Tab
Then The Classification_Message should be Please enter the information requested below. Required fields are marked with an asterisk

