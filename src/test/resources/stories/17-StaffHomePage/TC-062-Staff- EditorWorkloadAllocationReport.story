Scenario: TC-062 -Staff Home Page-Verify the functionality of "Editor Workload/Allocation Report" link - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Editor_Workload/Allocation_Report
Then The View_Workload/Allocation_Btn should display