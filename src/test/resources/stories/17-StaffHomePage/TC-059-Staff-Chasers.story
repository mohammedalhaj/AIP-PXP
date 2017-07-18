Scenario: TC-059 -Staff Home Page-Verify the functionality of "Chasers" link

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Chasers
Then The Chasers_Header should be Chasers
