Scenario: TC-001- Editor Workload/Allocation Report

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Editor_Workload_Report
And I click on Summary_Report
And I Select Associate Editor
And I click on View_Workload_btn
Then Summary reports page should display