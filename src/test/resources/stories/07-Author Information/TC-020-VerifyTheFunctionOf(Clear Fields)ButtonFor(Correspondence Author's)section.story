Scenario: TC-020-Verify the function of "Clear Fields" button for "Correspondence Author's" section.

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
And I click on Authors1_Clear_btn
Then The Authors_FName Textbox sould be empty
And The Authors_MName Textbox sould be empty
And The Authors_LName Textbox sould be empty
And The Authors_Email Textbox sould be empty
And The Authors_Institution Textbox sould be empty
And The Authors_Department Textbox sould be empty
And The Authors_AddressLine_1 Textbox sould be empty
And The Authors_AddressLine_2 Textbox sould be empty
And The Authors_City Textbox sould be empty
And The Authors_State Textbox sould be empty
And The Authors_ZipCode Textbox sould be empty
And The Authors_WorkPhone Textbox sould be empty




