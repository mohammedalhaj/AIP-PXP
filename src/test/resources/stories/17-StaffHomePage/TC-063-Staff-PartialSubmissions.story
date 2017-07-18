Scenario: TC-063 -Staff Home Page-Verify the "Partial Submissions " folder

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Partial_Submissions
Then The Partial_Submissions_Header should be Partial Submissions 