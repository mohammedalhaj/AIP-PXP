Scenario: TC-016-Verify the function of "Remove" button for "Correspondence Author's" section.

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
And I click on Authors_Remove_btn
Then The None_Assigned_Msg should be None assigned.



