Scenario: TC-043 -Staff Home Page- Verify the functionality of "Find Person" link - Associate Editor Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on AssociateEditorTasks_Find_Person
Then The FirstName should be First Name
