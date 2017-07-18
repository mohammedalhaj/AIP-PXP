Scenario: TC-049 -Staff Home Page-Verify the "Drafting Decision Letter" folder

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on AssociateEditorTasks_Drafting_Decision_Letter
Then The Drafting_Decision_Letter_Header should be Drafting Decision Letter