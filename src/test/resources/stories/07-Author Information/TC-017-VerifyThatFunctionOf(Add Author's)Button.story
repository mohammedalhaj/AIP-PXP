Scenario: TC-017-Verify the function of "Add Author's" button

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
And I click on Add_Author_Btn
And I select Type of Dr
And Fill FName to : Authors2_FName
And Fill MName to : Authors2_MName
And Fill LName to : Authors2_LName
And Fill email@domain-one.com to : Authors2_Email
And Fill Institution to : Authors2_Institution
And I select Type of US_option
And I click on Authors2_SaveHide_btn
Then The Second_Author should display





