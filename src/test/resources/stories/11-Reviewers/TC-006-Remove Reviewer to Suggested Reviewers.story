Scenario: TC-006-Remove Reviewer to Suggested Reviewers

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
And I click on Include_Add_Reviewer_btn
And Fill G. to : Include_Reviewer_FName
And Fill Alexe to : Include_Reviewer_LName
And Fill alexe@ifp.uni-bremen.de to : Include_Reviewer_Email
And Fill Universitht Bremen to : Include_Reviewer_Institution
And I select Type of Include_Reviewer_Country_Germany
And I click on Include_SaveHide_Btn
And The Include_Reviewer_row should display
And I click on Include_remove_Btn
Then The None_Assigned_Include_Reviewer_Msg should be None assigned.