Scenario: TC-005-"Verify the "Correspondence Author's" table contents

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
Then The Corr_Author should display
And The Authors_Title should display
And The Authors_FName should display
And The Authors_MName should display
And The Authors_LName should display
And The Find_Author should display
And The Authors_Email should display
And The Authors_Institution should display
And The Authors_Department should display
And The Authors_AddressLine_1 should display
And The Authors_AddressLine_2 should display
And The Authors_City should display
And The Authors_State should display
And The Authors_ZipCode should display
And The Authors_Country should display
And The Authors_WorkPhone should display

