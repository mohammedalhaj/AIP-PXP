Scenario: TC-008-Find Reviewer button on Suggested Reviewers

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
And Fill Alexe to : Include_Reviewer_LName
And Fill alexe@ifp.uni-bremen.de to : Include_Reviewer_Email
And I click on Include_Reviewer_FindReviewer_btn
Then The Find_Include_Reviewer_Results should display
And I click on Select_Include_Reviewer_Btn