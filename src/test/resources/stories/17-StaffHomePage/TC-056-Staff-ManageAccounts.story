Scenario: TC-056 -Staff Home Page-Verify the functionality of "Manage Accounts" link

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Manage_Accounts
Then The Manage_Accounts_Header should be Manage Accounts
