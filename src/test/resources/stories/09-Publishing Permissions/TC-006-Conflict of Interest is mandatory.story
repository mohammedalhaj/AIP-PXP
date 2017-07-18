Scenario: TC-006 - Verify that "Conflict of Interest" option is a mandatory field

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Publishing_Permissions_Tab
And I click on Next
Then The Wrong_tick_Permissions should display
And I click on Publishing_Permissions_Tab
And The conflict_error should be Conflict of Interest response is required.


