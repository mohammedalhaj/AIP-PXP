Scenario: TC-002-Verify "Author's Information" step contents.
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Next
And I click on Next
Then The Author_Information should display
And The Author_Information should be Author Information
And The Email_Lookup should display
And The Corr_Author should display
And The Contributing_Author's_Agreement should display
And The Add_Author_Btn should display
And The Search_Btn should display
And The I_Agree_Checkbox should display

