Scenario: TC-060 -Staff Home Page-Verify the functionality of "Reports" link

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Reports
Then The Reports_Header should be Reports
