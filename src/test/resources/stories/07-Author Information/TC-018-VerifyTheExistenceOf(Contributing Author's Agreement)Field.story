Scenario: TC-018 - Verify the existence And Function of "Contributing Author's Agreement" field


Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Next
And I click on Next
Then The Contributing_Author_Agreement should display
And I click on Contributing_Author_Agreement