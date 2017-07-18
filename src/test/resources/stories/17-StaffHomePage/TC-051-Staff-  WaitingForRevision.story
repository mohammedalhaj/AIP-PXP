Scenario: TC-051 -Staff Home Page-Verify the "Waiting for Revision" folder - Associate Editor Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on  AssociateEditorTasks_Waiting_for_Revision
Then The Waiting_for_Revision_Header should be  Waiting for Revision