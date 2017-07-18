Scenario: TC-047 -Staff Home Page-Verify the "Under Review" folder - Associate Editor Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on AssociateEditorTasks_Under_Review
Then The Under_Review_Header should be Under Review