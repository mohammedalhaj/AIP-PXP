Scenario: TC-013-Find Reviewer button on Suggested Reviewers to Exclude

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
And Fill Alexe to : Exclude_Reviewer_LName
And Fill alexe@ifp.uni-bremen.de to : Exclude_Reviewer_Email
And I click on Exclude_Reviewer_FindReviewer_btn
Then The Find_Exclude_Reviewer_Results should display
And I click on Select_Exclude_Reviewer_Btn