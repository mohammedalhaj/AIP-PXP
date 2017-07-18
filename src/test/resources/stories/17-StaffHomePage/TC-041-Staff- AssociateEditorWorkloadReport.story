Scenario: TC-041 -Staff Home Page- Verify the functionality of "Associate Editor Workload Report" link

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The AssociateEditorTasks should be Associate Editor Tasks
And I click on Associate_Editor_Workload_Report
Then The Report_Type should be Report Type
