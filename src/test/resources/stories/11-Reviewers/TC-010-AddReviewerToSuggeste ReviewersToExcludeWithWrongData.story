Scenario: TC-010-Add Reviewer to Suggested Reviewers to Exclude with wrong data

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
And Fill empty to : Exclude_Reviewer_FName
And Fill z to : Exclude_Reviewer_LName
And Fill empty to : Exclude_Reviewer_Email
And Fill empty to : Exclude_Reviewer_Institution
And Fill empty to : Exclude_Comments
And I click on Exclude_SaveHide_Btn
And I click on Next
And I click on Previous
Then The Include_Reviewer_NameError_Msg should be First and Last Names are required.
And The Include_Reviewer_EmailError_Msg should be A valid Email response is required.
And The Include_Reviewer_InstitutionError_Msg should be Institution response is required.
And The Include_Reviewer_CountryError_Msg should be Country response is required.

