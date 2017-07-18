Scenario: TC-011 - Verify clicking on "Previous" button

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on MS_Classification_Tab
And I click on Previous
Then The Author_Information_Title should be Author Information
