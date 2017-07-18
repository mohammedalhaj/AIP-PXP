Scenario: TC-046 -Staff Home Page-Verify the "Contact Potential Reviewer " folder

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on AssociateEditorTasks_Contact_Potential_Reviewer
Then The Contact_Potential_Reviewer should be Contact Potential Reviewer