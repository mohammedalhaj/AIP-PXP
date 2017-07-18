Scenario: TC-002-Clicking on "Add Reviewer" button under Suggested Reviewers

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
Then The Include_Reviewer_FName should display
And The Include_Reviewer_LName should display
And The Include_Reviewer_Email should display
And The Include_Reviewer_Institution should display
And The Include_Reviewer_Country should display
And The Include_Reviewer_FindReviewer_btn should display
And The Include_SaveHide_Btn should display
