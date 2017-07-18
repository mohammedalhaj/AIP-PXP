Scenario: TC-006 - Verify the existence of "Additional Keywords" option 

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on MS_Classification_Tab
Then The Additional_Keywords should display
