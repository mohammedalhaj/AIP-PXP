Scenario: TC-008 - Verify that "Additional Keywords" option is a mandatory field

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on MS_Classification_Tab
And I click on Next
Then The Wrong_tick should display
And I click on MS_Classification_Tab
And The Keywords_Error should be 1 unique Additional Keywords response is required.