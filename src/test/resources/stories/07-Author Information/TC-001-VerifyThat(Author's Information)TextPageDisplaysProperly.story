Scenario: TC-001-Verify that "Author's Information" text page displays properly.
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Next
And I click on Next
Then The Author_Information should display
And The Author_Information should be Author Information


