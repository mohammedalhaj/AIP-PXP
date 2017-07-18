Scenario: TC-027 - Verify clicking on "Next" button

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Next
And I click on Next
Then The MS_Classification_Title should display
