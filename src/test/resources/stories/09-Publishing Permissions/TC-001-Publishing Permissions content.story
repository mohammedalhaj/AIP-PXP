Scenario: TC-001 - Verify the existence of Publishing Permissions content

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Publishing_Permissions_Tab
Then The Publishing_Permissions_Title should be Publishing Permissions
And The Permissions_Message should be Please enter the information requested below.
And The conflict_Title should be Conflict of Interest
And The dual_pub_Title should be Dual Submission/Publication
And The conflict_asterisk should display
And The dual_pub_asterisk should display
And The Next should display
And The Previous should display