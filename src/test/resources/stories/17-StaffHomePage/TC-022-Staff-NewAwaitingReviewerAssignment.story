Scenario: TC-022 -Staff Home Page-Verify the "New Awaiting Reviewer Assignment" folder  - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on New_Awaiting_Reviewer_Assignment
Then The New_Awaiting_Reviewer_Assignment_Header should be New Awaiting Reviewer Assignment