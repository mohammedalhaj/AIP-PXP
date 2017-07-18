Scenario: TC-004-Verify search result window with valid data for "Email lookup" field
 
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
And Fill email@domain.com to : Email_Lookup_TestBox
And I click on Search_Btn
Then The Search_EmailLookup_Results should display