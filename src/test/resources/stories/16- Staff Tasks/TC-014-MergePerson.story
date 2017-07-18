Scenario:  TC-014 - Staff - Manage Accounts - Merge Person

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Manage_Accounts
And I click on Merge_Person_link
And I Merge Person
Then The Mearge_Title should be Merged
