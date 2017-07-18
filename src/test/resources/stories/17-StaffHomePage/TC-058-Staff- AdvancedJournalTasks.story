Scenario: TC-058 -Staff Home Page-Verify the functionality of "Advanced Journal Tasks" link

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Advanced_Journal_Tasks
Then The Advanced_Journal_Tasks_Header should be Advanced Journal Tasks
