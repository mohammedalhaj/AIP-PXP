Scenario: TC-075 -Staff Home Page-Verify the "All Pending Manuscripts" folder -  Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_All_Pending_Manuscriptsn
Then The All_Pending_Manuscriptsn_Header should be All Pending Manuscripts