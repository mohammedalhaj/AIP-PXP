Scenario: TC-052 -Staff Home Page-Verify the "Waiting for Appeal" folder - Associate Editor Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on  EditorTasks_Waiting_for_Appeal
Then The Waiting_for_Appeal_Header should be  Waiting for Appeal