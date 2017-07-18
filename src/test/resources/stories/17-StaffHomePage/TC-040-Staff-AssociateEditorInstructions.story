Scenario: TC-040 -Staff Home Page- Verify the functionality of "Associate Editor Instructions" link

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on Associate_Editor_Instructions
Then The Associate_Editor_Instructions_Header should be Associate Editor Instructions

