Scenario: TC-033 -Staff Home Page- Verify the functionality of "Workload Report" link - Editor Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Editor_Tasks should be Editor Tasks
And I click on Editor_Workload_Report
Then The Report_Type should be Report Type

