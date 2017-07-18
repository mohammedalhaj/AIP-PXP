Scenario: TC-004 - Verify the Conflict of Interest option

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Publishing_Permissions_Tab
Then The conflicts_Options_no should display
Then The conflicts_Options_yes should display
