Scenario: TC-006-Verify Clicking on "Find Person's" button when entering (First) name field only

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Next
And I click on Next
And The Author_Information should display
And The Author_Information should be Author Information
And I click on Find_Author
Then The Search_Find_Author_Results should display


