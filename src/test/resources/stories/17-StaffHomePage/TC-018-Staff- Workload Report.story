Scenario: TC-018 -Staff Home Page- Verify the functionality of "Workload Report" link - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on Workload_Report
Then The Report_Type should be Report Type
