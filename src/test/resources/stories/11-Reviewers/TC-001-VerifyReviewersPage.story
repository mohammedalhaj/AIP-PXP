Scenario: TC-001-Verify Reviewers Page

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Reviewers_Tab
And The Reviewers_Header should display
Then The Reviewers_Header should be Reviewers
And The Reviewers_Title_msg should be Please enter the information requested below. Required fields are marked with an asterisk
And The Suggested_Reviewers_Table should display
And The Suggested_ReviewersToExclude_Table should display
And The Include_Add_Reviewer_btn should display
And The Exclude_Add_Reviewer_btn should display
And The Next should display
And The Previous should display
