Scenario: TC-015-Verify the function of "Save/Hide" button for "Correspondence Author's" section.

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
And I click on Authors_SaveHide_btn
Then The Authors_Title should Not display
And The Authors_Email should Not display
And The Authors_FName should Not display
And The Authors_MName should Not display
And The Authors_LName should Not display
And The Authors_Institution should Not display
And The Authors_Department should Not display
And The Authors_AddressLine_1 should Not display
And The Authors_AddressLine_2 should Not display
And The Authors_City should Not display
And The Authors_State should Not display
And The Authors_ZipCode should Not display
And The Authors_Country should Not display
And The Authors_WorkPhone should Not display


