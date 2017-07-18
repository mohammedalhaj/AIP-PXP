Scenario: TC-008-Verify the "Person's Title" DDL function

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
Then I select Type of Dr
And I select Type of Mr
And I select Type of Ms
And I select Type of Mrs
And I select Type of Miss
And I select Type of Prof
And I select Type of Prof_Dr





