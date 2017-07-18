Scenario: TC-002- Editor Workload Report - Detailed Report

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Editor_Workload_Report
And I click on Detailed_Report
And I Select Associate Editor
And I click on View_Workload_btn
Then Detailed Report page should display
