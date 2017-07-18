Scenario: TC-019-Verify Clicking on "Find Person's" button when entering with incorrect data

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
And Fill xxx to : Authors_LName
And I click on Find_Author
And The Search_Find_Author_Results should display
And The No_Matches_Found_Msg should be No matches found




