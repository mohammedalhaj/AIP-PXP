Scenario: TC-061 -Staff Home Page-Verify the functionality of "Workload Report" link - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on  StaffTask_Workload_Report
Then The Report_Type should be Report Type

