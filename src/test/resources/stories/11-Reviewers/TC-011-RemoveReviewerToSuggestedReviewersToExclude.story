Scenario: TC-011-Remove Reviewer to Suggested Reviewers to Exclude

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Reviewers_Tab
And The Reviewers_Header should display
And The Reviewers_Header should be Reviewers
And I click on Exclude_Add_Reviewer_btn
And Fill G. to : Exclude_Reviewer_FName
And Fill Alexe to : Exclude_Reviewer_LName
And Fill alexe@ifp.uni-bremen.de to : Exclude_Reviewer_Email
And Fill Universitht Bremen to : Exclude_Reviewer_Institution
And I select Type of Exclude_Reviewer_Country_Germany 
And Fill Exclude Reviewer to : Exclude_Comments
And I click on Exclude_SaveHide_Btn
Then The Exclude_Reviewer_row should display
And I click on Exclude_remove_Btn
Then The None_Assigned_Exclude_Reviewer_Msg should be None assigned.