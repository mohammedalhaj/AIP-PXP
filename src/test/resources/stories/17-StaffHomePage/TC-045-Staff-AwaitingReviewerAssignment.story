Scenario: TC-045 -Staff Home Page-Verify the "Awaiting Reviewer Assignment" folder

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on AssociateEditorTasks_Awaiting_Reviewer_Assignment
Then The Awaiting_Reviewer_Assignment should be Awaiting Reviewer Assignment