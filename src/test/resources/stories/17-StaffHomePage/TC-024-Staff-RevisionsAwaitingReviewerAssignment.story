Scenario: TC-024 -Staff Home Page-Verify the "Revisions Awaiting Reviewer Assignment" folder  - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on Revisions_Awaiting_Reviewer_Assignment
Then The Revisions_Awaiting_Reviewer_Assignment_Header should be Revisions Awaiting Reviewer Assignment