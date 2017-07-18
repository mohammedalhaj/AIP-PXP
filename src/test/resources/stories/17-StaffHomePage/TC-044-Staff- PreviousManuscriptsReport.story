Scenario: TC-044 -Staff Home Page- Verify the functionality of "Previous Manuscripts Report" link

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on Previous_Manuscripts_Report
Then The Previous_Manuscripts_Report_Header should be Previous Manuscripts Report
