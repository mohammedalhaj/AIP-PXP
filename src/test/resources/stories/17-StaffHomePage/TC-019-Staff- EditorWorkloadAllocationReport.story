Scenario: TC-019 -Staff Home Page- Verify the functionality of "Editor Workload/Allocation Report" link - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on Editor_Workload/Allocation_Report
Then The View_Workload/Allocation_Btn should display